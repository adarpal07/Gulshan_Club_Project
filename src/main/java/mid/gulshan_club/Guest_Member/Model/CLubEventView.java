package mid.gulshan_club.Guest_Member.Model;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class CLubEventView implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String eventName;
    private LocalDate eventDate;
    private String eventTime;
    private String location;

    public CLubEventView(String eventName,
                         LocalDate eventDate,
                         String eventTime,
                         String location) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.location = location;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "CLubEventView{" +
                "eventName='" + eventName + '\'' +
                ", eventDate=" + eventDate +
                ", eventTime='" + eventTime + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}


