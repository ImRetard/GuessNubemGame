package Project;

import java.util.ArrayList;

public class UserTest {
    public static void main(String[] args) {
        UserGold acc = new UserGold();
        UserExtra acc1 = new UserExtra();

        ArrayList<User> users = new ArrayList<>();

        users.add(new User());
        users.add(new UserExtra());
        users.add(new UserGold());

        for (int i = 0; i <users.size() ; i++) {
            System.out.println(users.get(i).toString());
        }

    }
}
