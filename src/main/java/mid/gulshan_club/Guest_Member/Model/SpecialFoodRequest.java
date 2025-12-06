package mid.gulshan_club.Guest_Member.Model;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Model class for special food requests.
 */
public class SpecialFoodRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final String bookingId;
    private final String foodType;
    private final String numberOfServings;
    private final LocalDate visitDate;
    private final String requestingTime;
    private final String specificDishRequested;
    private final String dietaryRestrictions;
    private final String additionalNotes;

    public SpecialFoodRequest(String bookingId,
                              String foodType,
                              String numberOfServings,
                              LocalDate visitDate,
                              String requestingTime,
                              String specificDishRequested,
                              String dietaryRestrictions,
                              String additionalNotes) {
        this.bookingId = bookingId;
        this.foodType = foodType;
        this.numberOfServings = numberOfServings;
        this.visitDate = visitDate;
        this.requestingTime = requestingTime;
        this.specificDishRequested = specificDishRequested;
        this.dietaryRestrictions = dietaryRestrictions;
        this.additionalNotes = additionalNotes;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getFoodType() {
        return foodType;
    }

    public String getNumberOfServings() {
        return numberOfServings;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public String getRequestingTime() {
        return requestingTime;
    }

    public String getSpecificDishRequested() {
        return specificDishRequested;
    }

    public String getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    @Override
    public String toString() {
        return "SpecialFoodRequest{" +
                "bookingId='" + bookingId + '\'' +
                ", foodType='" + foodType + '\'' +
                ", numberOfServings='" + numberOfServings + '\'' +
                ", visitDate=" + visitDate +
                ", requestingTime='" + requestingTime + '\'' +
                ", specificDishRequested='" + specificDishRequested + '\'' +
                ", dietaryRestrictions='" + dietaryRestrictions + '\'' +
                ", additionalNotes='" + additionalNotes + '\'' +
                '}';
    }
}
