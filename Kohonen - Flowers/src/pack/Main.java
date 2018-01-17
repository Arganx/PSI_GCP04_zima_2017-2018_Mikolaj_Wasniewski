package pack;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Changer changer = new Changer();
        //Tworze mape na ktorej bede przedstawial wyniki
        int size =8;//Wielkość siatki AxA
        Map map = new Map(size,4);
        Data data=new Data();
        map.train(data,1000);

        int[][] results=new int[size][size];
        //Inicjacja tablicy wyników
        for(int i=0;i<results.length;i++)
        {
            for(int j=0;j<results[0].length;j++)
            {
                results[i][j]=0;
            }
        }

        //Wyświetlenie przynależności kwiatów zgodnie z siecią
        for(int i=0;i<150;i++)
        {
            int[] tab =map.guess(data.getFlower_info()[i]);
            results[tab[0]][tab[1]]++;
            if(i==0)
            {
                System.out.println("setosa");
            }
            if(i==50)
            {
                System.out.println("versicolor");
            }
            if(i==100)
            {
                System.out.println("virginica");
            }
            for(int j=0;j<2;j++)
            {

                System.out.println(tab[j]);
            }
            System.out.println();
        }

        //Wypełnienie tablicy wyników
        for(int i=0;i<results.length;i++)
        {
            for(int j=0;j<results[0].length;j++)
            {
                System.out.print(results[i][j]+",");
            }
            System.out.println();
        }

    }
}
