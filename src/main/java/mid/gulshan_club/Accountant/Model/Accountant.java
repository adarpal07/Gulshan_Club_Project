package mid.gulshan_club.Accountant.Model;

import mid.gulshan_club.Employee;

import java.time.LocalDate;

public class Accountant extends Employee {
    protected String address;
    protected LocalDate dateOfBirth;
    protected int age, nidNumber;

    public Accountant(long userId, String userName, String email, String gender, int phoneNo, LocalDate joiningDate, double salary, double duration, String department, String address, LocalDate dateOfBirth, int age, int nidNumber) {
        super(userId, userName, email, gender, phoneNo, joiningDate, salary, duration, department);
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.nidNumber = nidNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNidNumber() {
        return nidNumber;
    }

    public void setNidNumber(int nidNumber) {
        this.nidNumber = nidNumber;
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", nidNumber=" + nidNumber +
                ", joiningDate=" + joiningDate +
                ", salary=" + salary +
                ", duration=" + duration +
                ", department='" + department + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", userId=" + userId +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
