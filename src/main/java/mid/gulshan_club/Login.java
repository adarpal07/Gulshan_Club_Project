package mid.gulshan_club;

public class Login {
    private final long id;
    private String password;

    public Login(long id, String password) {
        this.id = id;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
