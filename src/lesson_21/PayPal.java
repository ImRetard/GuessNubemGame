package lesson_21;

public class PayPal implements Paylable,Printable {
    @Override
    public void commitPay() {
        System.out.println("Comitting PayPal payment");
    }

    @Override
    public void getPaymneName() {
        System.out.println("PayPal");
    }

    @Override
    public void rejectPay() {
        System.out.println("Rejecting PalPal payment");

    }

    @Override
    public void printInfo() {
        System.out.println("PayPal payment");
    }
}
