package mid.gulshan_club.Supplier.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class TrainingSupply implements Serializable {

    private String poNo;
    private String item;
    private String kitchenLocation;
    private String trainingDate;
    private LocalDate proposedDeliveryDate;
    private int quantity;

    public TrainingSupply(String poNo,
                          String item,
                          String kitchenLocation,
                          String trainingDate,
                          LocalDate proposedDeliveryDate,
                          int quantity) {
        this.poNo = poNo;
        this.item = item;
        this.kitchenLocation = kitchenLocation;
        this.trainingDate = trainingDate;
        this.proposedDeliveryDate = proposedDeliveryDate;
        this.quantity = quantity;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getKitchenLocation() {
        return kitchenLocation;
    }

    public void setKitchenLocation(String kitchenLocation) {
        this.kitchenLocation = kitchenLocation;
    }

    public String getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(String trainingDate) {
        this.trainingDate = trainingDate;
    }

    public LocalDate getProposedDeliveryDate() {
        return proposedDeliveryDate;
    }

    public void setProposedDeliveryDate(LocalDate proposedDeliveryDate) {
        this.proposedDeliveryDate = proposedDeliveryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "TrainingSupply{" +
                "poNo='" + poNo + '\'' +
                ", item='" + item + '\'' +
                ", kitchenLocation='" + kitchenLocation + '\'' +
                ", trainingDate='" + trainingDate + '\'' +
                ", proposedDeliveryDate=" + proposedDeliveryDate +
                ", quantity=" + quantity +
                '}';
    }
}
