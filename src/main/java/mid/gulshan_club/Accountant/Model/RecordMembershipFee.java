package mid.gulshan_club.Accountant.Model;

import mid.gulshan_club.Employee;

import java.time.LocalDate;

public class RecordMembershipFee extends Employee {
    protected String status, month;
    protected int amount;
    protected LocalDate recordDate;

    public RecordMembershipFee(long userId, String userName, String email, String gender, int phoneNo, LocalDate joiningDate, double salary, double duration, String department, String status, String month, int amount, LocalDate recordDate) {
        super(userId, userName, email, gender, phoneNo, joiningDate, salary, duration, department);
        this.status = status;
        this.month = month;
        this.amount = amount;
        this.recordDate = recordDate;
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
                "status='" + status + '\'' +
                ", month='" + month + '\'' +
                ", amount=" + amount +
                ", recordDate=" + recordDate +
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
