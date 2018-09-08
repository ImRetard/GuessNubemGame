package Project;

public class UserGold extends User {
    private int balance;

    public UserGold() {
        this.balance = 1000;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "UserGold{" +
                "balance=" + balance +
                "} " + super.toString();
    }
}
