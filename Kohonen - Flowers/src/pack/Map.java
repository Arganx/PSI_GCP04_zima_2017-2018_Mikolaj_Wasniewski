package pack;

import java.util.concurrent.ThreadLocalRandom;

public class Map {

    private Neuron[][] map;

    Map(int size, int inputs)
    {
        //Tworze mape na ktorej bede przedstawial wyniki
        map = new Neuron[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                map[i][j]=new Neuron(inputs);
            }
        }
    }

    public void train(Data data,int trenings)
    {
        Neuron winner;
        int help;
        double startrate=0.3;
        double rate=startrate;
        int[] ref;

        for(int flower=0;flower<trenings;flower++) {
            //losowo
            help=ThreadLocalRandom.current().nextInt(0, data.getFlower_info().length);
            //for(int help=0;help<150;help++) {
                ref = guess(data.getFlower_info()[help]);

                //System.out.println("Zwciezca: " + ref[0] + " " + ref[1]);
                winner = map[ref[0]][ref[1]];
                //zmiana wag winnera
                try {
                    winner.change_weights(data.getFlower_info()[help], rate);
                    rate = rateLinear(startrate, trenings, flower);
                    System.out.println("Iteracja " + flower + " Error: " + error(data));
                    //zmiana wag otaczajacych neuronow wersja WTM
              /*  Neuron[] adjacent = findAdjacent(maxi,maxj);
                for(int i=0;i<adjacent.length;i++)
                {
                    adjacent[i].change_weights(data.getFlower_info()[flower],0.0001);
                }*/

                } catch (TablesDoesntMatchException e) {
                    e.printStackTrace();
                    return;
                }
            }
        //}
    }

    public int[] guess(double[] input)//zwraca wspolrzedne tablicy dla tego neuronu, ktory zareagowal najmocniej
    {
        double tmp;
        int maxi=0;
        int maxj=0;
        double max = map[0][0].guessdouble(input);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                tmp=map[i][j].guessdouble(input);
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



    public double guessvalue(double[] input)//zwraca wartosc neuronu zwyciezcy
    {
        double tmp;
        double max = map[0][0].guessdouble(input);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                tmp=map[i][j].guessdouble(input);
                if(max<tmp)
                {
                    max=tmp;
                }
            }
        }
        return max;
    }

    public Neuron guessNeuron(double[] input)   //Zwraca neuron zwyciezce
    {
        double tmp;
        Neuron winner = map[0][0];
        double max = map[0][0].guessdouble(input);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                tmp=map[i][j].guessdouble(input);
                if(max<tmp)
                {
                    winner=map[i][j];
                    max=tmp;
                }
            }
        }
        return winner;
    }

    private Neuron[] findAdjacent(int i,int j)
    {
        Neuron[] adjacent;
        int counter =4;
        int a=1,b=1,c=1,d=1;
        if(i==0)
        {
            counter--;
            a=0;
        }
        if(j==0)
        {
            counter--;
            b=0;
        }
        if(i==map.length)
        {
            counter--;
            c=0;
        }
        if(j==map[0].length)
        {
            counter--;
            d=0;
        }
        adjacent=new Neuron[counter];
        //wypelnienie tablicy
        for(int z=0;z<counter;z++)
        {
            if(a==1) {
                adjacent[z] = map[i - 1][j];
                a=0;
            }
            else if(b==1)
            {
                adjacent[z]= map[i][j-1];
                b=0;
            }
            else if(c==1)
            {
                adjacent[z]=map[i+1][j];
                c=0;
            }
            else if(d==1)
            {
                adjacent[z]=map[i][j+1];
                d=0;
            }



        }


        return adjacent;
    }

    public double error(Data data)
    {
        double error =0.;
        Neuron winner;
        for(int i=0;i<data.getFlower_info().length;i++) {
            winner = guessNeuron(data.getFlower_info()[i]);
            for (int j = 0; j < data.getFlower_info()[i].length; j++) {
                error += Math.abs(data.getFlower_info()[i][j] - winner.getWeights()[j]);
            }
        }
        return error;
    }

    private double rateLinear(double startrate,int iterations,int iteration)
    {
        return startrate*(((double)iterations+1.)-((double)iteration+1.))/((double)iterations+1.);
        //return  startrate*(1.0-(0.9*(iteration+1)/1000));
    }

}
