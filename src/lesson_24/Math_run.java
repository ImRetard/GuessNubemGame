package lesson_24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Math_run {
    public static void main(String[] args) {
        submain();
    }

    public static void submain() {
        Scanner ch = new Scanner(System.in);
        int a,b;
        double result=0;

        do {

            try {
                System.out.println("Enter a: ");
                a = ch.nextInt();
                System.out.println("Enter b: ");
                b = ch.nextInt();
                result = (a / b);
                System.out.println(result);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Devading by zero");
            } catch (InputMismatchException exp){
                System.out.println("VVrong input number :(");
                ch.next();

            }
        } while (true);

    }
}
