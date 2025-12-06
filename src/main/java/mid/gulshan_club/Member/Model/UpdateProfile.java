package mid.gulshan_club.Member.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class UpdateProfile implements Serializable {
    protected String memberName, address, email;
    protected int memberID, age, phoneNumber, nidNumber;
    protected LocalDate dateOfBirth;

    public UpdateProfile(String memberName, String address, String email, int memberID, int age, int phoneNumber, int nidNumber, LocalDate dateOfBirth) {
        this.memberName = memberName;
        this.address = address;
        this.email = email;
        this.memberID = memberID;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.nidNumber = nidNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNidNumber() {
        return nidNumber;
    }

    public void setNidNumber(int nidNumber) {
        this.nidNumber = nidNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "UpdateProfile{" +
                "memberName='" + memberName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", memberID=" + memberID +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", nidNumber=" + nidNumber +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
