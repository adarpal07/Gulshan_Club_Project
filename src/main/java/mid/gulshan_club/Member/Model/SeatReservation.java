package mid.gulshan_club.Member.Model;

import java.time.LocalDate;

public class SeatReservation extends Member {
    protected String eventName, venue;
    protected LocalDate eventDate;
    protected int seatCount;

    public SeatReservation(long userId, String userName, String email, String gender, int phoneNo, String address, LocalDate dateOfBirth, int age, int nidNumber, String eventName, String venue, LocalDate eventDate, int seatCount) {
        super(userId, userName, email, gender, phoneNo, address, dateOfBirth, age, nidNumber);
        this.eventName = eventName;
        this.venue = venue;
        this.eventDate = eventDate;
        this.seatCount = seatCount;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public String toString() {
        return "SeatReservation{" +
                "eventName='" + eventName + '\'' +
                ", venue='" + venue + '\'' +
                ", eventDate=" + eventDate +
                ", seatCount=" + seatCount +
                ", address='" + address + '\'' +
                ", nidNumber=" + nidNumber +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", userId=" + userId +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
