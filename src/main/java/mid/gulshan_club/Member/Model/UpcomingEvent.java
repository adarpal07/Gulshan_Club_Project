package mid.gulshan_club.Member.Model;

import java.time.LocalDate;

public class UpcomingEvent extends Member {

    public UpcomingEvent(long userId, String userName, String email, String gender, int phoneNo, String address, LocalDate dateOfBirth, int age, int nidNumber) {
        super(userId, userName, email, gender, phoneNo, address, dateOfBirth, age, nidNumber);
    }

    @Override
    public String toString() {
        return "UpcomingEvent{" +
                "address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", nidNumber=" + nidNumber +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo=" + phoneNo +
                ", userId=" + userId +
                ", gender='" + gender + '\'' +
                '}';
    }
}
