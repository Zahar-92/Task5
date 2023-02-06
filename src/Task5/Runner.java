package Task5;
import java.util.Arrays;
public class Runner {
RandomStringDouble variables = new RandomStringDouble();
        public void run() {
            RandomStringDouble randomStringDouble = new RandomStringDouble();
            Massive massive = new Massive();
            System.out.println("Матрица состоящая из строк 10х10 (первоначальная):");
            Arrays.stream(massive.doTwoMassive()).map(Arrays::toString).forEach(System.out::println);
            System.out.println("\nПрямая диагональ");
            for (int i = 0; i < massive.doOneDiagonal().length; i++) {
            System.out.print(massive.doOneDiagonal()[i] + " ");
            }
            System.out.println("\nПобочная диагональ");
            for (int i = 0; i < massive.doTwoDiagonal().length; i++) {
            System.out.print(massive.doTwoDiagonal()[i] + " ");
            }
            System.out.print("\n\nСравнение диагоналей показывет, что они не равны: ");
            System.out.println(massive.compare(massive.doOneDiagonal(), massive.doTwoDiagonal()));
        }

}
