package pack;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by qwerty on 17-Oct-17.
 */
public class Neuron {
    private double[] weights;
    private double biasweight;
    private double lr = 0.2;       //współczynnik nauki
    private double fr = 0.5;    //współczynnik zapominania

    public double getLr() {
        return lr;
    }

    public double getBiasweight() {
        return biasweight;
    }

    public void setBiasweight(Double biasweight) {
        this.biasweight = biasweight;
    }

    public double get_weight(int weight_number)
    {
        return weights[weight_number];
    }

    public void setWeights(double[] weights) {
        this.weights = weights;
    }

    public double[] getWeights() {
        return weights;
    }

    public void setLr(Double lr) {
        this.lr = lr;
    }

    private double activation(Double sum)
    {
        return sum;
    }


    Neuron(int size)
    {
        weights = new double[size];
        for(int i=0;i<weights.length;i++) {
            weights[i] = ThreadLocalRandom.current().nextDouble(-0.1, 0.1);
        }
        biasweight=ThreadLocalRandom.current().nextDouble(-0.1, 0.1);
    }

    public void show()
    {
        for(int i=0;i<weights.length;i++) {
            System.out.println(weights[i]);
        }
        System.out.println(biasweight);
    }


    public double sum(int[] inputs)
    {
        Double sum= 0.0;
        for(int i=0;i<weights.length;i++)
        {
            sum+=inputs[i]*weights[i];
        }
        sum+=biasweight;
        return sum;
    }

    public Double guess(int[] inputs)    //mozna podac wiecej wejsc niz rozmiar neuronu ale nie beda one uwzgledniane
    {
        Double sum= 0.0;
        for(int i=0;i<weights.length;i++)
        {
            sum+=(double)inputs[i]*weights[i];
        }
        sum+=biasweight;
        Double out = activation(sum);

        return out;
    }

    public void trainforget(int[] input, Double target) //Funkcja trenująca z zapominaniem
    {

        for(int i=0;i<weights.length;i++)
        {
            weights[i]=(1-fr)*weights[i]+lr*target*input[i];
            //System.out.println(weights[i]);
        }
        biasweight=(1-fr)*biasweight+lr*target;

    }

    public void train(int[] input, Double target)
    {
        for(int i=0;i<weights.length;i++)
        {
            weights[i]=weights[i]+lr*target*input[i];
        }
        biasweight=biasweight+lr*target;

    }

    public void train_noTeacher(int[] input)
    {
        double res = guess(input);
        for(int i=0;i<weights.length;i++)
        {
            weights[i]=weights[i]+lr*res*input[i];
        }
        biasweight=biasweight+lr*res;

    }

    public void trainforget_noTeacher(int[] input)
    {
        double res = guess(input);
        for(int i=0;i<weights.length;i++)
        {
            weights[i]=(1-fr)*weights[i]+lr*res*input[i];
            //System.out.println(weights[i]);
        }
        biasweight=(1-fr)*biasweight+lr*res;

    }
}
