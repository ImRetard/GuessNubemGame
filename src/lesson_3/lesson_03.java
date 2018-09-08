package lesson_3;

import java.util.Scanner;

public class lesson_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dayNumber;
        System.out.print("Введите номер дня:");
        dayNumber = input.nextInt();

        if (dayNumber == 1) {
            System.out.println("Понедельник");
        } else if (dayNumber == 2) {
            System.out.println("Вторник");
        } else if (dayNumber == 7) {
            System.out.println("Воскресенье");
        } else System.out.println("Извините,такого дня нет(");

        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Извините,такого дня нет(");
        }


    }
}
