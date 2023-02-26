package Task9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PerimeterSquare perimeterSquare = new PerimeterSquare();
        try {
            perimeterSquare.getPerimeter("2");
        } catch (PerimeterException e) {
            throw new RuntimeException(e);
        }
        //1 исключение отлавливает ошибку NumberFormatException
        Scanner scanner = new Scanner(System.in);
        String numAsSyr = scanner.nextLine();
        try {
            double d = Double.parseDouble(numAsSyr.trim());
        } catch (NumberFormatException ex) {
            System.out.println("Не число или пустая строка!");
        }

        //2 исключение отлавливает ошибку ArrayIndexOutOfBoundsException
        int array[] = new int[2];
        try {
            System.out.println("Доступ к третьему элементу:" + array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение:" + e);
        } finally {
            array[0] = 6;
            System.out.println("Значение первого элемента: " + array[0]);
            System.out.println("Оператор finally выполнен.");
        }
    }
}



