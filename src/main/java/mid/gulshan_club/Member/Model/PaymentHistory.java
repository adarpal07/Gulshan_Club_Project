package mid.gulshan_club.Member.Model;

import java.time.LocalDate;

public class PaymentHistory extends Member {
    protected String billType;

    public PaymentHistory(long userId, String userName, String email, String gender, int phoneNo, String address, LocalDate dateOfBirth, int age, int nidNumber, String billType) {
        super(userId, userName, email, gender, phoneNo, address, dateOfBirth, age, nidNumber);
        this.billType = billType;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    @Override
    public String toString() {
        return "PaymentHistory{" +
                "billType='" + billType + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", nidNumber=" + nidNumber +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", userId=" + userId +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
