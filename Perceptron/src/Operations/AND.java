package Operations;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by qwerty on 17-Oct-17.
 */
public class AND extends Data{
    public AND()
    {

        x= ThreadLocalRandom.current().nextInt(0,2);
        y= ThreadLocalRandom.current().nextInt(0,2);
        if(x.equals(1)&&x.equals(y))
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
    public AND(int a,int b)
    {
        x= a;
        y= b;
        if(x.equals(1)&&x.equals(y))
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
