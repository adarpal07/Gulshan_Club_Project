package mid.gulshan_club.Accountant.Model;

import mid.gulshan_club.Employee;

import java.time.LocalDate;

public class PendingPayments extends Employee {
    public PendingPayments(long userId) {
        super(userId);
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
