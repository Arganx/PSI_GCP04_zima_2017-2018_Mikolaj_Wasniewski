package pack;

public class Wrapper {
    private char letter;

    Wrapper(char letter)
    {
        this.letter=letter;
    }

    @Override
    public String toString() {
        return ""+letter;
    }
}
