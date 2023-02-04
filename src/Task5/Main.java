package Task5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        RandomStringDouble randomStringDouble = new RandomStringDouble();
        Massive massive = new Massive();
        System.out.println("Матрица состоящая из строк 10х10 (первоначальная):");
        Arrays.stream(massive.doTwoMassive()).map(Arrays::toString).forEach(System.out::println);

    }


}
