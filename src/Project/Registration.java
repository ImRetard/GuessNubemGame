package Project;

import java.util.Random;
import java.util.Scanner;

public class Registration {
    private static Scanner sc = new Scanner(System.in);



    public static void openAccount(Accounts acc){
        System.out.println("Enter username: ");
        acc.setUsername(sc.next());
        do {
            System.out.println("Enter password: ");
            String tempPass=sc.next();
            System.out.println("Enter password again: ");
            String tempPass1=sc.next();
            if(tempPass.equals(tempPass1)){
                acc.setPass(tempPass);
            }else System.out.println("Wrong pass, try again");
        } while (true);

    }
    public static void checkMail(Accounts acc){
        Random checkMail = new Random();
        System.out.println("We send you unique accept code. Check email and enter: ");
        checkMail.nextInt(5);
        int add=sc.nextInt();
        //не придумал как передать значение рандома для сравнения, и вообще не представляю, как реализовать отправку на емейл)
        /*if (add = checkMail) {
            acc.setAcceptuser(true);
        } else {
            System.out.println("Wrong accept code, try again");}
        */

    }

}
