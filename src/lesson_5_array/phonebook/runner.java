package lesson_5_array.phonebook;

import lesson_9.Phonebook;

import java.util.Random;
import java.util.Scanner;

public class runner {

    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();

        do {
            showMenu();
            doAction(userChoice(), phonebook);
        } while (true);
    }

    public static void showMenu() {
        System.out.println("\n1 Add number");
        System.out.println("2 Edit number");
        System.out.println("3 Show all phonebook");
        System.out.println("4 Delete number");
        System.out.println("5 Create random number");
        System.out.println("6 Search number");
        System.out.println("7 Sort number");
        System.out.println("0 Exit");

    }

    public static int userChoice() {
        Scanner input = new Scanner(System.in);
        int menuNumber;
        do {
            System.out.print("\nPlease enter menu number: ");
            menuNumber = input.nextInt();
            if (menuNumber < 0 || menuNumber > 7) {
                System.out.println("Wrong menu number, please try again");
            } else break;
        } while (true);
        return menuNumber;
    }

    public static void doAction(int number, PhoneBook phb) {
        switch (number) {
            case 1:
                phb.addNumber();
                break;

            case 2:
                //editNumber();
                break;

            case 3:
                phb.showNumbers();
                break;
            case 4:
                //deleteNumber();
                break;
            case 5:
                phb.random();
                break;
            case 6:
                phb.searchNumber();
                break;
            case 7:
                phb.sortNumbers();
                phb.showNumbers();
                break;
            case 0:
                System.exit(0);
        }
    }

}
