package pack;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by qwerty on 17-Oct-17.
 */
public class Neuron {
    private double[] weights;
    //private Double biasweight;
    private Double lr = new Double(0.5);

    public Double getLr() {
        return lr;
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
            weights[i] = ThreadLocalRandom.current().nextDouble(-1., 1.);   //Ze wzrostem roznicy wag wzrasta liczba wygrywajacych neuronow
        }
        //biasweight= ThreadLocalRandom.current().nextDouble(-0.1, 0.1);
    }

    public void show()
    {
        for(int i=0;i<weights.length;i++) {
            System.out.println(weights[i]);
        }
        //System.out.println(biasweight);
    }

    public Double guess(int[] inputs)
    {
        Double sum= 0.0;
        for(int i=0;i<weights.length;i++)
        {
            sum+=inputs[i]*weights[i];
        }
        //sum+=biasweight;
        Double out = activation(sum);
        return out;
    }

    public Double guessdouble(double[] inputs)
    {
        Double sum= 0.0;
        for(int i=0;i<weights.length;i++)
        {
            sum+=inputs[i]*weights[i];
        }
        //sum+=biasweight;
        Double out = activation(sum);
        return out;
    }

    public void train(int[] input, double target)
    {

        double guess =guess(input);
        double error = target - guess;

        for(int i=0;i<weights.length;i++)
        {
            weights[i]+=error*input[i]*lr;
        }
        //biasweight+=error*lr;

    }

    public void traindouble(double[] input, double target)
    {

        double guess =guessdouble(input);
        double error = target - guess;

        for(int i=0;i<weights.length;i++)
        {
            weights[i]+=error*input[i]*lr;
        }
        //biasweight+=error*lr;

    }

    public void change_weights(double[] inputs,double rate) throws TablesDoesntMatchException
    {
        if(inputs.length!=weights.length)
        {
            throw new TablesDoesntMatchException("Liczba wejść do modyfikacji wag nie zgadza się z liczbą wag");
        }
        for(int i=0;i<weights.length;i++)
        {
            //System.out.println("Waga zmodyfikowana o: "+ rate*(inputs[i]-weights[i]));
            weights[i]+=rate*(inputs[i]-weights[i]);
        }
    }

    public double[] getWeights() {
        return weights;
    }

    public void showWeights()
    {
        for(int i=0;i<weights.length;i++)
        {
            System.out.println(weights[i]);
        }
    }

    public void change_weights(int[] inputs,double rate) throws TablesDoesntMatchException
    {
        if(inputs.length!=weights.length)
        {
            throw new TablesDoesntMatchException("Liczba wejść do modyfikacji wag nie zgadza się z liczbą wag");
        }
        for(int i=0;i<weights.length;i++)
        {
            //System.out.println("Waga zmodyfikowana o: "+ rate*(inputs[i]-weights[i]));
            weights[i]+=rate*((double)inputs[i]-weights[i]);
        }
    }

    public void notWinnerChangeWeights(int[] inputs,double rate,double[] winnerWeights,double alfa) throws TablesDoesntMatchException
    {
        if(inputs.length!=weights.length)
        {
            throw new TablesDoesntMatchException("Liczba wejść do modyfikacji wag nie zgadza się z liczbą wag");
        }
        for(int i=0;i<weights.length;i++)
        {
            weights[i]+=G(winnerWeights,alfa)*rate*((double)inputs[i]-weights[i]);
        }
    }

    private double G(double[] winnerWeights,double alfa) throws TablesDoesntMatchException
    {
        return Math.exp(-Math.pow(euklidesDistance(weights,winnerWeights),2)/(2*Math.pow(alfa,2)));
    }

    private double euklidesDistance(double[] x,double[] y) throws TablesDoesntMatchException
    {
        double sum=0;
        if(x.length!=y.length)
        {
            throw new TablesDoesntMatchException("Rozmiary tablic w euklidesie sie nie zgadzaja");
        }
        for(int i=0;i<x.length;i++)
        {
            sum+=Math.abs(x[i]-y[i]);
        }
        return sum;
    }
}
