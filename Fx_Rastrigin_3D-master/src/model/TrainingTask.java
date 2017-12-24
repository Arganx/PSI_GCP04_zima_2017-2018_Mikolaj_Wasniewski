package model;

import javafx.application.Platform;
import javafx.scene.chart.XYChart;

/**
 * Created by qwerty on 17-Dec-17.
 */
public class TrainingTask implements Runnable {

    int N;

    private int number_of_layers;
    private int[] number_of_neurons_in_layer;
    private Changer changer;
    XYChart.Series series;
    XYChart.Series mseSeries;

    public TrainingTask(int n, int number_of_layers, int[] number_of_neurons_in_layer,Changer changer,XYChart.Series series, XYChart.Series mse) {
        N = n;
        this.number_of_layers = number_of_layers;
        this.number_of_neurons_in_layer = number_of_neurons_in_layer;
        this.changer=changer;
        this.series=series;
        this.mseSeries=mse;
    }

    @Override
    public void run() {
            int numberoftrainings = 90000;
            Network network = new Network(number_of_layers,number_of_neurons_in_layer,2);
            TestData[] testData = new TestData[N];
            for(int i=0;i<N;i++)
            {
                testData[i]=new TestData();
            }

            Integer result =0;
            int trening_counter =0;
            int helper =0;
            double mseError=0;
            for(;;) {
                trening_counter++;
                for (int i = 0; i < N; i++) {
                    result+=network.train(testData[i].getTab(), changer.from_normal_to_01(testData[i].getResult()));
                    mseError+=Math.pow(changer.from_01_to_normal(network.guess(testData[i].getTab()))-testData[i].getResult(),2);
                }
                mseError/=N;

                    int finalTrening_counter = trening_counter;
                    double finalMseError = mseError;
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            mseSeries.getData().add(new XYChart.Data(finalTrening_counter, finalMseError));
                            System.out.println("Blad MSE: " + finalMseError);
                        }
                    });

                mseError=0;
                if(result==N)
                {
                    break;
                }
                result=0;

                helper++;
                if(helper==50) {
                    helper=0;
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            series.getData().remove(0,series.getData().size());
                            for (int i = 0; i < N; i++) {

                                series.getData().add(new XYChart.Data(testData[i].getResult(), changer.from_01_to_normal(network.guess(testData[i].getTab()))));
                            }
                        }
                    });
                }

            }

            System.out.println("Nauczono w " + trening_counter + " treningach");
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                series.getData().remove(0,series.getData().size());
                for (int i = 0; i < N; i++) {

                    System.out.println("Co mialo wyjsc: " + testData[i].getResult());
                    System.out.println("Co wyszlo: " + changer.from_01_to_normal(network.guess(testData[i].getTab())));
                    series.getData().add(new XYChart.Data(testData[i].getResult(), changer.from_01_to_normal(network.guess(testData[i].getTab()))));
                }
            }
        });
        Test test = new Test();
        test.test1000(network);



    }
}
