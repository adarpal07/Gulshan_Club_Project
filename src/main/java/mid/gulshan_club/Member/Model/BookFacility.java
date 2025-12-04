package mid.gulshan_club.Member.Model;

import java.time.LocalDate;

public class BookFacility extends Member {
    protected String facilityName, availability;
    protected int timeSlot, seatCount;

    public BookFacility(long userId, String userName, String email, String gender, int phoneNo, String address, LocalDate dateOfBirth, int age, int nidNumber, String facilityName, String availability, int timeSlot, int seatCount) {
        super(userId, userName, email, gender, phoneNo, address, dateOfBirth, age, nidNumber);
        this.facilityName = facilityName;
        this.availability = availability;
        this.timeSlot = timeSlot;
        this.seatCount = seatCount;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public int getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(int timeSlot) {
        this.timeSlot = timeSlot;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public String toString() {
        return "BookFacility{" +
                "facilityName='" + facilityName + '\'' +
                ", availability='" + availability + '\'' +
                ", timeSlot=" + timeSlot +
                ", seatCount=" + seatCount +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", nidNumber=" + nidNumber +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", userId=" + userId +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
