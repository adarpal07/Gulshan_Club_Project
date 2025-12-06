package mid.gulshan_club.Guest_Member.Model;

import java.io.Serial;
import java.io.Serializable;

/**
 * Model class representing a club policy document.
 */
class PolicyDocument implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final String dressCode;
    private final String description;
    private final String bookingAndCancellation;

    public PolicyDocument(String dressCode,
                          String description,
                          String bookingAndCancellation) {
        this.dressCode = dressCode;
        this.description = description;
        this.bookingAndCancellation = bookingAndCancellation;
    }

    public String getDressCode() {
        return dressCode;
    }

    public String getDescription() {
        return description;
    }

    public String getBookingAndCancellation() {
        return bookingAndCancellation;
    }

    @Override
    public String toString() {
        return "PolicyDocument{" +
                "dressCode='" + dressCode + '\'' +
                ", description='" + description + '\'' +
                ", bookingAndCancellation='" + bookingAndCancellation + '\'' +
                '}';
    }
}
