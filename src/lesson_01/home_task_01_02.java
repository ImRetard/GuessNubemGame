package lesson_01;

import java.util.Scanner;

public class home_task_01_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s, p, n;
        double x = 0;
        System.out.println("Введите первоначальную сумму кредита: ");
        s = input.nextInt();
        System.out.println("Введите ежемесячную ставку по проентам: ");
        p = input.nextInt();
        System.out.println("Количество месяцев кредита: ");
        n = input.nextInt();

        x = s * (p + (p / (Math.pow((1 + p), n) - 1)));
        System.out.println("Сумма ежемесячного платежа: " + x);

    }
}
