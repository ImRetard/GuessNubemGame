package Login;

import java.util.Scanner;

public class Login_exception {
    public static void main(String[] args) {
        User someUser=new User();
        do {
            try {
                someUser.setLogin();
                someUser.setPassvvord("1111");
                someUser.logIn();
                break;
            } catch (PersonalDataException e) {
                System.out.println(e);
            } catch (AutorizationException e) {
                System.out.println(e);
            }
        } while (true);
        System.out.println("VVell done");

    }
}
