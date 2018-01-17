package pack;


public class Tests {

    private Data data;

    Tests()
    {
        data = new Data();
    }

    public void learnTest(Neuron neurons[]) //Test dla danych uczących
    {
        double result[];
        int test=0;
        for(int i=0;i<4;i++) {
            result = Main.guess(neurons, data.getTab()[i]);
            if (isMax(result[i],result))
            {
                test++;
            }
        }
        System.out.println("Poprawnosc testu dla nauczonych danych wynosi: "+100*test/4+"%");
    }

    public void strangeTest(Neuron neurons[])   //test dla danych zaburzonych
    {
        double result[];
        int test=0;
        for(int i=0;i<4;i++) {
            result = Main.guess(neurons, data.getStrange()[i]);
            if (isMax(result[i],result))
            {
                test++;
            }
        }
        System.out.println("Poprawnosc testu dla zaburzonych danych wynosi: "+100*test/4+"%");
    }

    private boolean isMax(double number,double[] result)    //Sprawdzenie czy element jest maksymalny w danym wektorze
    {
        for(int i=0;i<result.length;i++)
        {
            if(number<result[i])
            {
                return false;
            }
        }
        return true;
    }

    public void otherTest(Neuron neurons[])//Test inaczej rysowanych emotikon
    {
        double result[];
        int test=0;
        for(int i=0;i<4;i++) {
            result = Main.guess(neurons, data.getOther()[i]);
            if (isMax(result[i],result))
            {
                test++;
                System.out.println("True for " + i);
                for(int j=0;j<4;j++)
                {
                    System.out.println(result[j]);
                }
            }
            else
            {
                System.out.println("False for "+i);
                for(int j=0;j<4;j++)
                {
                    System.out.println(result[j]);
                }
            }
        }
        System.out.println("Poprawnosc testu dla inaczej rysowanych danych wynosi: "+100*test/4+"%");
    }

    public void pixel3Test(Neuron neurons[])    //Test 3 zaburzonych pixeli
    {
        double result[];
        int test=0;
        for(int i=0;i<4;i++) {
            result = Main.guess(neurons, data.getPixel3()[i]);
            if (isMax(result[i],result))
            {
                test++;
            }
        }
        System.out.println("Poprawnosc testu dla 3 zaburzonych pixeli wynosi: "+100*test/4+"%");
    }

    public void pixel5Test(Neuron neurons[])//Test 5 zaburzonych pixeli
    {
        double result[];
        int test=0;
        for(int i=0;i<4;i++) {
            result = Main.guess(neurons, data.getPixel5()[i]);
            if (isMax(result[i],result))
            {
                test++;
            }
        }
        System.out.println("Poprawnosc testu dla 5 zaburzonych pixeli wynosi: "+100*test/4+"%");
    }
}
