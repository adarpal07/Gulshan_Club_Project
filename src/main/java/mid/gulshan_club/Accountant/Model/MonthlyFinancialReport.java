package mid.gulshan_club.Accountant.Model;

import mid.gulshan_club.Employee;

import java.time.LocalDate;

public class MonthlyFinancialReport extends Employee {
    protected String month;

    public MonthlyFinancialReport(long userId, String userName, String email, String gender, int phoneNo, LocalDate joiningDate, double salary, double duration, String department, String month) {
        super(userId, userName, email, gender, phoneNo, joiningDate, salary, duration, department);
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "MonthlyFinancialReport{" +
                "month='" + month + '\'' +
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
