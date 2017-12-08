package mypackage;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by qwerty on 17-Oct-17.
 */
public class Perceptron {
    private Double[] weights;   //Wagi poszczególnych wejść
    private Double biasweight;  //waga dodatkowego wejści bias
    private Double lr = new Double(0.01);   //współczynnik uczenia

    public Double getLr() {
        return lr;
    }

    public void setLr(Double lr) {
        this.lr = lr;
    }

    private int activation(Double sum)  //funkcja aktywacyjna (0,1)
    {
        if(sum<0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    Perceptron()//konstruktor potrzebny do dziedziczenia Adaline
    {

    }
    Perceptron(int size)   //konstruktor jak argument przyjmuje ilość wejść do Perceptronu
    {
        weights = new Double[size];
        for(int i=0;i<weights.length;i++) {
            weights[i] = ThreadLocalRandom.current().nextDouble(-1, 1);
        }
        biasweight=ThreadLocalRandom.current().nextDouble(-1, 1);
    }

    public void show()  //pokazanie wszystkich informacji o perceptronie
    {
        for(int i=0;i<weights.length;i++) {
            System.out.println(weights[i]);
        }
        System.out.println(biasweight);
    }

    public int guess(int[] inputs)  //Funkcja przepuszcza dane wejściowe przez perceptron i zwracająca wynik
    {
        Double sum= 0.0;
        for(int i=0;i<weights.length;i++)
        {
            sum+=inputs[i]*weights[i];
        }
        sum+=biasweight;
        int out = activation(sum);
        return out;
    }

    public void train(int[] input, int target)  //funkcja trenująca przyjmuje wartości wejść oraz oczekiwany wynik perceptronu
    {

        double guess =guess(input);
        double error = (double)target - guess;

        for(int i=0;i<weights.length;i++)
        {
            weights[i]+=error*input[i]*lr;
        }
        biasweight+=error*lr;

    }
}
