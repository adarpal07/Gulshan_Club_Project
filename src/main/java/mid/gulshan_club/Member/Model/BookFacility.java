package mid.gulshan_club.Member.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class BookFacility implements Serializable {
    protected String facilityName, availability;
    protected int timeSlot, seatCount;

    public BookFacility(String facilityName, String availability, int timeSlot, int seatCount) {
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
                '}';
    }
}
