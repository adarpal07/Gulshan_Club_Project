package mid.gulshan_club;

import mid.gulshan_club.HR_Manager.Model.EmployeeScheduleManagement;

import java.time.LocalDate;

public class Employee extends User{
    protected LocalDate joiningDate;
    protected EmployeeScheduleManagement schedule;
    protected double salary,duration;
    protected String department;


    public Employee(long userId) {
        super(userId);
    }

    public Employee(long userId, LocalDate joiningDate, EmployeeScheduleManagement schedule, double salary, double duration, String department) {
        super(userId);
        this.joiningDate = joiningDate;
        this.schedule = schedule;
        this.salary = salary;
        this.duration = duration;
        this.department = department;
    }

    public Employee(long userId, String userName, String email, String gender, int phoneNo, LocalDate joiningDate, EmployeeScheduleManagement schedule, double salary, double duration, String department) {
        super(userId, userName, email, gender, phoneNo);
        this.joiningDate = joiningDate;
        this.schedule = schedule;
        this.salary = salary;
        this.duration = duration;
        this.department = department;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public EmployeeScheduleManagement getSchedule() {
        return schedule;
    }

    public double getSalary() {
        return salary;
    }

    public double getDuration() {
        return duration;
    }

    public String getDepartment() {
        return department;
    }

    public void setSchedule(EmployeeScheduleManagement schedule) {
        this.schedule = schedule;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "joiningDate=" + joiningDate +
                ", schedule=" + schedule +
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
