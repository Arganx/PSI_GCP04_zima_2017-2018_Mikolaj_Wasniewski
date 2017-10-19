package Operations;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class OR extends Data {
    public OR()
    {

        x= ThreadLocalRandom.current().nextInt(0,2);
        y= ThreadLocalRandom.current().nextInt(0,2);
        if(x.equals(1) || y.equals(1))
        {
            label=1;
        }
        else
        {
            label=-1;
        }
        in = new ArrayList<Integer>();
        in.add(x);
        in.add(y);
    }
    public OR(int a,int b)
    {
        x= a;
        y= b;
        if(x.equals(1) || y.equals(1))
        {
            label=1;
        }
        else
        {
            label=-1;
        }
        in = new ArrayList<Integer>();
        in.add(x);
        in.add(y);
    }
}
