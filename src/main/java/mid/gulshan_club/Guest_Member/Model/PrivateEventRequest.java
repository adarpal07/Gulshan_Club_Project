package mid.gulshan_club.Guest_Member.Model;

import java.io.Serial;
import java.io.Serializable;

/**
 * Model class for private event booking requests.
 */
public class PrivateEventRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final String name;
    private final String memberId;
    private final String requestedDate;
    private final String eventType;
    private final String estimatedGuests;
    private final String conventionHall;
    private final String cateringService;
    private final String additionalNotes;

    public PrivateEventRequest(String name,
                               String memberId,
                               String requestedDate,
                               String eventType,
                               String estimatedGuests,
                               String conventionHall,
                               String cateringService,
                               String additionalNotes) {
        this.name = name;
        this.memberId = memberId;
        this.requestedDate = requestedDate;
        this.eventType = eventType;
        this.estimatedGuests = estimatedGuests;
        this.conventionHall = conventionHall;
        this.cateringService = cateringService;
        this.additionalNotes = additionalNotes;
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getRequestedDate() {
        return requestedDate;
    }

    public String getEventType() {
        return eventType;
    }

    public String getEstimatedGuests() {
        return estimatedGuests;
    }

    public String getConventionHall() {
        return conventionHall;
    }

    public String getCateringService() {
        return cateringService;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    @Override
    public String toString() {
        return "PrivateEventRequest{" +
                "name='" + name + '\'' +
                ", memberId='" + memberId + '\'' +
                ", requestedDate='" + requestedDate + '\'' +
                ", eventType='" + eventType + '\'' +
                ", estimatedGuests='" + estimatedGuests + '\'' +
                ", conventionHall='" + conventionHall + '\'' +
                ", cateringService='" + cateringService + '\'' +
                ", additionalNotes='" + additionalNotes + '\'' +
                '}';
    }
}
