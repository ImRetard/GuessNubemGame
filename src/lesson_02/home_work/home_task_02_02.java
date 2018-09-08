package lesson_02.home_work;

import java.util.Scanner;

/*
Знайти кількість чисел, які більші за середнє арифметичне в діапазоні від a до b
 */
public class home_task_02_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        int summ = 0;
        int counter = 0;
        double avg = 0;

        System.out.print("Ведите число а:");
        a = input.nextInt();
        System.out.print("Ведите число b:");
        b = input.nextInt();

        for (int i = a; i <= b; i++) {
            summ += i;
            counter++;
        }

        avg = (double) summ / counter;
        System.out.println("Сумма=" + summ);
        System.out.println("Количество чисел=" + counter);
        System.out.println("Среднее арифметическое=" + avg);

        counter = 0;
        for (int i = a; i <= b; i++) {
            if (i > avg) {
                counter++;
                System.out.println("i = "+i);
            }
        }
        System.out.println("Количество чисел по условию  (i>avg) " + counter);


    }
}
