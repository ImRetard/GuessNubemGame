package lesson_35_Set;

import java.io.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetBook {

    public static void main(String args[]) throws IOException {
        String book = getData("message.txt");
//        System.out.println(book);
        String[] words = devideTowords(book);

        System.out.println(words.length);
        Set<String> almostnewSet=getUniquewords(words);
        System.out.println(almostnewSet.size());

        almostnewSet.forEach((T)-> System.out.println(T));

    }

    public static String getData(String alfa) {
        StringBuilder text = new StringBuilder();
        try {
            String str = null;
            BufferedReader br = new BufferedReader(new FileReader(alfa));
            while ((str = br.readLine()) != null) {
                text.append(str);
                text.append(" ");

            }

            br.close();
        } catch (IOException exc) {
            System.out.println("IO error!" + exc);

        }
        return text.toString();
    }

    public static String[] devideTowords(String alfa) {
        String[] wordsArray = alfa.split("\\W+", 30);
        return wordsArray;

    }

    public static Set<String> getUniquewords(String[] beta) {
        Set<String> newSet = new LinkedHashSet<>();
        for (int i = 0; i < beta.length; i++) {
            newSet.add(beta[i]);


        }
        return newSet;

    }

}

//todo contains all, retain all;
/*

  String[] text = new String[0];
        try {
            String str = null;
            BufferedReader br = new BufferedReader(new FileReader("message.txt"));
            while ((str = br.readLine()) != null) {
                //получаем новые слова
                String[] newWords = str.split(" ");
                //создаем расширенный массив
                String[] result = new String[text.length + newWords.length];
                //копируем элементы в массив
                System.arraycopy(text, 0, result, 0, text.length);
                System.arraycopy(newWords, 0, result, text.length, newWords.length);
                //присваиваем результирующий массив текущему
                text = result;

            }

            br.close();
        } catch (IOException exc) {
            System.out.println("IO error!" + exc);
            for (int i = 0; i < ; i++) {
                System.out.println(text[i]);

            }
        }
 */