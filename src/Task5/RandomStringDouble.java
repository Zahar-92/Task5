package Task5;

import java.util.Random;

import static Task5.Variables.LETTERS;

public final class RandomStringDouble {

    public static String randomDouble(){
        //return String.format("%.5f", Math.random()*10); почему данный способ вывводит с запятой значение double???
        return  String.valueOf(Math.random()*10).substring(0,7);
    }

    public static String randomString() {
        Random r = new Random();
        char[] str = new char[7];
        for (int i = 0; i < str.length; i++) {
           str[i] = LETTERS.charAt(r.nextInt(LETTERS.length()));
           }
            return String.valueOf (str);
    }
}