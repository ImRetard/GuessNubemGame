package lesson_02;
/*
Дано дійсні числа a,b,c (a≠0).
Вияснити чи має рівняння ax2+bx+c=0 дійсні корені.
Якщо є дійсні корені то знайти їх.
В іншому випадку повідомити що дійсних коренів немає.
 */

import java.util.Scanner;

public class home_task_01_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;
        double d = 0;


        do {
            System.out.print("Введите число a:");
            a = input.nextInt();

            if(a<=0){
                System.out.println("a должно быть > 0");
            }else{
                break;
            }
        } while (true);
        do {
            System.out.print("Введите число b:");
            b = input.nextInt();

            if(b<0){
                System.out.println("b должно быть >= 0");
            }else{
                break;
            }
        } while (true);
        do {
            System.out.print("Введите число c:");
            c = input.nextInt();

            if(c<0){
                System.out.println("c должно быть >= 0");
            }else{
                break;
            }
        } while (true);


        d = b * b - 4 * a * c;
        if (d > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней!");
        }


    }
}
