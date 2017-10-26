package mypackage;

/**
 * Created by qwerty on 24-Oct-17.
 */
public class Letter {
    private char letter;
    private int tab[];

    public Letter(char letter, int[] tab) {
        this.letter = letter;
        this.tab = tab;
    }

    public char getLetter() {
        return letter;
    }

    public int[] getTab() {
        return tab;
    }

    public void show()
    {
        int j=0;
        for(int i=0;i<35;i++)
        {
            j++;
            System.out.print(tab[i]);
            if(j==5)
            {
                System.out.println();
                j=0;
            }
        }
    }
}
