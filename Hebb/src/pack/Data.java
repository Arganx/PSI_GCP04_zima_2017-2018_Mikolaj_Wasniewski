package pack;

import java.util.Date;

public class Data {

    int tab[][];
    int strange[][];
    int other[][];
    int pixel3[][];
    int pixel5[][];

    Data()
    {
        tab = new int[4][];//4 różne emotikony
        strange = new int[4][];//Zaburzone dane
        other = new int[4][];
        pixel3=new int[4][];
        pixel5=new int[4][];


        int smile[] = {
                0,1,1,1,1,1,1,0,
                1,0,0,0,0,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,0,0,0,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,0,1,1,0,0,1,
                1,0,0,0,0,0,0,1,
                0,1,1,1,1,1,1,0

        };
        int sad[]={
                0,1,1,1,1,1,1,0,
                1,0,0,0,0,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,0,0,0,0,0,1,
                1,0,0,1,1,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,0,0,0,0,0,1,
                0,1,1,1,1,1,1,0
        };
        int suprised[]={
                0,1,1,1,1,1,1,0,
                1,0,1,0,0,1,0,1,
                1,1,0,1,1,0,1,1,
                1,0,1,0,0,1,0,1,
                1,0,0,1,1,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,0,1,1,0,0,1,
                0,1,1,1,1,1,1,0
        };
        int angry[]={
                0,1,1,1,1,1,1,0,
                1,0,0,0,0,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,0,0,0,0,0,1,
                1,0,0,0,0,0,0,1,
                1,0,1,1,1,1,0,1,
                1,0,0,0,0,0,0,1,
                0,1,1,1,1,1,1,0
        };

        int strange_smile[]={
                0,1,1,1,1,1,1,0,
                1,0,0,0,0,0,0,1,
                1,0,1,0,0,0,1,1,
                1,0,0,0,0,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,0,1,1,0,0,1,
                1,0,0,0,0,0,0,1,
                0,1,1,1,1,1,1,0
        };

        int strange_sad[]={
                0,1,1,1,1,1,1,0,
                1,0,0,0,0,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,0,0,0,0,0,1,
                1,0,0,1,1,1,0,1,
                1,0,1,0,0,0,0,1,
                1,0,0,0,0,0,0,1,
                0,1,1,1,1,1,1,0
        };

        int strange_suprised[]={
                0,1,1,1,1,1,1,0,
                1,0,1,0,0,1,0,1,
                1,1,0,1,1,0,1,1,
                1,0,1,0,0,1,0,1,
                1,0,0,1,1,0,1,1,
                1,0,1,0,0,1,1,1,
                1,0,0,1,1,0,0,1,
                0,1,1,1,1,1,1,0
        };

        int strange_angry[]={
                0,1,1,1,1,1,1,0,
                1,0,0,0,0,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,0,0,0,0,0,1,
                1,0,0,0,0,0,1,1,
                1,0,1,1,1,1,1,1,
                1,0,0,0,0,0,0,1,
                0,1,1,1,1,1,1,0
        };

        int other_smile[]={
                0,1,1,1,1,1,1,0,
                1,0,0,0,0,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,0,0,0,0,0,1,
                1,0,0,0,0,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,0,1,1,0,0,1,
                0,1,1,1,1,1,1,0
        };

        int other_sad[]={
                0,1,1,1,1,1,1,0,
                1,0,0,0,0,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,0,0,0,0,0,1,
                1,0,0,0,0,0,0,1,
                1,0,0,1,1,0,0,1,
                1,0,1,0,0,1,0,1,
                0,1,1,1,1,1,1,0
        };

        int other_suprised[]={
                0,1,1,1,1,1,1,0,
                1,0,0,0,0,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,0,0,0,0,0,1,
                1,0,0,1,1,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,0,1,1,0,0,1,
                0,1,1,1,1,1,1,0
        };

        int other_angry[]={
                0,1,1,1,1,1,1,0,
                1,0,0,0,0,0,0,1,
                1,1,1,0,0,1,1,1,
                1,0,0,0,0,0,0,1,
                1,0,0,0,0,0,0,1,
                1,0,1,1,1,1,0,1,
                1,0,0,0,0,0,0,1,
                0,1,1,1,1,1,1,0
        };



        int pixel3_smile[]={
                0,1,1,1,1,1,1,0,
                1,0,0,0,0,0,1,1,
                1,0,1,0,0,0,1,1,
                1,0,0,0,0,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,0,1,1,0,0,1,
                1,0,0,0,0,0,0,1,
                0,1,1,1,1,1,1,0
        };

        int pixel3_sad[]={
                0,1,1,1,1,1,1,0,
                1,0,0,0,0,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,1,0,0,0,0,1,
                1,0,0,1,1,1,0,1,
                1,0,1,0,0,0,0,1,
                1,0,0,0,0,0,0,1,
                0,1,1,1,1,1,1,0
        };

        int pixel3_suprised[]={
                0,1,1,1,1,1,1,0,
                1,0,1,0,0,1,0,1,
                1,1,1,1,1,0,1,1,
                1,0,1,0,0,1,0,1,
                1,0,0,1,1,0,1,1,
                1,0,1,0,0,1,1,1,
                1,0,0,1,1,0,0,1,
                0,1,1,1,1,1,1,0
        };

        int pixel3_angry[]={
                0,1,1,1,1,1,1,0,
                1,0,1,0,0,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,0,0,0,0,0,1,
                1,0,0,0,0,0,1,1,
                1,0,1,1,1,1,1,1,
                1,0,0,0,0,0,0,1,
                0,1,1,1,1,1,1,0
        };

        int pixel5_smile[]={
                0,1,1,1,1,1,1,0,
                1,0,0,0,1,0,1,1,
                1,0,1,0,0,0,1,1,
                1,0,0,0,0,0,0,1,
                1,0,1,0,0,0,0,1,
                1,0,0,1,1,0,0,1,
                1,0,0,0,0,0,0,1,
                0,1,1,1,1,1,1,0
        };

        int pixel5_sad[]={
                0,1,1,1,1,1,1,0,
                1,0,0,0,0,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,1,0,0,0,0,1,
                1,0,0,1,1,1,0,1,
                1,0,1,0,0,0,1,1,
                1,0,0,0,0,0,1,1,
                0,1,1,1,1,1,1,0
        };

        int pixel5_suprised[]={
                0,1,1,1,1,1,1,0,
                1,0,1,0,0,1,1,1,
                1,1,1,1,1,0,0,1,
                1,0,1,0,0,1,0,1,
                1,0,0,1,1,0,1,1,
                1,0,1,0,0,1,1,1,
                1,0,0,1,1,0,0,1,
                0,1,1,1,1,1,1,0
        };

        int pixel5_angry[]={
                0,1,1,1,1,1,1,0,
                1,0,1,0,0,0,0,1,
                1,1,1,0,0,1,0,1,
                1,1,0,0,0,0,0,1,
                1,0,0,0,0,0,1,1,
                1,0,1,1,1,1,1,1,
                1,0,0,0,0,0,0,1,
                0,1,1,1,1,1,1,0
        };


        tab[0]=smile;
        tab[1]=sad;
        tab[2]=suprised;
        tab[3]=angry;

        strange[0]=strange_smile;
        strange[1]=strange_sad;
        strange[2]=strange_suprised;
        strange[3]=strange_angry;

        other[0]=other_smile;
        other[1]=other_sad;
        other[2]=other_suprised;
        other[3]=other_angry;

        pixel3[0]=pixel3_smile;
        pixel3[1]=pixel3_sad;
        pixel3[2]=pixel3_suprised;
        pixel3[3]=pixel3_angry;

        pixel5[0]=pixel5_smile;
        pixel5[1]=pixel5_sad;
        pixel5[2]=pixel5_suprised;
        pixel5[3]=pixel5_angry;

    }

    public int[][] getTab() {
        return tab;
    }

    public int[][] getStrange() {
        return strange;
    }

    public int[][] getOther() {
        return other;
    }

    public int[][] getPixel3() {
        return pixel3;
    }

    public int[][] getPixel5() {
        return pixel5;
    }
}
