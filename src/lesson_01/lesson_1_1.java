package lesson_01;

import java.util.Scanner;

public class lesson_1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         byte someV;
         char someSymbol = 66;

        System.out.print("Please enter your value : ");
        someV = input.nextByte();

        System.out.println("Your value = "+someV);
        System.out.println("Your symbol = "+someSymbol);

        System.out.println(System.currentTimeMillis());

    }
}
