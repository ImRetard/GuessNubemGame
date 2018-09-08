package Project;

public class UserExtra extends User {
    private String avatar;

    public UserExtra() {
        this.avatar = "no avatar";
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "UserExtra{" +
                "avatar='" + avatar + '\'' +
                "} " + super.toString();
    }
}
