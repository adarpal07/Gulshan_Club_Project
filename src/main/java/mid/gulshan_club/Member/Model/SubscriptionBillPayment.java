package mid.gulshan_club.Member.Model;

import java.time.LocalDate;

public class SubscriptionBillPayment extends Member {
    protected String paymentMethod, paymentMonth;
    protected int amount;
    protected LocalDate paymentDate;

    public SubscriptionBillPayment(long userId, String userName, String email, String gender, int phoneNo, String address, LocalDate dateOfBirth, int age, int nidNumber, String paymentMethod, String paymentMonth, int amount, LocalDate paymentDate) {
        super(userId, userName, email, gender, phoneNo, address, dateOfBirth, age, nidNumber);
        this.paymentMethod = paymentMethod;
        this.paymentMonth = paymentMonth;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMonth() {
        return paymentMonth;
    }

    public void setPaymentMonth(String paymentMonth) {
        this.paymentMonth = paymentMonth;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "SubscriptionBillPayment{" +
                "paymentMethod='" + paymentMethod + '\'' +
                ", paymentMonth='" + paymentMonth + '\'' +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
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
