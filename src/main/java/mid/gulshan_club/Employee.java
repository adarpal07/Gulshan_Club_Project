package mid.gulshan_club;

import java.time.LocalDate;

public class Employee extends User{
    protected LocalDate joiningDate;

    protected double salary,duration;
    protected String department;


    public Employee(long userId) {
        super(userId);
    }

    public Employee(long userId, String userName, String email, String gender, int phoneNo, LocalDate joiningDate,  double salary, double duration, String department) {
        super(userId, userName, email, gender, phoneNo);
        this.joiningDate = joiningDate;

        this.salary = salary;
        this.duration = duration;
        this.department = department;

    }


    public LocalDate getJoiningDate() {
        return joiningDate;
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
