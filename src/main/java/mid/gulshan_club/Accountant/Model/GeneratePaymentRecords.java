package mid.gulshan_club.Accountant.Model;

import mid.gulshan_club.Employee;

import java.time.LocalDate;

public class GeneratePaymentRecords extends Employee {

    public GeneratePaymentRecords(long userId, String userName, String email, String gender, int phoneNo, LocalDate joiningDate, double salary, double duration, String department) {
        super(userId, userName, email, gender, phoneNo, joiningDate, salary, duration, department);
    }

    @Override
    public String toString() {
        return "GeneratePaymentRecords{" +
                "joiningDate=" + joiningDate +
                ", salary=" + salary +
                ", duration=" + duration +
                ", department='" + department + '\'' +
                ", userName='" + userName + '\'' +
                ", phoneNo=" + phoneNo +
                ", userId=" + userId +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
