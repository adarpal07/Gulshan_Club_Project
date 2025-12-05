package mid.gulshan_club.ClubManager.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class CreateEvent implements Serializable {
    protected String eventName, venue;
    protected int seat, amount;
    protected LocalDate eventDate;

    public CreateEvent(String eventName, String venue, int seat, int amount, LocalDate eventDate) {
        this.eventName = eventName;
        this.venue = venue;
        this.seat = seat;
        this.amount = amount;
        this.eventDate = eventDate;
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

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {
        return "CreateEvent{" +
                "eventName='" + eventName + '\'' +
                ", venue='" + venue + '\'' +
                ", seat=" + seat +
                ", amount=" + amount +
                ", eventDate=" + eventDate +
                '}';
    }
}
