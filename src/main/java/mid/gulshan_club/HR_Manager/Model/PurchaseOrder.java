package mid.gulshan_club.HR_Manager.Model;

import java.time.LocalDate;

public class PurchaseOrder {
    private String itemName, itemDescription, itemQuantity, deliveyLocation;
    private LocalDate deliveryDate;

    public PurchaseOrder() {
    }

    public PurchaseOrder(String itemName, String itemDescription, String itemQuantity, String deliveyLocation, LocalDate deliveryDate) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemQuantity = itemQuantity;
        this.deliveyLocation = deliveyLocation;
        this.deliveryDate = deliveryDate;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemQuantity() {
        return itemQuantity;
    }

    public String getDeliveyLocation() {
        return deliveyLocation;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemQuantity(String itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setDeliveyLocation(String deliveyLocation) {
        this.deliveyLocation = deliveyLocation;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemQuantity='" + itemQuantity + '\'' +
                ", deliveyLocation='" + deliveyLocation + '\'' +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}
