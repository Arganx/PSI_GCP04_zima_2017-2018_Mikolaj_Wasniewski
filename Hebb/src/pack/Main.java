package pack;


//Dla wersji z nauczycielem liczba epok nie ma znaczenia

public class Main {


    public static double[] guess(Neuron neurons[],int[] data)
    {
        double tab[] = new double[neurons.length];
        for(int i=0;i<neurons.length;i++)
        {
            tab[i]=neurons[i].guess(data);
        }
        return  tab;
    }

    public static void teacher_learn()
    {
        Data data = new Data();

        Neuron neurons[] = new Neuron[4];

        for(int i=0;i<4;i++)
        {
            neurons[i]=new Neuron(64);
        }

        for(int i=0;i<100;i++)//trening 10 razy
        {


            //Wszystkie trenuja wszystko
/*            for(int j=0;j<4;j++)
            {
                for(int k=0;k<4;k++) {
                    if(k==j) {
                        neurons[j].trainforget(data.getTab()[k], 1.);
                    }
                    else
                    {
                        neurons[j].trainforget(data.getTab()[k], 0.);
                    }
                }
            }*/

            //Kazdy trenuje tylko swojego
            for(int j=0;j<4;j++)
            {
                neurons[j].trainforget(data.getTab()[j],1.);
            }

        }

        double[] result = guess(neurons,data.getTab()[0]);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {

        Data data = new Data();

        Neuron neurons[] = new Neuron[4];

        for(int i=0;i<4;i++)
        {
            neurons[i]=new Neuron(64);
        }

        for(int i=0;i<5000;i++)//trening 10 razy
        {


            //Wszystkie trenuja wszystko
/*            for(int j=0;j<4;j++)
            {
                for(int k=0;k<4;k++) {
                    if(k==j) {
                        neurons[j].trainforget(data.getTab()[k], 1.);
                    }
                    else
                    {
                        neurons[j].trainforget(data.getTab()[k], 0.);
                    }
                }
            }*/

            //Kazdy trenuje tylko swojego
            for(int j=0;j<4;j++)
            {
                neurons[j].trainforget(data.getTab()[j],1.);
            }

        }

        double[] result = guess(neurons,data.getTab()[0]);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
        Tests tests = new Tests();
        tests.learnTest(neurons);
        tests.strangeTest(neurons);
        tests.otherTest(neurons);
        tests.pixel3Test(neurons);
        tests.pixel5Test(neurons);
    }


}
