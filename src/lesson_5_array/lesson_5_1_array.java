package lesson_5_array;

import java.util.Random;
import java.util.Scanner;

public class lesson_5_1_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String name = "Nazar";
        String phone = "0682864864";
        System.out.print("Enter array size: ");
        int arraySize=input.nextInt();
        float dayTemp[] = new float[arraySize];
        int indexA;
        int valueA;
        int userChoise;
        //dayTemp[20] = 25;


       /* for (int i = 0; i < arraySize ; i++) {
            dayTemp[i] = random.nextInt(25)+10+random.nextFloat();
        }*/

        do {
            System.out.println("Enter element index: ");
            indexA=input.nextInt();

            System.out.println("Enter value: ");
            valueA=input.nextInt();

            dayTemp[indexA] = valueA;
            System.out.println("Do you want another? 1-yes/0-no: ");
            userChoise=input.nextInt();
            if (userChoise==0) break;
        } while (true);



        for (int i = 0; i < arraySize; i++) {
            System.out.println("dayTemp " + i + " = " + String.format("%.4g%n", dayTemp[i]));
        }

        /*
        [30] <-temp15


        [][][][][][]...[20]
        0 1 2 3 4 5... 23 <-dayTemp

         */
    }
}
