package mid.gulshan_club.Accountant.Model;

import mid.gulshan_club.Employee;

import java.io.Serializable;
import java.time.LocalDate;

public class RecordMembershipFee implements Serializable {
    protected String memberName, status, month;
    protected int memberId, amount;
    protected LocalDate recordDate;

    public RecordMembershipFee(String memberName, String status, String month, int memberId, int amount, LocalDate recordDate) {
        this.memberName = memberName;
        this.status = status;
        this.month = month;
        this.memberId = memberId;
        this.amount = amount;
        this.recordDate = recordDate;
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

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
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

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    @Override
    public String toString() {
        return "RecordMembershipFee{" +
                "memberName='" + memberName + '\'' +
                ", status='" + status + '\'' +
                ", month='" + month + '\'' +
                ", memberId=" + memberId +
                ", amount=" + amount +
                ", recordDate=" + recordDate +
                '}';
    }
}
