package mypackage;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void train(Perceptron[] perceptrons, int[] letter, int[] result, int number_of_trainings) {   //funkcja trenująca sieć przyjmuje liste neuronów w warstwie 1, dane wyejściowe oraz oczekiwany wektor końcowy i liczbe powtórzeń treningu

        //Podział otrzymanego pobszaru na podobszary
        int[] left_top = {letter[0], letter[1], letter[5], letter[6], letter[10], letter[11]};
        int[] right_top = {letter[3], letter[4], letter[8], letter[9], letter[13], letter[14]};
        int[] left_bottom = {letter[20], letter[21], letter[25], letter[26], letter[30], letter[31]};
        int[] right_bottom = {letter[23], letter[24], letter[28], letter[29], letter[33], letter[34]};
        int[] left = {letter[15], letter[16]};
        int[] right = {letter[18], letter[19]};
        int[] top = {letter[2], letter[7], letter[12]};
        int[] bottom = {letter[22], letter[27], letter[32]};
        int[] center = {letter[17]};

        //Dla wygody zapakowanie podobszarów do jednej tablicy
        int[][] tables = new int[][]{
                left_top, right_top, left_bottom, right_bottom, left, right, top, bottom, center
        };

        //Trening wszytskich neuronów
        for (int j = 0; j < number_of_trainings; j++) {
            for (int i = 0; i < perceptrons.length; i++) {
                perceptrons[i].train(tables[i], result[i]);
            }
        }
    }

    public static int[] guess(Perceptron[] perceptrons, int[] letter) { //funkcja zwracająca wektor otrzymany w wyniku wprowadzenia do sieci podanych danych

        //Podział wprowadzonego obszaru na podobszary
        int[] left_top = {letter[0], letter[1], letter[5], letter[6], letter[10], letter[11]};
        int[] right_top = {letter[3], letter[4], letter[8], letter[9], letter[13], letter[14]};
        int[] left_bottom = {letter[20], letter[21], letter[25], letter[26], letter[30], letter[31]};
        int[] right_bottom = {letter[23], letter[24], letter[28], letter[29], letter[33], letter[34]};
        int[] top = {letter[2], letter[7], letter[12]};
        int[] center = {letter[17]};
        int[] bottom = {letter[22], letter[27], letter[32]};
        int[] left = {letter[15], letter[16]};
        int[] right = {letter[18], letter[19]};

        //Dla wygody wszystkie podobszary znajdują się w jednej tablicy
        int[][] tables = new int[][]{
                left_top, right_top, left_bottom, right_bottom, left, right, top, bottom, center
        };

        //Utworzenie wektora zwracanego i wypełnienie go wynikami poszczehgulnych neuronów
        int[] result = new int[perceptrons.length];
        for (int i = 0; i < perceptrons.length; i++) {
            result[i] = perceptrons[i].guess(tables[i]);
        }

        return result;

    }


    public static void main(String[] args) {
        //Generacja niezbędnych komponentów
        Letters letters = new Letters();
        Adaline[] perceptrons = new Adaline[9];
        for (int i = 0; i < 9; i++) {
            if (i < 4) {
                perceptrons[i] = new Adaline(6);
            } else if (i < 6) {
                perceptrons[i] = new Adaline(2);
            } else if (i < 8) {
                perceptrons[i] = new Adaline(3);
            } else {
                perceptrons[i] = new Adaline(1);
            }
        }

        Tests testModule = new Tests();
        //traning
        int number_of_train = 10000;  //liczba treningow
        for (int j = 0; j < number_of_train; j++) {   //petla treningow

            for(int i=0;i<20;i++)   //kazdy trening sklada sie z kolejnych 20 treningow po jednym na konkretna litere
            {
                if(i%2==0) {
                    Main.train(perceptrons, letters.getTab()[i], letters.getTab_result()[i], 1);
                }
                else
                {
                    Main.train(perceptrons, letters.getTab()[i], letters.getTab_result()[i], 1);
                }
            }
        }

/*        int[][] tmp=new int[20][9];
        for(int i=0;i<20;i++)
        {
            tmp[i]=Main.guess(perceptrons,letters.getTab()[i]);
            for(int j=0;j<9;j++)
            {
                System.out.print(tmp[i][j]+" ");
            }
            System.out.println();
        }*/
        //Testowanie sieci
        testModule.test_official(perceptrons);
        testModule.test_zaburzone(perceptrons);


    }
}