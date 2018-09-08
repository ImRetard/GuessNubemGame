package Account;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Account implements Serializable {
    private static final long SerialVersionUID = 100500L;
    private static int nextID = 0;

    private int id;
    private String name;
    private String pass;
    private String cardNumber;
    private LocalDate dataEnd;
    private String cvv2;
    private boolean isLockd;
    private int balance = 0;


    public Account() {
        setId();
        this.name = "no name";
        this.pass = newRandomNumbers(4);
        this.cardNumber = newRandomNumbers(16);
        setDataEnd(LocalDate.now());
        this.cvv2 = newRandomNumbers(3);
        this.isLockd = false;
        this.balance = Integer.parseInt(newRandomNumbers(3));
    }

    public Account(String name, String pass, String cardNumber, LocalDate dataEnd, String cvv2) {
        setId();
        this.name = name;
        this.pass = pass;
        this.cardNumber = cardNumber;
        this.dataEnd = dataEnd;
        this.cvv2 = cvv2;
        this.balance = balance;
    }

    public static void setNextID(int nextID) {
        Account.nextID = nextID;
    }

    public int getId() {
        return id;
    }

    private void setId() {
        this.id = nextID;
        nextID++;
    }

    public static int getNextID() {
        return nextID;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    private String getPass() {
        return pass;
    }

    private void setPass(String pass) {
        this.pass = pass;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    private void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getDataEnd() {
        return dataEnd;
    }

    private void setDataEnd(LocalDate dataEnd) {
        this.dataEnd = dataEnd.plusYears(4);
    }

    public String getCvv2() {
        return cvv2;
    }

    private void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {

        return balance;
    }


    //TODO 2. methods for password : check, change
    //TODO 3. methods for balance : draw, put

    private String newRandomNumbers(int size) {
        StringBuilder numbers = new StringBuilder();
        Random numbGengtr = new Random();
        for (int i = 0; i < size; i++) {
            numbers.append(numbGengtr.nextInt(10));


        }
        return numbers.toString();
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", dataEnd=" + dataEnd +
                ", cvv2='" + cvv2 + '\'' +
                ", isLockd=" + isLockd +
                ", balance=" + balance +
                '}';
    }

    public static Account getInstance() {
        return new Account();
    }

    public boolean checkPass() {
        String tempPass = "";
        int counterLimit = 1;
        Scanner input = new Scanner(System.in);
        do {
            if (counterLimit <= 3) {
                System.out.println("Please input your password");
                tempPass = input.next();
            } else {
                isLockd = true;
                System.out.println("You card is lockd");
                return false;
            }
            counterLimit++;
        } while (!tempPass.equals(pass));

        return true;

    }

    public void changePass() {
        Scanner input = new Scanner(System.in);
        do {
            if (checkPass()) {
                System.out.println("Enter new password: ");
                String check1 = input.next();
                System.out.println("Enter new password again: ");
                String check2 = input.next();
                if (!check1.equalsIgnoreCase(check2)) {
                    System.out.println("Wrong confirm password! Try again!");

                } else {
                    setPass(check1);
                }
                break;
            }
        } while (true);

    }

    public void balancePut(int money) {
        if (checkPass()) {
            setBalance(balance + money);
        }

    }

    public void balanceMinus(int needMoney) {
        if (checkPass()) {
            if (needMoney <= balance) {
                setBalance(balance - needMoney);
            } else System.out.println("Low balance: " + balance);
        }
    }


}

