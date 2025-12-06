package mid.gulshan_club.President.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class MembershipPolicy implements Serializable {

    private String policyTitle,description,category;
    private LocalDate effectiveDate;

    public MembershipPolicy() {
    }

    public MembershipPolicy(String policyTitle, String description, String category, LocalDate effectiveDate) {
        this.policyTitle = policyTitle;
        this.description = description;
        this.category = category;
        this.effectiveDate = effectiveDate;
    }

    public String getPolicyTitle() {
        return policyTitle;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return category;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MembershipPolicy{" +
                "policyTitle='" + policyTitle + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", effectiveDate=" + effectiveDate +
                '}';
    }
}
