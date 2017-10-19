package mypackage;

import Operations.Data;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by qwerty on 17-Oct-17.
 */
public class Perceptron {
    private ArrayList<Double> weights;
    private Double biasweight;
    private Double lr = 0.1;

    public Double getLr() {
        return lr;
    }

    public void setLr(Double lr) {
        this.lr = lr;
    }

    private int activation(Double sum)
    {
        if(sum>=0.0)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

    Perceptron(int size)
    {
        weights=new ArrayList<Double>();
        for(int i=0;i<size;i++) {
            weights.add(ThreadLocalRandom.current().nextDouble(-1, 1 + 1));
        }
        biasweight=ThreadLocalRandom.current().nextDouble(-1, 1 + 1);
    }

    public void show()
    {
        System.out.println("Wagi: ");
        for(int i=0;i<weights.size();i++) {
            System.out.println(weights.get(i));
        }
        System.out.println("Waga biasu:\n" + biasweight);
    }

    public Integer guess(ArrayList<Integer> inputs)
    {
        Double sum= 0.0;
            for(int i=0;i<weights.size();i++)
            {
                sum+=inputs.get(i)*weights.get(i);
            }
            sum+=biasweight;
        Integer out = activation(sum);
        return out;
    }

    public void train(Data data)
    {

        int guess =guess(data.getIn());
        Integer error = data.getLabel() - guess;
        for(int i=0;i<weights.size();i++)
        {
            Double a = weights.get(i);
            weights.set(i,a+error*data.getIn().get(i)*lr);
        }
        biasweight+=error*lr;

    }
}
