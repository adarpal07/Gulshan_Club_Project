package mid.gulshan_club.Supplier.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class ConfirmOrderRequest implements Serializable {
    protected int reqNum, amount;
    protected String status;
    protected LocalDate requestDate;

    public ConfirmOrderRequest(int reqNum, int amount, String status, LocalDate requestDate) {
        this.reqNum = reqNum;
        this.amount = amount;
        this.status = status;
        this.requestDate = requestDate;
    }

    public int getReqNum() {
        return reqNum;
    }

    public void setReqNum(int reqNum) {
        this.reqNum = reqNum;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    @Override
    public String toString() {
        return "ConfirmOrderRequest{" +
                "reqNum=" + reqNum +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", requestDate=" + requestDate +
                '}';
    }
}
