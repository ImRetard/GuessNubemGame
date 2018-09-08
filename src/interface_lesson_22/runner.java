package interface_lesson_22;

import java.io.FileReader;
import java.util.Scanner;

public class runner {
    private static String filePath = "message.txt";
    private static Print printer;
    private static Read reader;
    private static Replacer rep;

    public static void main(String[] args) {

        int menu;
        do {
            showMenu();
            menu = userChoice();
            doAction(menu);
        } while (true);
    }

    public static void showMenu() {
        System.out.println("\n1 - From file to file");
        System.out.println("2 - From file to console");
        System.out.println("3 - console to console");
        System.out.println("4 - console to file");
        System.out.println("0 - exit");
    }

    public static int userChoice() {
        Scanner input = new Scanner(System.in);
        int menuNumber;
        do {
            System.out.print("\n\tPlease enter menu number: ");
            menuNumber = input.nextInt();
            if (menuNumber < 0 || menuNumber > 4) {
                System.out.println("Wrong menu number, please try again");
            } else break;
        } while (true);
        return menuNumber;
    }

    public static void doAction(int number) {
        switch (number) {
            case 1:
                printer = new FilePrinter(filePath);
                reader = new FReader(filePath);
                break;
            case 2:
                printer = new ConsolePrinter();
                reader = new FReader(filePath);
                break;
            case 3:
                printer = new ConsolePrinter();
                reader = new ConsoleReader();
                break;
            case 4:
                printer = new FilePrinter(filePath);
                reader = new ConsoleReader();
                break;
            case 0:
                System.exit(0);
        }

        rep = new Replacer(printer, reader, 1);
        rep.nevvCaecar();
    }
}

