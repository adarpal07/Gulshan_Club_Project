package mid.gulshan_club.Supplier.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;
import mid.gulshan_club.Supplier.Model.InvoiceRecord;

import java.io.IOException;
import java.time.LocalDate;

public class InvoiceManagementController {

    @FXML
    private Button submitButton;

    @FXML
    private TextField amountTextfield;

    @FXML
    private TableColumn<InvoiceRecord, String> InvoiceNumberColumn;

    @FXML
    private TableColumn<InvoiceRecord, Double> amountColumn;

    @FXML
    private TableColumn<InvoiceRecord, String> poNumColumn;

    @FXML
    private TableView<InvoiceRecord> invoiceTableview;

    @FXML
    private DatePicker dateDatepicker;

    @FXML
    private ComboBox<String> statusCombobox;

    @FXML
    private TableColumn<InvoiceRecord, String> statusColumn;

    @FXML
    private Button backButton;

    @FXML
    private TableColumn<InvoiceRecord, LocalDate> dateColumn;

    @FXML
    private TextField poNumberTextfield;

    @FXML
    private TextField invoiceNumberTextfield;

    private final ObservableList<InvoiceRecord> invoices =
            FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        InvoiceNumberColumn.setCellValueFactory(
                new PropertyValueFactory<>("invoiceNumber"));
        poNumColumn.setCellValueFactory(
                new PropertyValueFactory<>("poNumber"));
        dateColumn.setCellValueFactory(
                new PropertyValueFactory<>("date"));
        amountColumn.setCellValueFactory(
                new PropertyValueFactory<>("amount"));
        statusColumn.setCellValueFactory(
                new PropertyValueFactory<>("status"));

        invoiceTableview.setItems(invoices);

        statusCombobox.getItems().addAll(
                "Unpaid",
                "Paid",
                "Partially Paid",
                "Overdue"
        );
    }

    @FXML
    public void submitButton(ActionEvent actionEvent) {

        if (invoiceNumberTextfield.getText().isBlank()
                || poNumberTextfield.getText().isBlank()
                || dateDatepicker.getValue() == null
                || amountTextfield.getText().isBlank()
                || statusCombobox.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Validation Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all fields.");
            alert.showAndWait();
            return;
        }

        double amount;
        try {
            amount = Double.parseDouble(amountTextfield.getText());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Amount");
            alert.setHeaderText(null);
            alert.setContentText("Amount must be a number.");
            alert.showAndWait();
            return;
        }

        InvoiceRecord invoice = new InvoiceRecord(
                invoiceNumberTextfield.getText(),
                poNumberTextfield.getText(),
                dateDatepicker.getValue(),
                amount,
                statusCombobox.getValue()
        );

        invoices.add(invoice);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Saved");
        alert.setHeaderText(null);
        alert.setContentText("Invoice saved successfully.");
        alert.showAndWait();

        clearForm();
    }

    private void clearForm() {
        invoiceNumberTextfield.clear();
        poNumberTextfield.clear();
        amountTextfield.clear();
        dateDatepicker.setValue(null);
        statusCombobox.setValue(null);
    }

    @FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =
                new FXMLLoader(HelloApplication.class.getResource("Supplier/supplierDashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource())
                .getScene()
                .getWindow();
        stage.setTitle("Supplier Dashboard");
        stage.setScene(scene);
        stage.show();
    }
}
