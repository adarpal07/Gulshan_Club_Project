package mid.gulshan_club.Accountant.Model;

import java.io.Serializable;

public class ViewEventFinancialReport implements Serializable {
    protected String reportType;

    public ViewEventFinancialReport(String reportType) {
        this.reportType = reportType;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    @Override
    public String toString() {
        return "MemberOrEventFinancialReport{" +
                "reportType='" + reportType + '\'' +
                '}';
    }
}
