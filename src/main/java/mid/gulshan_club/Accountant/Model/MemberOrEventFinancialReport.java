package mid.gulshan_club.Accountant.Model;

import mid.gulshan_club.Employee;

import java.time.LocalDate;

public class MemberOrEventFinancialReport extends Employee {
    protected String reportType;



    public String getReportType() {
        return reportType;
    }

    public MemberOrEventFinancialReport(long userId, String reportType) {
        super(userId);
        this.reportType = reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    @Override
    public String toString() {
        return "MemberOrEventFinancialReport{" +
                "reportType='" + reportType + '\'' +
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
