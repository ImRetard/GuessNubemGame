package lesson_02.home_work;
/*
Знайти кількість чисел, які кратні 3 в діапазоні від a до b
 */
import java.util.Scanner;

public class task_02_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        int counter = 0;
        int iterator = 0;

        System.out.print("Ведите число а:");
        a = input.nextInt();
        do {
            System.out.print("Ведите число b:");
            b = input.nextInt();

            if(b<=a){
                System.out.println("B<A!!!");
                System.out.println("TRY AGAIN");
            }else{
                break;
            }
        } while (true);

        iterator = a;

        while(iterator<=b){
            if(iterator%3 == 0){
                counter++;
            }
            iterator++;
        }

        System.out.println("counter = "+counter);

    }
}
