package lesson_02;

import java.util.Scanner;

/**
 * Знайти середнє арифметичне всіх цілих чисел від а до 300 (значення а вводиться з клавіатури; a≤300).
 */
public class task_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int summ = 0;
        int counter = 0;
        double avg;
        System.out.print("Пожалуйста, введите стартовое значение : ");
        a = input.nextInt();
        if (a <= 300) {
            for (int i = a; i <= 300; i++) {
                summ += i;
                counter++;
            }
            avg = (double)summ/counter;
            System.out.println("Сумма="+summ);
            System.out.println("Counter="+counter);
            System.out.println("Результат="+avg);

        } else System.out.println("Недопустимое значение");
    }

}
