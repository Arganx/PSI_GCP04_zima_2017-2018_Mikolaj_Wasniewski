package Operations;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class XOR extends Data {
    public XOR()
    {

        x= ThreadLocalRandom.current().nextInt(0,2);
        y= ThreadLocalRandom.current().nextInt(0,2);
        if(!x.equals(y))
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
    public XOR(int a,int b)
    {
        x= a;
        y= b;
        if(!x.equals(y))
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
