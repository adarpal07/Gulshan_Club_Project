package mid.gulshan_club.Accountant.Model;

import mid.gulshan_club.Employee;

import java.time.LocalDate;

public class RecordEventPayment extends Employee {
    protected String eventName, venueName, month;
    protected int amount, eventTime;
    protected LocalDate eventDate, recordDate;

    public RecordEventPayment(long userId, String eventName, String venueName, String month, int amount, int eventTime, LocalDate eventDate, LocalDate recordDate) {
        super(userId);
        this.eventName = eventName;
        this.venueName = venueName;
        this.month = month;
        this.amount = amount;
        this.eventTime = eventTime;
        this.eventDate = eventDate;
        this.recordDate = recordDate;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getEventTime() {
        return eventTime;
    }

    public void setEventTime(int eventTime) {
        this.eventTime = eventTime;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    @Override
    public String toString() {
        return "RecordEventPayment{" +
                "eventName='" + eventName + '\'' +
                ", venueName='" + venueName + '\'' +
                ", month='" + month + '\'' +
                ", amount=" + amount +
                ", eventTime=" + eventTime +
                ", eventDate=" + eventDate +
                ", recordDate=" + recordDate +
                ", joiningDate=" + joiningDate +
                ", salary=" + salary +
                ", duration=" + duration +
                ", department='" + department + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", userId=" + userId +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
