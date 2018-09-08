package lesson_5_array.phonebook;

import java.util.Random;
import java.util.Scanner;

public class PhoneBook {
    Scanner input = new Scanner(System.in);
    Contact contacts[] = new Contact[0];


    public void addNumber() {
        String nameUser;
        String phoneNote;
        do {
            System.out.println("Enter user name: ");
            nameUser = input.next();
            System.out.print("Enter phone number: ");
            phoneNote = input.next();
            if (validationNumber(phoneNote)) {
                raseArray();
                contacts[contacts.length - 1].name = nameUser;
                contacts[contacts.length - 1].number = phoneNote;
                showNumbers();
                break;
            } else {
                System.out.println("Something wrong with number!!!");
                System.out.print("DO you want to try again? (1-yes/0-no): ");
                int choiseNow = input.nextInt();
                if (choiseNow == 0) break;
            }
        } while (true);
    }

    public void addNumber(String name, String number) {
        do {
            if (validationNumber(number)) {
                raseArray();
                contacts[contacts.length - 1] = new Contact();
                contacts[contacts.length - 1].name = name;
                contacts[contacts.length - 1].number = number;
                break;
            } else {
                System.out.println("Something wrong with number!!!");
                System.out.print("DO you want to try again? (1-yes/0-no): ");
                int choiseNow = input.nextInt();
                if (choiseNow == 0) break;
            }
        } while (true);
    }

    public void editNumber() {
        showNumbers();
        int index;
        do {
            System.out.println("Enter index note [0-" + (contacts.length - 1) + " :");
            index = input.nextInt();
            if (index < 0 || index > (contacts.length - 1)) {
                System.out.println("Wrong record number");

            } else break;
        } while (true);


        System.out.println("Enter new number: ");
        String phoneNote = input.next();
        contacts[index].number = phoneNote;
        System.out.println("Enter new name: ");
        String newName = input.next();
        contacts[index].name = newName;
        System.out.println("Phone number edited");
    }

    public void showNumbers() {
        System.out.println("ID\tUser Name\tPhone Number");
        for (int i = 0; i < contacts.length; i++) {
            System.out.print(i + "\t");
            System.out.println(contacts[i].name + "\t" + contacts[i].number);
        }
    }

    public void raseArray() {
        int newSize = contacts.length + 1;
        Contact newArray[] = new Contact[newSize];
        for (int i = 0; i < contacts.length; i++) {
            newArray[i] = contacts[i];
        }
    }

/*    public static void deleteNumber() {
        showNumbers();
        System.out.print("Enter index note: ");
        int indexNote = input.nextInt();

        for (int i = indexNote; i < phoneBook.length; i++) {
            if (i == phoneBook.length - 1) {
                phoneBook[i][colonnSize] = "";
            } else {
                phoneBook[i][colonnSize] = phoneBook[i + 1][colonnSize];

            }
        }
        eraseArray();
        showNumbers();
  }*/

    public void eraseArray() {
        int newSize = contacts.length - 1;
        Contact newArray[] = new Contact[newSize];
        for (int i = 0; i < newSize; i++) {
            newArray[i] = contacts[i];
        }
        contacts = newArray;
    }


    public void random() {
        String[] namesUser = {"Igor", "Alex", "Kristy", "Mike",
                "Jack", "Tony", "Stiv", "Hoockeye", "Brus"};
        Random rnd = new Random();
        int maxSize = 10;
        StringBuilder someNumber = new StringBuilder();

        System.out.print("Please enter numbers amount :");
        int amount = input.nextInt();

        for (int i = 0; i < amount; i++) {
            for (int j = 0; j < maxSize; j++) {
                someNumber.append(rnd.nextInt(10));
            }

            someNumber.replace(0, 3, "068");
            String name = namesUser[rnd.nextInt(namesUser.length)];
            addNumber(name, someNumber.toString());
            someNumber = new StringBuilder();
        }
    }

    public boolean validationNumber(String number) {
        String firstOperator = "068";

        if (number.length() != 10) {
            System.out.println("Incorrect number size, try again");
            return false;
        }

        if (!(number.substring(0, 3).equals(firstOperator))) {
            System.out.println("Unknow operator index");
            return false;
        }

        return true;
    }

    public void searchNumber() {
        System.out.println("Enter symbol for search: ");
        String searchIndex = String.valueOf(input.nextInt());
        System.out.println("Found numbers");
        for (int j = 0; j < contacts.length; j++) {

            if (contacts[j].number.matches("[" + searchIndex + "]")) {

                System.out.print(j + "\t");
                System.out.println(contacts[j].name + "\t" + contacts[j].number);

            }
        }
    }

    public void sortNumbers() {
        boolean swapped;

        for (int i = 0; i < contacts.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < contacts.length - i - 1; j++) {
                if (contacts[i].name.compareTo(contacts[j + 1].name) > 0) {
                    Contact temp = contacts[j];
                    contacts[j] = contacts[j + 1];
                    contacts[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }
}
