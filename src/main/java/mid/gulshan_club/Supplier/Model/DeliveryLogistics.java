package mid.gulshan_club.Supplier.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class DeliveryLogistics implements Serializable {

    private String trackingNumber;
    private String courierOption;
    private String driverName;
    private String driverContact;
    private LocalDate eta;

    public DeliveryLogistics(String trackingNumber,
                             String courierOption,
                             String driverName,
                             String driverContact,
                             LocalDate eta) {
        this.trackingNumber = trackingNumber;
        this.courierOption = courierOption;
        this.driverName = driverName;
        this.driverContact = driverContact;
        this.eta = eta;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getCourierOption() {
        return courierOption;
    }

    public void setCourierOption(String courierOption) {
        this.courierOption = courierOption;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverContact() {
        return driverContact;
    }

    public void setDriverContact(String driverContact) {
        this.driverContact = driverContact;
    }

    public LocalDate getEta() {
        return eta;
    }

    public void setEta(LocalDate eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "DeliveryLogistics{" +
                "trackingNumber='" + trackingNumber + '\'' +
                ", courierOption='" + courierOption + '\'' +
                ", driverName='" + driverName + '\'' +
                ", driverContact='" + driverContact + '\'' +
                ", eta=" + eta +
                '}';
    }
}

