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

    public String[] concatDiagonalArray() {
        String[] concatDiagonalArray = Arrays.copyOf(doOneDiagonal(),
                doOneDiagonal().length + doTwoDiagonal().length);
        System.arraycopy(doTwoDiagonal(), 0, concatDiagonalArray,
                doOneDiagonal().length, doTwoDiagonal().length);
        return concatDiagonalArray;
    }

    public void printConcatDiagonalArray() {
        for (String s : concatDiagonalArray()) {
            System.out.print(s + " ");
        }
    }
    public void toSBDouble() {
        int count = 0;
        StringBuilder strBuilder = new StringBuilder();
        for (String s : concatDiagonalArray()) {
            if (isNumeric(s)) {
                count++;
            } else {
                strBuilder.append(s);
                System.out.print(strBuilder.substring(1, 4) + ",");
                strBuilder.setLength(0);
            }
        }
        System.out.println();
        double[] arrayDouble = new double[count];
        int tempContainer = 0;
        for (String s : concatDiagonalArray()) {
            if (isNumeric(s)) {
                arrayDouble[tempContainer] = Math.round(Double.parseDouble(s));
                tempContainer++;
            }
        }
        for (double v : arrayDouble) {
            System.out.print(v + "_");
        }
        System.out.println();
    }

    private boolean isNumeric(String containerDiagonalArray) {
        return containerDiagonalArray != null && containerDiagonalArray.matches("[-+]?\\d*\\.?\\d+");
    }
}