package lesson_21;

import lesson_19.Box;

public class Lesson_22_runner_interface {
    public static void main(String[] args) {
        LiqPayment object=new LiqPayment();
        Payment paymentObject=object;
        paymentObject.commitPay();

        PayPal paypal1=new PayPal();
        Paylable payment1=paypal1;
        payment1.commitPay();

        Printable print1=paypal1;
        print1.printInfo();


    }
}
