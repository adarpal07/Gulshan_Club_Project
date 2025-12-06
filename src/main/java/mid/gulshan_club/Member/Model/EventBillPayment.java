package mid.gulshan_club.Member.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class EventBillPayment implements Serializable {
    protected String eventName, paymentMethod;
    protected int seatCount, amount ;
    protected LocalDate eventDate;

    public EventBillPayment(String eventName, String paymentMethod, int seatCount, int amount, LocalDate eventDate) {
        this.eventName = eventName;
        this.paymentMethod = paymentMethod;
        this.seatCount = seatCount;
        this.amount = amount;
        this.eventDate = eventDate;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
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
        return "EventBillPayment{" +
                "eventName='" + eventName + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", seatCount=" + seatCount +
                ", amount=" + amount +
                ", eventDate=" + eventDate +
                '}';
    }
}
