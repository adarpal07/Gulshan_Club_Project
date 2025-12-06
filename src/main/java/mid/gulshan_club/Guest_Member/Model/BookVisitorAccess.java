package mid.gulshan_club.Guest_Member.Model;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class BookVisitorAccess implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private String memberId;
    private String contactNumber;
    private String nidNumber;
    private String email;
    private LocalDate visitDate;
    private String purposeOfVisit;


    public BookVisitorAccess(String name,
                             String memberId,
                             String contactNumber,
                             String nidNumber,
                             String email,
                             LocalDate visitDate,
                             String purposeOfVisit) {
        this.name = name;
        this.memberId = memberId;
        this.contactNumber = contactNumber;
        this.nidNumber = nidNumber;
        this.email = email;
        this.visitDate = visitDate;
        this.purposeOfVisit = purposeOfVisit;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getNidNumber() {
        return nidNumber;
    }

    public void setNidNumber(String nidNumber) {
        this.nidNumber = nidNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public String getPurposeOfVisit() {
        return purposeOfVisit;
    }

    public void setPurposeOfVisit(String purposeOfVisit) {
        this.purposeOfVisit = purposeOfVisit;
    }

    @Override
    public String toString() {
        return "BookVisitorAccess{" +
                "name='" + name + '\'' +
                ", memberId='" + memberId + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", nidNumber='" + nidNumber + '\'' +
                ", email='" + email + '\'' +
                ", visitDate=" + visitDate +
                ", purposeOfVisit='" + purposeOfVisit + '\'' +
                '}';
    }
}
