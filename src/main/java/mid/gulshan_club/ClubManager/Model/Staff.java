package mid.gulshan_club.ClubManager.Model;

import java.io.Serializable;

public class Staff implements Serializable {
    protected String name, address;
    protected int contactNO, Salary;

    public Staff(String name, String address, int contactNO, int salary) {
        this.name = name;
        this.address = address;
        this.contactNO = contactNO;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContactNO() {
        return contactNO;
    }

    public void setContactNO(int contactNO) {
        this.contactNO = contactNO;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactNO=" + contactNO +
                ", Salary=" + Salary +
                '}';
    }
}
