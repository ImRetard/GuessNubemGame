package Project;

public class User {
    private int id;
    private String username;
    private String pass;
    private String email;
    private UserState state;
    private Group group;

    public User() {
        this.id = 15;
        this.username = "User";
        this.pass = "123";
        this.email = "email@ya.ru";
        this.state = UserState.NEW;
        this.group = Group.GUEST;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public UserState getState() {
        return state;
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", pass='" + pass + '\'' +
                ", email='" + email + '\'' +
                ", state=" + state +
                ", group=" + group +
                '}';
    }
}
