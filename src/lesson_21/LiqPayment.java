package lesson_21;

public class LiqPayment extends Payment{
    @Override
    public void commitPay() {
        System.out.println("Comitting Liqpay payment");
    }

    @Override
    public void getPaymneName() {
        System.out.println("Liqpay");
    }

    @Override
    public void rejectPay() {
        System.out.println("Rejecting Liqpay payment");

    }
}
