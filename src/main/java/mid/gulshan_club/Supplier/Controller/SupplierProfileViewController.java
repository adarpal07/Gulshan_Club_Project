package mid.gulshan_club.Supplier.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mid.gulshan_club.Supplier.Model.Supplier;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SupplierProfileViewController implements Initializable {

    @FXML
    private Button backButton;

    @FXML
    private Button cancelButton;

    @FXML
    private TextArea companyAddressTextarea;

    @FXML
    private TextField companyNameTextField;

    @FXML
    private TextField contactNumberTextfield;

    @FXML
    private TextArea instructionTextarea;

    @FXML
    private ComboBox<String> paymentMethodComboBox;

    @FXML
    private Button saveButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialize the ComboBox with Payment Methods
        paymentMethodComboBox.getItems().addAll("Cash", "Bank Transfer", "Check", "Mobile Banking");
    }

    @FXML
    void backButton(ActionEvent event) {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("/mid/gulshan_club/Dashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            showAlert("Error", "Could not load Dashboard.");
        }
    }

    @FXML
    void cancelButton(ActionEvent event) {
        // clear all fields
        companyNameTextField.clear();
        contactNumberTextfield.clear();
        companyAddressTextarea.clear();
        instructionTextarea.clear();
        paymentMethodComboBox.getSelectionModel().clearSelection();
    }

    @FXML
    void saveButton(ActionEvent event) {
        // 1. Extract data from fields
        String companyName = companyNameTextField.getText();
        String contactNumber = contactNumberTextfield.getText();
        String address = companyAddressTextarea.getText();
        String instructions = instructionTextarea.getText();
        String paymentMethod = paymentMethodComboBox.getValue();

        // 2. Simple Validation
        if (companyName.isEmpty() || contactNumber.isEmpty() || paymentMethod == null) {
            showAlert("Validation Error", "Please fill in Company Name, Contact Number, and Payment Method.");
            return;
        }

        // 3. Create Model Object
        Supplier newSupplier = new Supplier(companyName, contactNumber, address, paymentMethod, instructions);

        // 4. Logic to save (e.g., write to file or database)
        // For now, we print to console
        System.out.println("Saving Supplier: " + newSupplier.toString());

        showAlert("Success", "Supplier profile updated successfully!");
    }

    // Helper method to show alerts
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}