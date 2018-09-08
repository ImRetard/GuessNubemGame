
package lesson_02.home_work;

//Знайти суму всіх парних і не парних чисел
// які більші за суму чисел кратних трьом
// в діапазоні від a до b


import java.util.Scanner;

public class home_tak_02_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        int summ = 0;
        int summ1 = 0;
        int counter = 0;
        int iterator = 0;
        System.out.println("Input a: ");
        a = input.nextInt();
        System.out.println("Input b: ");
        b = input.nextInt();

        iterator = a;

        while (iterator <= b) {
            if (iterator % 3 == 0) {
                summ += iterator;
                counter++;
            }
            iterator++;

        }
        for (int i = a; i < b; i++) if (summ > i) summ1 += i;


        System.out.println(summ);
        System.out.println(summ1);


    }

}

