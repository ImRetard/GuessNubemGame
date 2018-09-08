package lesson_01.home_task01;

import java.util.Scanner;

public class home_task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1, x2, y1, y2;
        double d = 0;
        System.out.print("X1 = ");
        x1 = input.nextInt();
        System.out.print("X2 = ");
        x2 = input.nextInt();
        System.out.print("Y1 = ");
        y1 = input.nextInt();
        System.out.print("Y2 = ");
        y2 = input.nextInt();

        d = Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
        System.out.println(d);

    }
}

