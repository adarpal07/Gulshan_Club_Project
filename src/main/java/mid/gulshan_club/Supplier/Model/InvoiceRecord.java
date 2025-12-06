package mid.gulshan_club.Supplier.Model;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class InvoiceRecord implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String invoiceNumber;
    private String poNumber;
    private LocalDate date;
    private double amount;
    private String status;

    public InvoiceRecord(String invoiceNumber,
                         String poNumber,
                         LocalDate date,
                         double amount,
                         String status) {
        this.invoiceNumber = invoiceNumber;
        this.poNumber = poNumber;
        this.date = date;
        this.amount = amount;
        this.status = status;
    }


    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "InvoiceRecord{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", poNumber='" + poNumber + '\'' +
                ", date=" + date +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}

