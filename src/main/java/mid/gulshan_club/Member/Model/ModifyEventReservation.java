package mid.gulshan_club.Member.Model;

import java.time.LocalDate;

public class ModifyEventReservation extends Member{
    protected String eventName, venue;
    protected LocalDate eventDate;
    protected int seatBooked;

    public ModifyEventReservation(long userId, String userName, String email, String gender, int phoneNo, String address, LocalDate dateOfBirth, int age, int nidNumber, String eventName, String venue, LocalDate eventDate, int seatBooked) {
        super(userId, userName, email, gender, phoneNo, address, dateOfBirth, age, nidNumber);
        this.eventName = eventName;
        this.venue = venue;
        this.eventDate = eventDate;
        this.seatBooked = seatBooked;
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

    public int getSeatBooked() {
        return seatBooked;
    }

    public void setSeatBooked(int seatBooked) {
        this.seatBooked = seatBooked;
    }

    @Override
    public String toString() {
        return "ModifyEventReservation{" +
                "eventName='" + eventName + '\'' +
                ", venue='" + venue + '\'' +
                ", eventDate=" + eventDate +
                ", seatBooked=" + seatBooked +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", nidNumber=" + nidNumber +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", userId=" + userId +
                ", phoneNo=" + phoneNo +
                ", gender='" + gender + '\'' +
                '}';
    }
}
