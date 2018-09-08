package lesson_02;

import java.util.Scanner;

/*
Дано дійсні числа x,y. Якщо x i y від’ємні, то обидва числа замінити їх модулем.
Якщо від’ємне тільки одне число, то його значення збільшити на значення другого числа.
Якщо два числа додатні і ні одне із них не належить відрізку [0.5,2.0], то обидва числа зменшити в 10 раз.
Вивести отриманий результат.
 */
public class home_task_02_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x, y;
        System.out.println("Введите число X:");
        x = input.nextDouble();
        System.out.println("Введите число Y:");
        y = input.nextDouble();
        if ((x < 0) && (y < 0)) {
            x = Math.abs(x);
            y = Math.abs(y);

        }

        if ((x < 0) && (y > 0)) {
            x = x * y;
        }
        if ((x > 0) && (y < 0)) {
            y = x * y;
        }
         if ((x > 0) && (y > 0) && ((x < 0.5) || (x > 2)) && ((y < 0.5) || (y > 2))) {
            x = x / 10;
            y = y / 10;
        }
        System.out.println(x);
        System.out.println(y);
    }
}
