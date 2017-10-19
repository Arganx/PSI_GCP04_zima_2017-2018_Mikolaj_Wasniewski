package mypackage;

import Operations.AND;
import Operations.OR;
import Operations.XOR;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static Integer test_AND(Perceptron perceptron)//funkcja testująca
    {
        ArrayList<Integer> and = new ArrayList<Integer>();

        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                and.add(i);
                and.add(j);
                if (i == 1 && j == 1) {
                    if (perceptron.guess(and) != 1) {
                        return 0;
                    }
                    and.clear();
                } else {
                    if (perceptron.guess(and) != -1) {
                        return 0;
                    }
                    and.clear();
                }
            }
        }
        return 1;
    }

    public static void train_AND(Perceptron perceptron,Integer number_of_trainings)
    {
        for(int i=0;i<number_of_trainings;i++) {
            AND and = new AND();
            perceptron.train(and);
        }
    }

    public static void train_AND_block(Perceptron perceptron,Integer number_of_trainings_blocks)
    {
        AND and00 = new AND(0,0);
        AND and01 = new AND(0,1);
        AND and10 = new AND(1,0);
        AND and11 = new AND(1,1);
        for(int i=0;i<number_of_trainings_blocks;i++) {
            perceptron.train(and00);
            perceptron.train(and01);
            perceptron.train(and10);
            perceptron.train(and11);
        }
    }

    public static void main(String[] args) {
        Perceptron perceptron = new Perceptron(2);
        perceptron.show();


        Perceptron[] per = new Perceptron[10001];

        //tests
        Integer correct =0;
        Integer tests = 10000;
        for(int z=0;z<=20;z++) {    //z - liczba wykonanych testów
            correct=0;
            for (int i = 0; i < tests; i++) {
                per[i] = new Perceptron(2);
                //train_AND(per[i],125);
                train_AND_block(per[i], z);
                correct += test_AND(per[i]);
            }
            System.out.println(correct + " na " + tests + " poprawnie");
        }

    }
}


