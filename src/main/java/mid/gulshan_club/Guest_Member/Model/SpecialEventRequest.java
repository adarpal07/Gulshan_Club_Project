package mid.gulshan_club.Guest_Member.Model;

import java.io.Serial;
import java.io.Serializable;

/**
 * Model class for a special event attendance request.
 */
public class SpecialEventRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final String memberId;
    private final String eventDate;
    private final String eventTime;
    private final String eventType;
    private final String numberOfGuests;
    private final String location;
    private final String requestNotes;

    public SpecialEventRequest(String memberId,
                               String eventDate,
                               String eventTime,
                               String eventType,
                               String numberOfGuests,
                               String location,
                               String requestNotes) {
        this.memberId = memberId;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventType = eventType;
        this.numberOfGuests = numberOfGuests;
        this.location = location;
        this.requestNotes = requestNotes;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getEventDate() {
        return eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public String getEventType() {
        return eventType;
    }

    public String getNumberOfGuests() {
        return numberOfGuests;
    }

    public String getLocation() {
        return location;
    }

    public String getRequestNotes() {
        return requestNotes;
    }

    @Override
    public String toString() {
        return "SpecialEventRequest{" +
                "memberId='" + memberId + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", eventTime='" + eventTime + '\'' +
                ", eventType='" + eventType + '\'' +
                ", numberOfGuests='" + numberOfGuests + '\'' +
                ", location='" + location + '\'' +
                ", requestNotes='" + requestNotes + '\'' +
                '}';
    }
}
