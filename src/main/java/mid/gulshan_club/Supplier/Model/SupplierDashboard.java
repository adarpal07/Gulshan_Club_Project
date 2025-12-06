package mid.gulshan_club.Supplier.Model;

import mid.gulshan_club.Employee;

import java.time.LocalDate;

public class SupplierDashboard extends Employee {
    protected String address;
    protected LocalDate dateOfBirth;
    protected int age, nidNumber;

    public SupplierDashboard(long userId, String address, LocalDate dateOfBirth, int age, int nidNumber) {
        super(userId);
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
        return "SupplierDashboard{" +
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

