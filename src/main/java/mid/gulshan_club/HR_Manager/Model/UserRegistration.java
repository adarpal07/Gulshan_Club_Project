package mid.gulshan_club.HR_Manager.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class UserRegistration implements Serializable {
    private  long id;
    private String name, type, department, address, email, gender;
    private LocalDate dateOfJoining;
    private int phoneNumber;

    public UserRegistration() {
    }

    private int nID;



    public UserRegistration(long id, String name, String type, String department, String address, String email, String gender, LocalDate dateOfJoining, int phoneNumber, int nID) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.department = department;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.dateOfJoining = dateOfJoining;
        this.phoneNumber = phoneNumber;
        this.nID = nID;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDepartment() {
        return department;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getnID() {
        return nID;
    }

    @Override
    public String toString() {
        return "UserRegistration{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", department='" + department + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", phoneNumber=" + phoneNumber +
                ", nID=" + nID +
                '}';
    }

}
