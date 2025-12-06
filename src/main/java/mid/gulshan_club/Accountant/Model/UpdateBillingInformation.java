package mid.gulshan_club.Accountant.Model;

import mid.gulshan_club.Employee;

import java.io.Serializable;
import java.time.LocalDate;

public class UpdateBillingInformation implements Serializable {
    protected String status, billMonth, memberName;
    protected int memberId, amount;
    protected LocalDate updatedDate;

    public UpdateBillingInformation(String status, String billMonth, String memberName, int memberId, int amount, LocalDate updatedDate) {
        this.status = status;
        this.billMonth = billMonth;
        this.memberName = memberName;
        this.memberId = memberId;
        this.amount = amount;
        this.updatedDate = updatedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBillMonth() {
        return billMonth;
    }

    public void setBillMonth(String billMonth) {
        this.billMonth = billMonth;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
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

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "UpdateBillingInformation{" +
                "status='" + status + '\'' +
                ", billMonth='" + billMonth + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberId=" + memberId +
                ", amount=" + amount +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
