package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Accounts {
    public static int tempid=0;
    private static Scanner sc = new Scanner(System.in);
    private static String filePath = "accounts.txt";
    private static ArrayList<Accounts> accounts = new ArrayList<>();
    private int id;
    private String username;
    private String pass;
    private String email;
    private static boolean acceptuser=false;



    public Accounts(int id, String username, String pass, String email) {
        this.id = id;
        this.username = username;
        this.pass = pass;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        tempid++;
        tempid=id;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static boolean isAcceptuser() {
        return acceptuser;
    }

    public static void setAcceptuser(boolean acceptuser) {
        Accounts.acceptuser = acceptuser;
    }
}
