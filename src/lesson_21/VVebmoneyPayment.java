package lesson_21;

public class VVebmoneyPayment extends Payment{
    @Override
    public void commitPay() {
        System.out.println("Comitting VVebmoney payment");
    }

    @Override
    public void getPaymneName() {
        System.out.println("VVebmoney");
    }

    @Override
    public void rejectPay() {
        System.out.println("Rejecting VVebmoney payment");

    }
}
