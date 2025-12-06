package mid.gulshan_club.Guest_Member.Model;

import java.io.Serial;
import java.io.Serializable;

/**
 * Model class for guest parking registration.
 */
public class ParkingRegistration implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final String name;
    private final String memberId;
    private final String licensePlateNumber;
    private final String brand;
    private final String model;
    private final String parkingDuration;

    public ParkingRegistration(String name,
                               String memberId,
                               String licensePlateNumber,
                               String brand,
                               String model,
                               String parkingDuration) {
        this.name = name;
        this.memberId = memberId;
        this.licensePlateNumber = licensePlateNumber;
        this.brand = brand;
        this.model = model;
        this.parkingDuration = parkingDuration;
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getParkingDuration() {
        return parkingDuration;
    }

    @Override
    public String toString() {
        return "ParkingRegistration{" +
                "name='" + name + '\'' +
                ", memberId='" + memberId + '\'' +
                ", licensePlateNumber='" + licensePlateNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", parkingDuration='" + parkingDuration + '\'' +
                '}';
    }
}
