package mid.gulshan_club.Accountant.Model;

import mid.gulshan_club.Employee;

import java.io.Serializable;
import java.time.LocalDate;

public class MonthlyFinancialReport implements Serializable {
    protected String month, recorderName;
    protected int year, profit, cost;
    protected LocalDate recordDate;

    public MonthlyFinancialReport(String month, String recorderName, int year, int profit, int cost, LocalDate recordDate) {
        this.month = month;
        this.recorderName = recorderName;
        this.year = year;
        this.profit = profit;
        this.cost = cost;
        this.recordDate = recordDate;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getRecorderName() {
        return recorderName;
    }

    public void setRecorderName(String recorderName) {
        this.recorderName = recorderName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    @Override
    public String toString() {
        return "MonthlyFinancialReport{" +
                "month='" + month + '\'' +
                ", recorderName='" + recorderName + '\'' +
                ", year=" + year +
                ", profit=" + profit +
                ", cost=" + cost +
                ", recordDate=" + recordDate +
                '}';
    }
}
