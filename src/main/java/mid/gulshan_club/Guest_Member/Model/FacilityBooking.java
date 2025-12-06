package mid.gulshan_club.Guest_Member.Model;

import java.io.Serializable;

public class FacilityBooking implements Serializable {
    protected String name, availability;
    protected int seat, amount;

    public FacilityBooking(String name, String availability, int seat, int amount) {
        this.name = name;
        this.availability = availability;
        this.seat = seat;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "FacilityBooking{" +
                "name='" + name + '\'' +
                ", availability='" + availability + '\'' +
                ", seat=" + seat +
                ", amount=" + amount +
                '}';
    }
}
