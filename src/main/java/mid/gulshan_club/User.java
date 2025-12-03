package mid.gulshan_club;

public class User {
    protected String userName, email, gender;
    protected final long  userId;
    protected int phoneNo;

    public User(long userId) {
        this.userId = userId;
    }

    public User(long userId, String userName, String email, String gender, int phoneNo) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.gender = gender;
        this.phoneNo = phoneNo;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public long getUserId() {
        return userId;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", userId=" + userId +
                ", phoneNo=" + phoneNo +
                '}';
    }

    public void updateProfile(){

    }
    public void changePassword(){

    }
}
