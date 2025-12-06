package mid.gulshan_club.ClubManager.Model;

import java.io.Serializable;

public class AddMember implements Serializable {
    protected String name, location;
    protected int idno, phoneNo;

    public AddMember(String name, String location, int idno, int phoneNo) {
        this.name = name;
        this.location = location;
        this.idno = idno;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getIdno() {
        return idno;
    }

    public void setIdno(int idno) {
        this.idno = idno;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "AddMember{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", idno=" + idno +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
