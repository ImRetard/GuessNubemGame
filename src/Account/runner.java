package Account;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        AccountServices.openAccount();
        AccountServices.openAccount();


        AccountServices.showAccounts();

        CashMashine cashM = new CashMashine();
        System.out.println(cashM.toString());

        cashM.drawMoney();

        AccountServices.showAccounts();


        System.out.println(cashM.toString());

    }
}