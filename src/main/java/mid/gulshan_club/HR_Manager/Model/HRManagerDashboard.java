package mid.gulshan_club.HR_Manager.Model;

public class HRManagerDashboard {
    private EmployeeScheduleManagement employeeSchedule;
    //private BudgetProposal budgetProposal;
    //private EmployeeAvailability employeeHiringManagement;
    private UserRegistration registrationInformation;
    //private EmployeeRecognitionAward awardeeList;
    //private JobInformation jobRecruitment;
    //private PurchaseOrder purchaseOrder;


    public HRManagerDashboard() {
    }

    public HRManagerDashboard(EmployeeScheduleManagement employeeSchedule, UserRegistration registrationInformation) {
        this.employeeSchedule = employeeSchedule;
        this.registrationInformation = registrationInformation;
    }

    public EmployeeScheduleManagement getEmployeeSchedule() {
        return employeeSchedule;
    }

    public UserRegistration getRegistrationInformation() {
        return registrationInformation;
    }

    public void setRegistrationInformation(UserRegistration registrationInformation) {
        this.registrationInformation = registrationInformation;
    }

    public void setEmployeeSchedule(EmployeeScheduleManagement employeeSchedule) {
        this.employeeSchedule = employeeSchedule;
    }

    @Override
    public String toString() {
        return "HRManagerDashboard{" +
                "employeeSchedule=" + employeeSchedule +
                ", registrationInformation=" + registrationInformation +
                '}';
    }
}
