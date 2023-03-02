package Gun31_Enum._02_Erum;

public class User {
    String username;
    Role role;
    Status status;

    public User(String username, Role role, Status status) {
        this.username = username;
        this.role = role;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", role=" + role +
                ", status=" + status +
                '}';
    }
}
