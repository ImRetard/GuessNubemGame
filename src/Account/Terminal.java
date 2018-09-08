package Account;

import java.util.Random;
import java.util.Scanner;

public class Terminal {
    private int avaibleCash;
    private Scanner scan = new Scanner(System.in);

    public void setAvaibleCash(int avaibleCash) {
        this.avaibleCash = avaibleCash;
    }

    public Terminal() {
        Random newRandom = new Random();
        avaibleCash=newRandom.nextInt(5);
    }

    public void putMoney(Account acc){
        System.out.println("Enter amount of money to draw: ");
        int cashMoney=scan.nextInt();
        setAvaibleCash(avaibleCash+cashMoney);
        acc.balancePut(cashMoney);

    }

    @Override
    public String toString() {
        return "Terminal{" +
                "avaibleCash=" + avaibleCash +
                '}';
    }
}
