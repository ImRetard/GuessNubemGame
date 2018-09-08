//package lesson_4_console_menu;
//
//import java.util.Scanner;
//
//public class consoleMenu {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int menuNumber;
//
//        do {
//            // Program menu
//            System.out.println("\n1 - first menu");
//            System.out.println("2 - second menu");
//            System.out.println("0 - exit menu");
//
//            //User choice
//            do {
//                System.out.print("\n\tPlease enter menu number: ");
//                menuNumber = input.nextInt();
//                if (menuNumber < 0 || menuNumber > 2) {
//                    System.out.println("Wrong menu number, please try again");
//                } else break;
//            } while (true);
//
//            //Do action
//            switch (menuNumber) {
//                case 1:
//                    System.out.println("\n Some first action");
//                    break;
//                case 2:
//                    System.out.println("\nSome second action");
//                    break;
//                case 0: System.exit(0);
//            }
//        } while (true);
//
//    }
//}
//
//
///**
// * 1. Show menu
// * 2. User choice
// * 3. Do action
// */