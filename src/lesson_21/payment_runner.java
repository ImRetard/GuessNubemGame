package lesson_21;

import java.util.ArrayList;
import java.util.Scanner;

public class payment_runner {
    private static Scanner ch = new Scanner(System.in);

    public static void main(String[] args) {
        payment(getPayments());

    }

    public static ArrayList getPayments() {
        ArrayList<Payment> payments = new ArrayList<>();
        payments.add(new PrivatePayment());
        payments.add(new LiqPayment());
        payments.add(new VVebmoneyPayment());
        return payments;
    }

    public static void payment(ArrayList pmt) {
        ArrayList<Payment> payments = pmt;
        Payment paym;

        for (int i = 0; i < payments.size(); i++) {
            System.out.print(i + " - ");
            payments.get(i).getPaymneName();

        }
        System.out.print("Please choose payment type ");
        int userChoise = ch.nextInt();

        paym = payments.get(userChoise);
        paym.commitPay();
        paym.rejectPay();

    }
}
