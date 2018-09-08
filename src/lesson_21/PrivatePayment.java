package lesson_21;

public class PrivatePayment extends Payment {
    @Override
    public void commitPay() {
        System.out.println("Comitting Private24 payment");
    }

    @Override
    public void getPaymneName() {
        System.out.println("Private24");
    }

    @Override
    public void rejectPay() {
        System.out.println("Rejecting Private24 payment");

    }
}
