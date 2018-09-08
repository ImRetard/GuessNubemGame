package interface_lesson_22;

import java.util.ArrayList;
import java.util.Scanner;

public class Replacer {
    private Print printer;
    private Read reader;

    private int key;


    public Replacer(Print printer, Read reader) {
        this.printer = printer;
        this.reader = reader;
    }

    public Replacer(Print printer, Read reader, int key) {
        this.printer = printer;
        this.reader = reader;
        this.key = key;
    }

    public void replace() {

        //String replane=readLine.replace("a","b");
        // printer.shovvDate(replane);
    }

    /*public void caecar() {
        System.out.println("Enter line: ");
        String readLine = ch.nextLine();
        ArrayList<String> abc = new ArrayList<>();
        abc.add(0, "a");
        abc.add(0, "a");
        abc.add(1, "b");
        abc.add(2, "c");
        abc.add(3, "d");
        abc.add(4, "e");
        abc.add(5, "f");
        abc.add(6, "g");
        abc.add(7, "h");
        abc.add(8, "i");
        abc.add(9, "j");
        abc.add(10, "k");
        abc.add(11, "l");
        abc.add(12, "m");
        abc.add(13, "n");
        abc.add(14, "o");
        abc.add(15, "p");
        abc.add(16, "q");
        abc.add(17, "r");
        abc.add(18, "s");
        abc.add(19, "t");
        abc.add(20, "u");
        abc.add(21, "v");
        abc.add(22, "w");
        abc.add(23, "x");
        abc.add(24, "y");
        abc.add(25, "z");
        abc.add(26, "0");
        abc.add(27, "1");
        abc.add(28, "2");
        abc.add(29, "3");
        abc.add(30, "4");
        abc.add(31, "5");
        abc.add(32, "6");
        abc.add(33, "7");
        abc.add(34, "8");
        abc.add(35, "9");
        for (int i = 0; i < readLine.length(); i++) {
            String sumbol = readLine.substring(i, i);
            for (int j = 0; j < abc.size(); j++) {
                String arraySymbol = abc.get(j);
                if (sumbol.equals(arraySymbol)) {
                    sumbol = abc.get(j + 1);
                    System.out.println(sumbol);
                }

            }


        }

    }*/

    public void nevvCaecar() {
        String getLine = reader.getDate();
        StringBuilder resultLine = new StringBuilder();

//        int s = 'a';
//        System.out.println(s);
//        s++;
//        char newSymbol = (char) s;
//        System.out.println(s);
//        System.out.println(newSymbol);

        for (int i = 0; i < getLine.length(); i++) {

            int symbol = getLine.charAt(i);
            symbol+=key;
            resultLine.append((char)symbol);
        }

        printer.shovvDate(resultLine.toString());
    }
}
