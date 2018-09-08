/*
package lesson_4_console_menu;

import java.util.Scanner;

// [public static] [int/void] [name]([int a],....,[]){
// }

public class consoleMenuFunc {
    public static int a;

    public static void main(String[] args) {
        int menu;
        do {
            showMenu();
            menu = userChoice();
            doAction(menu);
        } while (true);
    }

    public static void showMenu() {
        System.out.println("\n1 - first menu");
        System.out.println("2 - second menu");
        System.out.println("0 - exit menu");
    }

    public static int userChoice() {
        Scanner input = new Scanner(System.in);
        int menuNumber;
        do {
            System.out.print("\n\tPlease enter menu number: ");
            menuNumber = input.nextInt();
            if (menuNumber < 0 || menuNumber > 2) {
                System.out.println("Wrong menu number, please try again");
            } else break;
        } while (true);
        return  menuNumber;
    }

    public static void doAction(int number) {
        switch (number) {
            case 1:
                System.out.println("\n Some first action");
                break;
            case 2:
                System.out.println("\nSome second action");
                break;
            case 0: System.exit(0);
        }
    }

    public static void sum() {

    }
}
*/
