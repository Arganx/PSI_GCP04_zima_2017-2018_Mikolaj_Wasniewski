package pack;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	Letters letters = new Letters();
	int size =5;
	Map map = new Map(size,letters);
        try {
            map.train(10);

            double[][] results = new double[size][size];
            String[][] charTable = new String[size][size];
            for(int i=0;i<results.length;i++)
            {
                for(int j=0;j<results[0].length;j++)
                {
                    results[i][j]=0;
                    charTable[i][j]="";
                }
            }

            int[] tmp;
            //Test
            for(int i=0;i<letters.getTab().length;i++)  //Po literach
            {

                tmp=map.guess(letters.getTab()[i]);
                System.out.println((char)('a'+i)+"- y: "+tmp[0]+" x: "+tmp[1]);
                results[tmp[0]][tmp[1]]++;
                charTable[tmp[0]][tmp[1]]+=(char)('a'+i);
            }

            //Wyswietlenie ilosci liter przyporzadkowanych
            for(int i=0;i<results.length;i++)
            {
                for(int j=0;j<results[0].length;j++)
                {
                    System.out.print(results[i][j]+",");
                }
                System.out.println();
            }

            for(int i=0;i<results.length;i++)
            {
                for(int j=0;j<results[0].length;j++)
                {
                    System.out.print(charTable[i][j]+",");
                }
                System.out.println();
            }


        } catch (TablesDoesntMatchException e) {
            e.printStackTrace();
        }
    }
}
