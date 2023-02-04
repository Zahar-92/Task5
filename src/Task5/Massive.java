package Task5;

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

}
