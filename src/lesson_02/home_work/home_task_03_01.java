package lesson_02.home_work;

import java.util.Scanner;

/*

 */
public class home_task_03_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int veight;
        int counter = 0;
        double columns;

        System.out.println("Input max veight: ");
        veight = input.nextInt();

        columns = veight * 2 - 1;

        for (int i = 1; i <= veight; i++) {
            counter++;
            for (int j = 1; j <=columns; j++) {
                if(j==veight) System.out.print("^");
                else System.out.print("*");

            }

            System.out.println();
        }

    }

}
