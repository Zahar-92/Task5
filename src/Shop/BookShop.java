package Shop;

import java.util.Scanner;

public class BookShop {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в книжный магазин!");
        String[] books = new String[] {"Философия_Java", "Изучаем_Java", "Совершенный_код", "Java_для_чайников"};
        printMenu();
        Scanner console = new Scanner(System.in);
        System.out.println("Введите номер меню");
        int menuNum = console.nextInt();
        while (true){
            if (menuNum == 1) {
                printAllBooks(books);
            }else if (menuNum == 2) {
            books = addBook(console, books);
            }else if (menuNum == 3) {
            books = removeBook (console, books);
            }else if (menuNum == 0) {
                System.out.println("Спасибо, что посетили наш магазин!)");
                System.exit(0);
            }
            System.out.println("Введите номер меню");
            menuNum = console.nextInt();
        }
    }

    private static String[] removeBook(Scanner console, String[] books) {
        System.out.println("Введите название книги");
        String inputBook = console.next();
        String[] resArray = new String[books.length - 1];
        int delIndex = 0;
        for (delIndex = 0; delIndex < books.length; delIndex++) {
            if (!books[delIndex].equals(inputBook)) {
                break;
            }
            resArray[delIndex] = books[delIndex];
            }

        for (int i = delIndex; i < resArray.length; i++) {
            resArray[i] = books[i + 1];
        }
        return resArray;
    }
    private static String[] addBook(Scanner console, String[] books) {
        System.out.println("Введите название книги");
        String inputBook = console.next();
        String[] resArray = new String[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            resArray[i] = books[i];
        }
        resArray[books.length] = inputBook;
        return resArray;
    }

    private static void printAllBooks(String[] books) {
        System.out.println("Наши книги:");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i] + " ");
        }
        System.out.println();
    }

    public static void printMenu(){
        System.out.println("Меню:\n" +
                "1. Вывести все книги\n" +
                "2. Добавить книгу\n" +
                "3. Удалить книгу\n" +
                "0. Выход");
    }
}
