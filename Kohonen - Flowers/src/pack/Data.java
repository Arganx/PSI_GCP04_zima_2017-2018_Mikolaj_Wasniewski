package pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Data {
    private double[][] flower_info;


    Data(){
        Scanner scanner = null;
        flower_info=new double[150][4];
        try {
            scanner = new Scanner(new File("flower_data.txt"));
            for(int i=0;i<150;i++)//Po linijkach
            {
                flower_info[i][0]=scanner.nextDouble();
                flower_info[i][1]=scanner.nextDouble();
                flower_info[i][2]=scanner.nextDouble();
                flower_info[i][3]=scanner.nextDouble();
                scanner.nextLine();
            }

        betternormalize();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
    public void normalize()
    {
        Changer changer=new Changer();
        for(int i=0;i<flower_info.length;i++)
        {
            for(int j=0;j<flower_info[0].length;j++)
            {
                flower_info[i][j]=changer.from_normal_to_01(flower_info[i][j]);
            }
        }
    }

    public void betternormalize()
    {
        Changer changer=new Changer();
        for(int i=0;i<flower_info.length;i++)
        {
            flower_info[i]=changer.narmalizeVector(flower_info[i]);
        }
    }

    public double[][] getFlower_info() {
        return flower_info;
    }
}
