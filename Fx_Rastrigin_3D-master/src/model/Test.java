package model;

public class Test {



    public void test1000(Network network)
    {
        TestData testData[] = new TestData[10000];
        double possibleError=0.5;
        Changer changer = new Changer();
        int result=0;
        for(int i=0;i<10000;i++)
        {
            testData[i]=new TestData();
            System.out.println("Mialo byc: " + testData[i].getResult() + " a wyszlo " + changer.from_01_to_normal(network.guess((testData[i].getTab()))));
            if(Math.abs(testData[i].getResult()-changer.from_01_to_normal(network.guess(testData[i].getTab())))<=possibleError)
            {
                result++;
            }
        }

        System.out.println("Wynik dla 1000 testow "+ 100*result/10000 + "%");
    }


}
