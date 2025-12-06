package mid.gulshan_club.HR_Manager.Model;

import java.time.LocalDate;

public class LeavePolicyUpdate {
    private String leaveType , currentPolicy, proposedPolicy, eligibility;
    private  LocalDate  effectiveDate;

    public LeavePolicyUpdate() {
    }

    public LeavePolicyUpdate(String leaveType, String currentPolicy, String proposedPolicy, String eligibility, LocalDate effectiveDate) {
        this.leaveType = leaveType;
        this.currentPolicy = currentPolicy;
        this.proposedPolicy = proposedPolicy;
        this.eligibility = eligibility;
        this.effectiveDate = effectiveDate;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public String getCurrentPolicy() {
        return currentPolicy;
    }

    public String getProposedPolicy() {
        return proposedPolicy;
    }

    public String getEligibility() {
        return eligibility;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @Override
    public String toString() {
        return "LeavePolicyUpdate{" +
                "leaveType='" + leaveType + '\'' +
                ", currentPolicy='" + currentPolicy + '\'' +
                ", proposedPolicy='" + proposedPolicy + '\'' +
                ", eligibility='" + eligibility + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                '}';
    }
}
