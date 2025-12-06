package mid.gulshan_club.Supplier.Model;

public class Supplier {
    private String companyName;
    private String contactNumber;
    private String companyAddress;
    private String paymentMethod;
    private String instructions;

    // Constructor
    public Supplier(String companyName, String contactNumber, String companyAddress, String paymentMethod, String instructions) {
        this.companyName = companyName;
        this.contactNumber = contactNumber;
        this.companyAddress = companyAddress;
        this.paymentMethod = paymentMethod;
        this.instructions = instructions;
    }

    // Getters and Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "companyName='" + companyName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}