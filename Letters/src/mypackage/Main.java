package mypackage;

public class Main {

    public static double[] guess(Perceptron[] perceptrons, int[] tab)
    {
        double[] result = new double[perceptrons.length];

        int max=0;
        double tmp=0;
        for(int i=0;i<perceptrons.length;i++)
        {
            result[i]=perceptrons[i].guess(tab);
            if(result[i]>tmp)
            {
                tmp=result[i];
                max=i;
            }
           // System.out.println(result[i]);
        }

        if(max<10)
        {
            System.out.println((char)(max+65));
        }
        else
        {
            System.out.println((char)(max+87));
        }

        return result;
    }

    public static void main(String[] args) {

        int[] tab_aa = {
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1};

        int[] tab_bb = {
                1,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0};

        int[] tab_cc = {
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,0,
                1,0,0,0,0,
                1,0,0,0,0,
                1,0,0,0,1,
                0,1,1,1,0
        };

        int[] tab_dd={
                1,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,0,
        };

        int[] tab_ee={
                1,1,1,1,1,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,1,1,0,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,1,1,1
        };

        int[] tab_ff={
                1,1,1,1,1,
                1,0,0,0,0,
                1,0,0,0,0,
                1,1,1,1,0,
                1,0,0,0,0,
                1,0,0,0,0,
                1,0,0,0,0
        };

        int[] tab_gg={
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,0,
                1,0,1,1,1,
                1,0,0,0,1,
                1,0,0,0,1,
                0,1,1,1,0
        };

        int[] tab_hh={
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,1,1,1,
                1,0,0,0,1,
                1,0,0,0,1,
                1,0,0,0,1
        };

        int[] tab_ii={
                0,1,1,1,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,1,1,1,0
        };

        int[] tab_jj={
                1,1,1,1,1,
                0,0,0,0,1,
                0,0,0,0,1,
                0,0,0,0,1,
                0,0,0,0,1,
                1,0,0,0,1,
                0,1,1,1,0
        };

        int[] tab_a =  {
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,0,0,0,
                0,1,1,1,0,
                0,1,0,1,0,
                0,1,1,1,1
        };

        int[] tab_b =  {
                0,1,0,0,0,
                0,1,0,0,0,
                0,1,0,0,0,
                0,1,1,1,0,
                0,1,0,1,0,
                0,1,0,1,0,
                0,1,1,1,0
        };

        int[] tab_c =  {
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,1,1,0,
                0,1,0,0,0,
                0,1,0,0,0,
                0,0,1,1,0
        };


        int[] tab_d =  {
                0,0,0,1,0,
                0,0,0,1,0,
                0,0,0,1,0,
                0,0,0,1,0,
                0,1,1,1,0,
                0,1,0,1,0,
                0,1,1,1,0
        };

        int[] tab_e =  {
                0,0,0,0,0,
                0,0,0,0,0,
                0,1,1,1,0,
                1,0,0,0,1,
                1,1,1,1,1,
                1,0,0,0,0,
                0,1,1,1,0
        };

        int[] tab_f =  {
                0,0,1,1,0,
                0,0,1,0,0,
                0,1,1,1,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0
        };

        int[] tab_g =  {
                0,0,0,0,0,
                0,0,1,0,0,
                0,1,1,1,1,
                0,1,0,1,0,
                0,1,1,1,0,
                0,0,0,1,0,
                0,0,1,1,0
        };

        int[] tab_h =  {
                0,1,0,0,0,
                0,1,0,0,0,
                0,1,0,0,0,
                0,1,1,0,0,
                0,1,0,1,0,
                0,1,0,1,0,
                0,1,0,1,0
        };

        int[] tab_i =  {
                0,0,0,0,0,
                0,0,0,0,0,
                0,0,1,0,0,
                0,0,0,0,0,
                0,0,1,0,0,
                0,0,1,0,0,
                0,0,1,0,0
        };

        int[] tab_j =  {
                0,0,0,1,0,
                0,0,0,0,0,
                0,0,0,1,0,
                0,0,0,1,1,
                0,0,1,1,0,
                0,1,0,1,0,
                0,0,1,0,0
        };

        int[][] T = {
                tab_aa,tab_bb,tab_cc,tab_dd,tab_ee,tab_ff,tab_gg,tab_hh,tab_ii,tab_jj,
                tab_a,tab_b,tab_c,tab_d,tab_e,tab_f,tab_g,tab_h,tab_i,tab_j
        };



        int[] tab_aa_zaburz = {
                0,1,1,1,0,
                1,0,0,0,1,
                1,0,0,0,1,
                1,1,0,1,1,
                1,0,1,0,1,
                1,0,0,0,1,
                1,1,0,0,1};

	    Letter aa = new Letter('A',tab_aa);
        Letter bb = new Letter('B',tab_bb);
        Letter a = new Letter('a',tab_a);
        Perceptron[] perceptrons = new Perceptron[20];
        int[] help = new int[20];
        for(int i=0;i<20;i++)
        {
            help[i]=0;
        }

        for(int i=0;i<20;i++) {
            help[i]=1;
            perceptrons[i] = new Perceptron(26);
            for (int j = 0; j < 100; j++) {
                for(int k=0;k<20;k++) {
                    perceptrons[i].train(T[k], help[k]);
                }
            }
            help[i]=0;
        }
        /*System.out.println(perceptrons[0].guess(aa.getTab()));
        System.out.println(perceptrons[0].guess(bb.getTab()));
        System.out.println(perceptrons[0].guess(a.getTab()));
        System.out.println(perceptrons[0].guess(tab_aa_zaburz));*/
        guess(perceptrons,tab_j);

    }
}