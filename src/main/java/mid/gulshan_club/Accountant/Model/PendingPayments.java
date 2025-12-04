package mid.gulshan_club.Accountant.Model;

import mid.gulshan_club.Employee;

import java.time.LocalDate;

public class PendingPayments extends Employee {

    public PendingPayments(long userId, String userName, String email, String gender, int phoneNo, LocalDate joiningDate, double salary, double duration, String department) {
        super(userId, userName, email, gender, phoneNo, joiningDate, salary, duration, department);
    }

    @Override
    public String toString() {
        return "PendingPayments{" +
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
