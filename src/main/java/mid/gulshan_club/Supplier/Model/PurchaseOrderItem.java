package mid.gulshan_club.Supplier.Model;

import java.io.Serializable;

public class PurchaseOrderItem implements Serializable {

    private String item;
    private int quantity;
    private double unitPrice;
    private double total;

    public PurchaseOrderItem(String item, int quantity, double unitPrice) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.total = quantity * unitPrice;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.total = this.quantity * this.unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
        this.total = this.quantity * this.unitPrice;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "PurchaseOrderItem{" +
                "item='" + item + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", total=" + total +
                '}';
    }
}
