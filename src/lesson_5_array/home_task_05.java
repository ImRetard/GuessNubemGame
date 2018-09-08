//package lesson_5_array;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class home_task_05 {
//    public static Scanner input = new Scanner(System.in);
//    public static String phoneBook[] = new String[0];
//
//    public static void main(String[] args) {
//        do {
//            showMenu();
//            doAction(userChoice());
//        } while (true);
//    }
//
//    public static void showMenu() {
//        System.out.println("\n1 Add number");
//        System.out.println("2 Edit number");
//        System.out.println("3 Show all phonebook");
//        System.out.println("4 Delete number");
//        System.out.println("5 Create random number");
//        System.out.println("6 Search number");
//        System.out.println("7 Sort number");
//        System.out.println("0 Exit");
//
//    }
//
//    public static int userChoice() {
//        Scanner input = new Scanner(System.in);
//        int menuNumber;
//        do {
//            System.out.print("\nPlease enter menu number: ");
//            menuNumber = input.nextInt();
//            if (menuNumber < 0 || menuNumber > 7) {
//                System.out.println("Wrong menu number, please try again");
//            } else break;
//        } while (true);
//        return menuNumber;
//    }
//
//    public static void doAction(int number) {
//        switch (number) {
//            case 1:
//                addNumber();
//                break;
//
//            case 2:
//                editNumber();
//                break;
//
//            case 3:
//                showNumbers();
//                break;
//            case 4:
//                deleteNumber();
//                break;
//            case 5:
//                randomNumber();
//                break;
//            case 6:
//                searchNumber();
//                break;
//            case 7:
//                sortNumbers();
//                showNumbers();
//                break;
//            case 0:
//                System.exit(0);
//        }
//    }
//
//    public static void addNumber() {
//        String phoneNote;
//        do {
//            System.out.print("Enter phone number: ");
//            phoneNote = input.next();
//            if (validationNumber(phoneNote)) {
//                raseArray();
//                phoneBook[phoneBook.length - 1] = phoneNote;
//                showNumbers();
//                break;
//            } else {
//                System.out.println("Something wrong with number!!!");
//                System.out.print("DO you want to try again? (1-yes/0-no): ");
//                int choiseNow = input.nextInt();
//                if (choiseNow == 0) break;
//            }
//        } while (true);
//    }
//
//
//    public static void addNumber(String number) {
//        do {
//            if (validationNumber(number)) {
//                raseArray();
//                phoneBook[phoneBook.length - 1] = number;
//                break;
//            } else {
//                System.out.println("Something wrong with number!!!");
//                System.out.print("DO you want to try again? (1-yes/0-no): ");
//                int choiseNow = input.nextInt();
//                if (choiseNow == 0) break;
//            }
//        } while (true);
//    }
//
//
//    public static void editNumber() {
//        showNumbers();
//        int index;
//        do {
//            System.out.println("Enter index note [0-" + (phoneBook.length - 1) + " :");
//            index = input.nextInt();
//            if (index < 0 || index > (phoneBook.length - 1)) {
//                System.out.println("Wrong record number");
//
//            } else break;
//        } while (true);
//
//
//        System.out.println("Enter new number: ");
//        String phoneNote = input.next();
//        phoneBook[index] = phoneNote;
//        System.out.println("Phone number edited");
//    }
//
//    public static void showNumbers() {
//        System.out.println("ID\tPhone Number");
//        for (int i = 0; i < phoneBook.length; i++) {
//            System.out.println(i + "\t" + phoneBook[i]);
//        }
//
//    }
//
//    public static void raseArray() {
//        int newSize = phoneBook.length + 1;
//        String newArray[] = new String[newSize];
//        for (int i = 0; i < phoneBook.length; i++) {
//            newArray[i] = phoneBook[i];
//        }
//        phoneBook = newArray;
//    }
//
//    public static void deleteNumber() {
//        showNumbers();
//        System.out.print("Enter index note: ");
//        int indexNote = input.nextInt();
//
//        for (int i = indexNote; i < phoneBook.length; i++) {
//            if (i == phoneBook.length - 1) {
//                phoneBook[i] = "";
//            } else {
//                phoneBook[i] = phoneBook[i + 1];
//
//            }
//        }
//        eraseArray();
//        showNumbers();
//    }
//
//    public static void eraseArray() {
//        int newSize = phoneBook.length - 1;
//        String newArray[] = new String[newSize];
//        for (int i = 0; i < newSize; i++) {
//            newArray[i] = phoneBook[i];
//        }
//        phoneBook = newArray;
//    }
//
//    public static void randomNumber() {
//
//        Random rnd = new Random();
//        int maxSize = 10;
//        StringBuilder someNumber = new StringBuilder();
//
//        System.out.print("Please enter numbers amount :");
//        int amount = input.nextInt();
//
//        for (int i = 0; i < amount; i++) {
//            for (int j = 0; j < maxSize; j++) {
//                someNumber.append(rnd.nextInt(10));
//            }
//
//            someNumber.replace(0, 3, "068");
//            addNumber(someNumber.toString());
//            someNumber = new StringBuilder();
//        }
//    }
//
//    public static boolean validationNumber(String number) {
//        String firstOperator = "068";
//
//        if (number.length() != 10) {
//            System.out.println("Incorrect number size, try again");
//            return false;
//        }
//
//        if (!(number.substring(0, 3).equals(firstOperator))) {
//            System.out.println("Unknow operator index");
//            return false;
//        }
//
//        return true;
//    }
//
//    public static void searchNumber() {
//        System.out.println("Enter symbol for search: ");
//        String searchIndex = String.valueOf(input.nextInt());
//        System.out.println("Found numbers");
//        for (int j = 0; j < phoneBook.length; j++) {
//
//            if (phoneBook[j].matches("[" + searchIndex + "]"))
//                System.out.println("[" + j + "]" + phoneBook[j]);
//
//        }
//    }
//
//    public static void sortNumbers() {
//        boolean swapped;
//
//        for (int i = 0; i < phoneBook.length - 1; i++) {
//            swapped = false;
//            for (int j = 0; j < phoneBook.length - i - 1; j++) {
//                if (phoneBook[i].compareTo(phoneBook[j + 1]) > 0) {
//                    String temp = phoneBook[j];
//                    phoneBook[j] = phoneBook[j + 1];
//                    phoneBook[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//            if (swapped == false)
//                break;
//        }
//    }
//
//
//}
//
//
//
//
