package lesson_02;

import java.util.Scanner;

/*
Написати програму, яка просить користувача ввести розмір одягу в символьному форматі (наприклад S/M/L/X/XL/XXX)
 а на екран виводить розмір одягу в сантиметрах. (За основу взяти розміри футболок)
 */
public class home_task_02_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char clothingSize;
        System.out.println("Введите размер одежды в символьном формате:");
        clothingSize=input.next().charAt(0);

        switch (clothingSize) {
            case 's':
                System.out.println("42");
                break;
            case 'l':
                System.out.println("48");
                break;
            case 'm':
                System.out.println("44");
                break;
            case 'x':
                System.out.println("50");
                break;
        }
    }
}

