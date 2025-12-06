package mid.gulshan_club.Member.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class SubscriptionBillPayment implements Serializable {
    protected String memberName, paymentMethod, paymentMonth;
    protected int memberId, amount;
    protected LocalDate paymentDate;

    public SubscriptionBillPayment(String memberName, String paymentMethod, String paymentMonth, int memberId, int amount, LocalDate paymentDate) {
        this.memberName = memberName;
        this.paymentMethod = paymentMethod;
        this.paymentMonth = paymentMonth;
        this.memberId = memberId;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
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

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
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
                "memberName='" + memberName + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", paymentMonth='" + paymentMonth + '\'' +
                ", memberId=" + memberId +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
