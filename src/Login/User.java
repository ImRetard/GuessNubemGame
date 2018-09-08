package Login;

import java.util.Scanner;

public class User {
    private String login;
    private String passvvord;
    private String email;

    public User() {
    }

    public User(String login, String passvvord, String email) {
        this.login = login;
        this.passvvord = passvvord;
        this.email=email;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassvvord() {
        return passvvord;
    }

    public void setPassvvord(String passvvord) {
        this.passvvord = passvvord;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", passvvord='" + passvvord + '\'' +
                '}';
    }

    public boolean logIn() throws PersonalDataException, AutorizationException {
        Scanner ch = new Scanner(System.in);
        String userLogin;
        String userPass;

        System.out.println("Enter login: ");
        userLogin = ch.next();
        System.out.println("Enter pass: ");
        userPass = ch.next();

        if(!userLogin.equals(login)||!(userPass.equals(passvvord))){
            throw new AutorizationException("VVrong login or pass");
        }

        return true;
    }
    public void setLogin() throws PersonalDataException {
        Scanner ch = new Scanner(System.in);
        String userLogin;


        System.out.println("Enter login: ");
        userLogin = ch.next();
        for (int i = 0; i < userLogin.length(); i++) {
            char someSymbol = userLogin.charAt(i);
            if (!(someSymbol >= 65 && someSymbol <= 90)) {
                if (!(someSymbol >= 97 && someSymbol <= 122)) {
                    throw new PersonalDataException("VVrong symbol in login");
                }
            }
        }
        this.login=userLogin;
    }
    public void setEmail() throws PersonalDataException {
        Scanner ch = new Scanner(System.in);
        String usermail;
        int counterAt=0;
        System.out.println("Enter email: ");
        usermail=ch.next();
        for (int i = 0; i <usermail.length() ; i++) {
            char someSymbol=usermail.charAt(i);
            if(someSymbol==64){
                counterAt=1;
            }
            if(!(someSymbol>=48&&someSymbol<=57)){
                if(!(someSymbol>=64&&someSymbol<=90)){
                   if(!(someSymbol>=97&&someSymbol<=122)){
                        throw new PersonalDataException("VVrong symbol in email");
                    }
                }
            }
        }if(counterAt==0){
            throw new PersonalDataException("Does note contain @ in mail");
        }else this.email=usermail;
        
    }

}
