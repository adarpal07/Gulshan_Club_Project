package mid.gulshan_club.HR_Manager.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class MeetingDetails implements Serializable {
    private String meetingTitle, meetingCategory, meetingAgenda, participants, venue;
    private LocalDate meetingDate;

    public MeetingDetails() {
    }

    public MeetingDetails(String meetingTitle, String meetingCategory, String meetingAgenda, String participants, String venue, LocalDate meetingDate) {
        this.meetingTitle = meetingTitle;
        this.meetingCategory = meetingCategory;
        this.meetingAgenda = meetingAgenda;
        this.participants = participants;
        this.venue = venue;
        this.meetingDate = meetingDate;
    }

    public String getMeetingTitle() {
        return meetingTitle;
    }

    public String getMeetingCategory() {
        return meetingCategory;
    }

    public String getMeetingAgenda() {
        return meetingAgenda;
    }

    public String getParticipants() {
        return participants;
    }

    public String getVenue() {
        return venue;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setMeetingDate(LocalDate meetingDate) {
        this.meetingDate = meetingDate;
    }

    public void setParticipants(String participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "MeetingDetails{" +
                "meetingTitle='" + meetingTitle +
                "meetingCategory='" + meetingCategory+
                ", meetingAgenda='" + meetingAgenda +
                ", participants='" + participants +
                ", venue='" + venue +
                ", meetingDate=" + meetingDate +
                '}';
    }
}
