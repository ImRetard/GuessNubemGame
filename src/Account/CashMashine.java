package Account;

import java.util.Random;
import java.util.Scanner;

public class CashMashine {
    private int avaibleCash;
    private Scanner scan = new Scanner(System.in);


    public CashMashine() {
        Random newRandom = new Random();
        avaibleCash = newRandom.nextInt(100000);
    }

    private void setAvaibleCash(int avaibleCash) {
        this.avaibleCash = avaibleCash;
    }

    public void drawMoney() {
        System.out.print("Enter card number ");
        String tempCNumber = scan.next();

        Account acc =  AccountServices.getAccount(tempCNumber);
        if(acc!=null){
            System.out.println("Enter amount of money to draw: ");
            int needMoney = scan.nextInt();
            if (needMoney < avaibleCash) {
                acc.balanceMinus(needMoney);
                setAvaibleCash(avaibleCash - needMoney);
            }else System.out.println("Low cash limit in cashmashine, sorry");
        }else{
            System.out.println("Go away little bastard!!!");
        }

    }

    @Override
    public String toString() {
        return "CashMashine{" +
                "avaibleCash=" + avaibleCash +
                '}';
    }
}
