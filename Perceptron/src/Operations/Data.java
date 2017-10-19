package Operations;

import java.util.ArrayList;

public abstract class Data {
    protected ArrayList<Integer> in;
    protected Integer x;
    protected Integer y;
    protected int label;

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public int getLabel() {
        return label;
    }

    public ArrayList<Integer> getIn() {
        return in;
    }
    public void show()
    {
        System.out.println("X: "+ x +"\nY: "+ y + "\nWynik: " + label);
    }
}
