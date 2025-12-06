package mid.gulshan_club.President.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EventAnnouncement {
    private String eventTitle, description, venue, time;
    private LocalDate eventDate;

    public EventAnnouncement() {
    }

    public EventAnnouncement(String eventTitle, String description, String venue, String time, LocalDate eventDate) {
        this.eventTitle = eventTitle;
        this.description = description;
        this.venue = venue;
        this.time = time;
        this.eventDate = eventDate;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public String getDescription() {
        return description;
    }

    public String getVenue() {
        return venue;
    }

    public String getTime() {
        return time;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {
        return "EventAnnouncement{" +
                "eventTitle='" + eventTitle + '\'' +
                ", description='" + description + '\'' +
                ", venue='" + venue + '\'' +
                ", time='" + time + '\'' +
                ", eventDate=" + eventDate +
                '}';
    }
}
