package pack;

import java.util.Date;

public class Map {
    private Neuron[][] map;
    private Letters letters;

    Map(int size,Letters letters)
    {
        this.letters=letters;
        map = new Neuron[size][size];
        for(int i=0;i<map.length;i++)
        {
            for (int j=0;j<map[0].length;j++)
            {
                map[i][j]=new Neuron(35);
            }
        }
    }

    public void train(int traningNumber) throws TablesDoesntMatchException {
        double max;  //Poczatkowa wartosc max
        double tmp;
        double startRate=0.1;
        double rate = startRate;
        double startAlfa = 100;//TODO do ustalenia
        double alfa = startAlfa;
        Neuron winner=null;
        int[] elemntnumbers;
        for(int i=0;i<traningNumber;i++)//Po treningach
        {
            //Po literach
            for(int j=0;j<letters.getTab().length;j++) {
                elemntnumbers=guess(letters.getTab()[j]);
                winner=map[elemntnumbers[0]][elemntnumbers[1]];
                //Modyfikacja wag
                winner.change_weights(letters.getTab()[j],rate);
                //Modyfikacja przystajacych neuronow
                for(int k=0;k<map.length;k++)
                {
                    for(int z=0;z<map[0].length;z++)
                    {
                        if(k!=elemntnumbers[0]||z!=elemntnumbers[1])
                        {
                            map[k][z].notWinnerChangeWeights(letters.getTab()[j],rate,winner.getWeights(),alfa);
                        }
                    }
                }
            }
            rate=doRate(rate,traningNumber,i);
            alfa=doRate(alfa,traningNumber,i);
            System.out.println("Iteracja "+ i +" Error: "+error(letters));

        }
    }

    public int[] guess(int[] input)//zwraca wspolrzedne tablicy dla tego neuronu, ktory zareagowal najmocniej
    {
        double tmp;
        int maxi=0;
        int maxj=0;
        double max = map[0][0].guess(input);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                tmp=map[i][j].guess(input);
                if(max<tmp)
                {
                    max=tmp;
                    maxi=i;
                    maxj=j;
                }
            }
        }
        int[] result = new int[]{
                maxi,maxj
        };
        return result;
    }

    public Neuron guessNeuron(int[] input)//zwraca wspolrzedne tablicy dla tego neuronu, ktory zareagowal najmocniej
    {
        double tmp;
        int maxi=0;
        int maxj=0;
        Neuron winner=map[0][0];
        double max = map[0][0].guess(input);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                tmp=map[i][j].guess(input);
                if(max<tmp)
                {
                    winner=map[i][j];
                    max=tmp;
                    maxi=i;
                    maxj=j;
                }
            }
        }
        return winner;
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

    private double doRate(double rate,double maxTrenings,double trening)
    {
        return rate*(maxTrenings-trening)/maxTrenings;
    }

    public double error(Letters letters)
    {
        double error =0.;
        Neuron winner;
        for(int i=0;i<letters.getTab().length;i++) {
            winner = guessNeuron(letters.getTab()[i]);
            for (int j = 0; j < letters.getTab()[i].length; j++) {
                error += Math.abs((double)letters.getTab()[i][j] - winner.getWeights()[j]);
            }
        }
        return error;
    }
}
