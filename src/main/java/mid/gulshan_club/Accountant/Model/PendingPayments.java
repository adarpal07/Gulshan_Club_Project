package mid.gulshan_club.Accountant.Model;

import mid.gulshan_club.Employee;

import java.io.Serializable;
import java.time.LocalDate;

public class PendingPayments implements Serializable {
    protected String memberName, status ;
    protected int memberId, amount;

    public PendingPayments(String memberName, String status, int memberId, int amount) {
        this.memberName = memberName;
        this.status = status;
        this.memberId = memberId;
        this.amount = amount;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    @Override
    public String toString() {
        return "PendingPayments{" +
                "memberName='" + memberName + '\'' +
                ", status='" + status + '\'' +
                ", memberId=" + memberId +
                ", amount=" + amount +
                '}';
    }
}
