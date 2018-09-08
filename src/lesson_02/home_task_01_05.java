package lesson_02;

import java.util.Scanner;
/*
Первая написанный в одиночку работающий алгоритм.
Непередаваемые ощущения
 */
public class home_task_01_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y, z;
        System.out.print("Введите первый символ: ");
        x=input.nextDouble();
        System.out.print("Введите второй символ: ");
        y=input.nextDouble();
        System.out.print("Введите третий символ: ");
        z=input.nextDouble();

        if ((x > 2)&&(x < 15)) {
            x=x*2;
        }
        else x=x/10;
        if ((y > 2)&&(y < 15)) {
            y=y*2;
        }
        else y=y/10;
        if ((z > 2)&&(z < 15)) {
            z=z*2;
        }
        else z=z/10;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
