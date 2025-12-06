package mid.gulshan_club.ClubManager.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class ClubFacilities implements Serializable {
    protected String facilityName, availability;
    protected int availableSeat, seatCount;

    public ClubFacilities(String facilityName, String availability, int availableSeat, int seatCount) {
        this.facilityName = facilityName;
        this.availability = availability;
        this.availableSeat = availableSeat;
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

    public int getAvailableSeat() {
        return availableSeat;
    }

    public void setAvailableSeat(int availableSeat) {
        this.availableSeat = availableSeat;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public String toString() {
        return "ClubFacilities{" +
                "facilityName='" + facilityName + '\'' +
                ", availability='" + availability + '\'' +
                ", availableSeat=" + availableSeat +
                ", seatCount=" + seatCount +
                '}';
    }
}
