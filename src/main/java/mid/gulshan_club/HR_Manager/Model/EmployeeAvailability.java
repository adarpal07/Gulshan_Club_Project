package mid.gulshan_club.HR_Manager.Model;

public class EmployeeAvailability {

    private long empId;
    private String empName , startTime, endTime;
    private int empPhoneNo;

    public EmployeeAvailability() {
    }

    public EmployeeAvailability(long empId, String empName, String startTime, String endTime, int empPhoneNo) {
        this.empId = empId;
        this.empName = empName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.empPhoneNo = empPhoneNo;
    }

    public long getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public int getEmpPhoneNo() {
        return empPhoneNo;
    }

    @Override
    public String toString() {
        return "EmployeeAvailability{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", empPhoneNo=" + empPhoneNo +
                '}';
    }
}
