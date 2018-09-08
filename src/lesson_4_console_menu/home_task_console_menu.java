package lesson_4_console_menu;
/*
Написати програму, яка б використовувала можливості функцій і консольного меню,
 для того щоб задавати діапазон чисел для подальшого обчислення суми чисел,
  добутку, середнього арифметичного, а також чисел кратних заданому числу користувачем.
 Для кожної окремої дії створити відповідну функцію і викликати її через відповідний пункт меню
 */

import java.util.Scanner;

public class home_task_console_menu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuNumber;
        int x;
        int y;


        do {


            showMenu();
            do {


                System.out.println("Выберите пункт меню: ");
                menuNumber = input.nextInt();
                if (menuNumber < 0 || menuNumber > 4) {
                    System.out.println("Неверный ввод. Попробуйте еще раз");
                } else break;
            } while (true);


            switch (menuNumber) {

                case 1:

                    System.out.println("Введите первое число");
                    x = input.nextInt();
                    System.out.println("Введите второе число");
                    y = input.nextInt();
                    System.out.println("Сумма: " + (x + y));
                    break;
                case 2:
                    System.out.println("Введите первое число");
                    x = input.nextInt();
                    System.out.println("Введите второе число");
                    y = input.nextInt();
                    System.out.println("Произведение: " + (x * y));
                    break;
                case 3:
                    System.out.println("Введите первое число");
                    x = input.nextInt();
                    System.out.println("Введите второе число");
                    y = input.nextInt();
                    System.out.println("Среднее арифметическое: " + ((double) (x + y) / 2));
                    break;
                case 4:
                    System.out.println("Введите число: ");
                    x = input.nextInt();
                    for (int i = 2; i <= 10; i++) {
                        if ((x % i) == 0) {
                            System.out.println("Число делится на " + i);
                        }


                    }
                    break;
                case 0:
                    System.exit(0);


            }
        } while (true);


    }

    public static void showMenu() {
        System.out.println("\n1 - Посчитать сумму");
        System.out.println("2 - Посчитать произведение");
        System.out.println("3 - Посчитать среднее арифметическое");
        System.out.println("4 - Посчитать кратность");
        System.out.println("0 - Выход");
    }



}

