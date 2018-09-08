package lesson_01.home_task03;

import java.util.Scanner;

public class nome_task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y;
        System.out.print("X = ");
        x = input.nextDouble();
        System.out.print("Y = ");
        y = input.nextDouble();

        if (x > 0) {
            Math.abs(x);
            System.out.println("X = "+x);
        }
        if (y > 0) Math.abs(y);

        if (x > y) System.out.print(x);
        else System.out.print(x + y);


    }
}
