package Task5;

import java.util.Arrays;

public class Massive {
    public String[] doMassive() {
        String[] massive = new String[100];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = RandomStringDouble.randomString();
        }
        for (int i = 2; i < massive.length ; i+=3) {
            massive [i] = RandomStringDouble.randomDouble();
        }
        return massive;
    }

    public String[][] doTwoMassive(){
        String[][] matrix = new String [10][10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = doMassive()[count++];
            }
        }
        return matrix;
    }

    public String[] doOneDiagonal(){
        String[] oneDiagonal = new String[10];
        int countOne = 0;
        for (int i = 0; i < doTwoMassive().length; i++) {
            oneDiagonal[countOne] = doTwoMassive()[i][i];
                countOne++;
            }
        return oneDiagonal;
    }
    public String[] doTwoDiagonal() {
        String[] twoDiagonal = new String[10];
        int countOne = 0;
        for (int i = 0; i < doTwoMassive().length; i++) {
            twoDiagonal[countOne] = doTwoMassive()[i][9 - i];
            countOne++;
        }
        return twoDiagonal;
    }

    public boolean compare (String[] oneDiagonal, String[] twoDiagonal) {
        for (int i = 0; i < oneDiagonal.length; i++) {
            if (oneDiagonal[i].equals(twoDiagonal[i]))
                return true;
        }
        return false;
    }
}