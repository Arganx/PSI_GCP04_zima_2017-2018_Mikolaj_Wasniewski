package mypackage;

import java.util.Arrays;

/**
 * Created by qwerty on 16-Nov-17.
 */
public class Tests {    //klaza przeprowadzająca testy na sieci

    public double test_official(Perceptron[] perceptrons) { //test sprawdzający poprawne działanie dla danych na, których sieć była trenowana 20 testów
        Letters letters = new Letters();
        int counter = 0;

/*        //Perceprton - tablica poprawnych wynikow dla perceptronu - odkomentowac jesli siec sklada sie z perceptronow
        int[][] proper_big_result = {
                {1, 1, 1, 1, 1, 1, 0, 0, 1},
                {1, 0, 1, 0, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 0, 0, 0},
                {1, 0, 1, 0, 1, 1, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 1, 1, 1},
                {0, 1, 0, 1, 0, 1, 0, 0, 0}
        };*/

        //Adaline tablica poprawnych wynikow dla Adaline z wspolczynnikiem uczenie 0.1 - odkomentowac jesli siec sklada sie z Adaline
        int[][] proper_big_result = {
                {1,1,1,1,1,1,0,1,1},
                {1,1,1,0,1,1,0,1,0},
                {1,1,1,1,1,1,0,1,0},
                {1,1,1,0,1,1,0,1,1},
                {1,1,1,1,1,1,1,1,1},
                {0,1,1,1,1,1,0,1,0}
        };

        int[] tmp;
        int help;
        for (int i = 0; i < 20; i++) {
            tmp = Main.guess(perceptrons, letters.getTab()[i]);

            help = 0;
            if (i % 2 == 0)    //Jeśli ma wyjsc mala
            {
                for (int k = 0; k < proper_big_result.length; k++)    //petla po tablicy wynikow poprawnych
                {
                    if (Arrays.equals(tmp,proper_big_result[k])) {
                        help++;
                    }
                }

                if (help == 0) {    //jeśli ani wynie nie pasuje do zadnej z duzych liter to znaczy ze litera jest mała
                    counter++;
                }
            } else if (i % 2 == 1) //Jeśli ma wyjsc duza
            {
                for (int k = 0; k < proper_big_result.length; k++)    //petla po tablicy wynikow poprawnych
                {
                    if (Arrays.equals(tmp,proper_big_result[k])) {  //Jeśli wektor odpowiada jednemu z oczekiwanych wektorów dużych liter to znaczy to że litera jest duża
                        counter++;
                    }
                }
            }
        }
        System.out.println("Dla testu kolejnymi literami gotowymi wynik to : " + counter + "/" + "20"); //wypisanie wyniku testu
        return (counter / 20);

    }


    public double test_zaburzone(Perceptron[] perceptrons)    //Test dla zabużonych danych wejściowych
    {
        int[][] letters1 = new int[10][];   //zaburzone 2 pixele
        int[][] letters2 = new int[10][];   //zaburzone 6 pixeli


        //Przygotowanie zaburzonych danych

        //Najpierw zaburzenie dużych liter
        letters1[0]=new int[]{
                0,1,1,1,0,
                1,1,0,0,1,
                1,0,0,0,1,
                1,1,1,1,1,
                1,0,0,0,1,
                1,0,0,1,1,
                1,0,0,0,1};

        letters1[2]=new int[]{
                1,0,1,1,0,
                1,0,0,0,1,
                1,1,0,0,1,
                1,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0
        };

        letters1[4]=new int[]{
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,0,
                1,0,0,0,1,
                1,0,0,0,1,
                0,1,1,1,0
        };

        letters1[6]=new int[]{
                1,1,1,1,0,
                1,0,1,0,1,
                1,0,0,0,1,
                0,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0,
        };

        letters1[8]=new int[]{
                1,1,1,1,1,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,0,1,1,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,1,1,1
        };

        //Potem małych

        letters1[1]=new int[]{
                0,0,0,0,0,
                0,0,0,1,0,
                0,0,0,0,0,
                0,0,0,0,0,
                0,1,1,1,0,
                0,1,1,1,0,
                0,1,1,1,1
        };

        letters1[3]=new int[]{
                0,1,0,0,0,
                0,1,0,0,1,
                0,1,0,0,1,
                0,1,1,1,0,
                0,1,0,1,0,
                0,1,0,1,0,
                0,1,1,1,0
        };

        letters1[5]=new int[]{
                0,0,0,0,0,
                0,0,1,0,1,
                0,0,0,0,0,
                0,0,1,1,0,
                0,1,0,0,0,
                0,1,0,0,0,
                0,0,1,1,0
        };

        letters1[7]=new int[]{
                0,0,0,1,0,
                0,1,0,1,0,
                0,0,0,1,0,
                0,0,0,1,0,
                0,1,0,1,0,
                0,1,0,1,0,
                0,1,1,1,0
        };

        letters1[9]=new int[]{
                0,0,1,0,1,
                0,0,0,0,0,
                0,1,1,1,0,
                1,0,0,0,1,
                1,1,1,1,1,
                1,0,0,0,0,
                0,1,1,1,0
        };

        //znowu duze ale dla większego zaburzenia

        letters2[0]=new int[]{
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,1,1,1,
                1,1,1,0,1,
                1,0,0,1,1,
                1,0,0,1,1,
                1,0,0,1,1
        };

        letters2[2]=new int[]{
                1,1,1,1,0,
                1,0,1,0,1,
                1,0,1,1,1,
                1,0,1,0,0,
                1,1,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0
        };

        letters2[4]=new int[]{
                0,1,1,1,0,
                1,0,0,1,1,
                1,0,1,1,1,
                1,0,0,1,1,
                1,0,0,0,0,
                1,0,0,0,1,
                0,1,1,1,0
        };

        letters2[6]=new int[]{
                1,1,1,0,1,
                1,0,0,1,1,
                1,0,0,1,1,
                1,0,1,1,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0,
        };

        letters2[8]=new int[]{
                1,1,1,1,0,
                1,0,1,0,1,
                1,0,1,0,1,
                1,1,1,1,1,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,1,1,1
        };

        //znowu małe
        letters2[1]=new int[]{
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,1,1,1,
                0,1,1,1,1,
                0,1,0,1,1,
                0,1,1,1,0
        };

        letters2[3]=new int[]{
                0,1,0,0,0,
                0,1,0,0,0,
                0,1,0,1,1,
                0,1,1,1,1,
                0,1,0,1,1,
                0,1,0,1,1,
                0,1,1,1,1
        };

        letters2[5]=new int[]{
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,1,1,1,
                0,0,1,1,1,
                0,1,0,0,1,
                0,1,0,0,1,
                0,0,1,1,0
        };

        letters2[7]=new int[]{
                0,0,0,1,0,
                0,1,1,1,0,
                0,0,0,1,0,
                0,0,0,1,0,
                0,1,1,1,0,
                0,1,0,1,0,
                1,0,0,0,0
        };

        letters2[9]=new int[]{
                0,0,0,1,0,
                0,1,0,1,1,
                0,1,1,0,1,
                1,0,0,0,1,
                1,1,1,1,1,
                1,0,0,0,0,
                0,1,1,1,0
        };

        int counter=0;
        int tmp[];
        int help;
/*
        //Perceptron
        int[][] proper_big_result = {
                {1, 1, 1, 1, 1, 1, 0, 0, 1},
                {1, 0, 1, 0, 1, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 0, 0, 0},
                {1, 0, 1, 0, 1, 1, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 1, 1, 1},
                {0, 1, 0, 1, 0, 1, 0, 0, 0}
        };*/


        //Adaline 0.5
        int[][] proper_big_result = {
                {1,1,1,1,1,1,0,1,1},
                {1,1,1,0,1,1,0,1,0},
                {1,1,1,1,1,1,0,1,0},
                {1,1,1,0,1,1,0,1,1},
                {1,1,1,1,1,1,1,1,1},
                {0,1,1,1,1,1,0,1,0}
        };


        for(int i=0;i<10;i++)
        {
            help =0;
            tmp=Main.guess(perceptrons,letters1[i]);

            if(i%2==0)//jesli litera powinna byc mala
            {
                for (int k = 0; k < proper_big_result.length; k++)    //petla po tablicy wynikow poprawnych
                {
                    if (Arrays.equals(tmp,proper_big_result[k])) {
                        help++;
                    }
                }
                if(help==0)
                {
                    counter++;
                }
            }
            else //jesli litera powinna byc duza
            {
                for (int k = 0; k < proper_big_result.length; k++)    //petla po tablicy wynikow poprawnych
                {
                    if (Arrays.equals(tmp,proper_big_result[k])) {
                        counter++;
                    }
                }
            }
        }

        System.out.println("Dla testu mało zaburzonymi literami wynik to : "+counter +"/"+"10");
        int a=counter;
        counter=0;


        for(int i=0;i<10;i++)
        {
            help=0;
            tmp=Main.guess(perceptrons,letters2[i]);
            if(i%2==0)//jesli litera powinna byc mala
            {
                for (int k = 0; k < proper_big_result.length; k++)    //petla po tablicy wynikow poprawnych
                {
                    if (Arrays.equals(tmp,proper_big_result[k])) {
                        help++;
                    }
                }
                if(help==0)
                {
                    counter++;
                }
            }
            else //jesli litera powinna byc duza
            {
                for (int k = 0; k < proper_big_result.length; k++)    //petla po tablicy wynikow poprawnych
                {
                    if (Arrays.equals(tmp,proper_big_result[k])) {
                        counter++;
                    }
                }
            }
        }
        System.out.println("Dla testu bardzo zaburzonymi literami wynik to : "+counter +"/"+"10");

        return (a+counter);

    }


}
