package mid.gulshan_club.Accountant.Model;

import mid.gulshan_club.Employee;

import java.io.Serializable;
import java.time.LocalDate;

public class ApprovePurchaseOrder implements Serializable {
    protected int reqNum, amount;
    protected String status;
    protected LocalDate approvalDate;

    public ApprovePurchaseOrder(int reqNum, int amount, String status, LocalDate approvalDate) {
        this.reqNum = reqNum;
        this.amount = amount;
        this.status = status;
        this.approvalDate = approvalDate;
    }

    public int getReqNum() {
        return reqNum;
    }

    public void setReqNum(int reqNum) {
        this.reqNum = reqNum;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(LocalDate approvalDate) {
        this.approvalDate = approvalDate;
    }

    @Override
    public String toString() {
        return "ApprovePurchaseOrder{" +
                "reqNum=" + reqNum +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", approvalDate=" + approvalDate +
                '}';
    }
}
