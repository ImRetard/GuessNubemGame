package Account;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountServices {
    private static ArrayList<Account> accounts = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static String filePath = "accounts.txt";


    public static Account openAccount() {
        Account localAccount = new Account();
        System.out.print("Enter account holder name: ");
        localAccount.setName(sc.next());
        System.out.println(localAccount.toString());

        accounts.add(localAccount);
        try {
            saveData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return accounts.get(accounts.indexOf(localAccount));
    }

    public static Account getAccount(String id) {
        for (Account ac : accounts) {
            if (ac.getCardNumber().equals(id)) {
                return ac;
            }
        }
        return null;
    }

    public static void closeAccount(Account acc) {
        accounts.remove(acc);
        try {
            saveData();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void showAccounts() {
        for (Account sh : accounts) {
            System.out.println(sh);
        }
    }

    public static void saveData() throws IOException {
        FileOutputStream file = new FileOutputStream(filePath);
        ObjectOutputStream object = new ObjectOutputStream(file);
        object.writeObject(accounts);
        object.close();
        file.close();
    }

    public static void loadData() throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(file);

        accounts = (ArrayList<Account>) objectInputStream.readObject();
        if (accounts == null) {
            accounts = new ArrayList<Account>();
        }else{
            int lastId = accounts.get(accounts.size()-1).getId();
            Account.setNextID(lastId+1);
        }

    }

}
