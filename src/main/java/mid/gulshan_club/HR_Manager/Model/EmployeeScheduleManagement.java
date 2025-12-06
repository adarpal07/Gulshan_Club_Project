package mid.gulshan_club.HR_Manager.Model;

import java.io.Serializable;

public class EmployeeScheduleManagement implements Serializable {
    private  long  employeeId;
    private String shiftStartTime;
    private String shiftEndTime;
    private String shiftType;

    public EmployeeScheduleManagement() {
    }

    public EmployeeScheduleManagement(long employeeId, String shiftStartTime, String shiftEndTime, String shiftType) {
        this.employeeId = employeeId;
        this.shiftStartTime = shiftStartTime;
        this.shiftEndTime = shiftEndTime;
        this.shiftType = shiftType;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getShiftStartTime() {
        return shiftStartTime;
    }

    public String getShiftEndTime() {
        return shiftEndTime;
    }

    public String getShiftType() {
        return shiftType;
    }

    public void setShiftStartTime(String shiftStartTime) {
        this.shiftStartTime = shiftStartTime;
    }

    public void setShiftEndTime(String shiftEndTime) {
        this.shiftEndTime = shiftEndTime;
    }

    @Override
    public String toString() {
        return "EmployeeScheduleManagement{" +
                "employeeId=" + employeeId +
                ", shiftStartTime='" + shiftStartTime + '\'' +
                ", shiftEndTime='" + shiftEndTime + '\'' +
                ", shiftType='" + shiftType + '\'' +
                '}';
    }
}
