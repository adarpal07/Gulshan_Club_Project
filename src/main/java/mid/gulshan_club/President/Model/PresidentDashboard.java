package mid.gulshan_club.President.Model;

import mid.gulshan_club.HR_Manager.Model.BudgetProposal;

public class PresidentDashboard {
    private BudgetProposal budgetProposal;

    public PresidentDashboard() {
    }

    public PresidentDashboard(BudgetProposal budgetProposal) {
        this.budgetProposal = budgetProposal;
    }

    public BudgetProposal getBudgetProposal() {
        return budgetProposal;
    }

    @Override
    public String toString() {
        return "PresidentDashboard{" +
                "budgetProposal=" + budgetProposal +
                '}';
    }
}
