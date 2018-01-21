package pack;

public class Changer {
    private double min;
    private double max;

    private double mymin;
    private double mymax;

    public Changer() {
        min = 0.0;
        max = 8.0;

        mymin = 0.;
        mymax = 1.;

    }

    public double from_01_to_normal(double number)
    {
        return (max-min)/(mymax-mymin)*(number-mymax)+max;
    }

    public double from_normal_to_01(double number)
    {
        // ( x - min ) / ( max - min )
        //(max'-min')/(max-min)*(value-max)+max'
        return (mymax-mymin)/(max-min)*(number-max)+mymax;
    }


    public boolean isTableSame(int[] tab1, int[] tab2)
    {
        boolean status=true;
        for(int i=0;i<tab1.length;i++)
        {
            if(tab1[i]!=tab2[i])
            {
                status=false;
            }
        }
        return status;
    }

    public double[] narmalizeVector(double[] vec)
    {
        double div=0;
        for(int j=0;j<vec.length;j++)
        {
            div+=Math.pow(vec[j],2);
        }
        div = Math.sqrt(div);
        for(int i=0;i<vec.length;i++)
        {

            vec[i]=vec[i]/div;
        }
        return vec;
    }

}
