package mid.gulshan_club.Accountant.Model;

import mid.gulshan_club.Employee;

import java.time.LocalDate;

public class UpdateBillingInformation extends Employee {
    protected String status, billMonth;
    protected int amount;
    protected LocalDate updatedDate;

    public UpdateBillingInformation(long userId, String status, String billMonth, int amount, LocalDate updatedDate) {
        super(userId);
        this.status = status;
        this.billMonth = billMonth;
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
                ", amount=" + amount +
                ", updatedDate=" + updatedDate +
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
