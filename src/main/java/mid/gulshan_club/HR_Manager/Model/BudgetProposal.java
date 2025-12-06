package mid.gulshan_club.HR_Manager.Model;

import java.io.Serializable;

public class BudgetProposal implements Serializable {
    private String budgetTitle, justification, category;
    private double totalAmount, budgetPeriodInDays;

    public BudgetProposal() {
    }

    public BudgetProposal(String budgetTitle, String justification, String category, double totalAmount, double budgetPeriodInDays) {
        this.budgetTitle = budgetTitle;
        this.justification = justification;
        this.category = category;
        this.totalAmount = totalAmount;
        this.budgetPeriodInDays = budgetPeriodInDays;
    }

    public String getBudgetTitle() {
        return budgetTitle;
    }

    public String getJustification() {
        return justification;
    }

    public String getCategory() {
        return category;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public double getBudgetPeriodInDays() {
        return budgetPeriodInDays;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }

    @Override
    public String toString() {
        return "Budget{" +
                "budgetTitle='" + budgetTitle + '\'' +
                ", justification='" + justification + '\'' +
                ", category='" + category + '\'' +
                ", totalAmount=" + totalAmount +
                ", budgetPeriodInDays=" + budgetPeriodInDays +
                '}';
    }

}
