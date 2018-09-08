package Account;

import java.io.IOException;
import java.util.Scanner;

public class AccountServicesrunner {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int menu;
        do {
            try {
                AccountServices.loadData();
            } catch (IOException e) {
                //e.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
            showMenu();
            menu = userChoice();
            doAction(menu);
        } while (true);
    }

    public static void showMenu() {
        System.out.println("\n1 - Open account");
        System.out.println("2 - Close account");
        System.out.println("3 - Get account info");
        System.out.println("4 - Show accounts info");
        System.out.println("0 - exit menu");
    }

    public static int userChoice() {
        int menuNumber;
        do {
            System.out.print("\n\tPlease enter menu number: ");
            menuNumber = input.nextInt();
            if (menuNumber < 0 || menuNumber > 4) {
                System.out.println("Wrong menu number, please try again");
            } else break;
        } while (true);
        return  menuNumber;
    }

    public static void doAction(int number) {
        switch (number) {
            case 1:
                System.out.println("\nOpening new account");
                AccountServices.openAccount();
                break;
            case 2:
                System.out.println("\nClose account");
                AccountServices.showAccounts();
                System.out.print("Please enter account ID: ");
                AccountServices.closeAccount(AccountServices.getAccount(input.next()));

                break;
            case 3:
                System.out.println("\nAccount info: ");
                System.out.print("Please enter account ID: ");
                System.out.println(AccountServices.getAccount(input.next()));
                break;
            case 4:
                System.out.println("\nAccounts info: ");
                AccountServices.showAccounts();
                break;
            case 0: System.exit(0);
        }
    }
}
