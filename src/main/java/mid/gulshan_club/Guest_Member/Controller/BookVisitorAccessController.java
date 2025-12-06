package mid.gulshan_club.Guest_Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class BookVisitorAccessController {

    @FXML
    private TextField nidNumberTextfield;

    @FXML
    private TextField contactNumberTextfield;

    @FXML
    private TextArea purposeOfVisitTextArea;

    @FXML
    private TextField emailTextfield;

    @FXML
    private DatePicker visitDatePicker;

    @FXML
    private Button backButton;

    @FXML
    private TextField nameTextfield;

    @FXML
    private TextField memberIdTextfield;

    @FXML
    private void saveButton(ActionEvent event) {
        // Basic validation
        if (nidNumberTextfield.getText().isBlank()) {
            errorAlert("NID number cannot be blank!");
            return;
        }
        if (nameTextfield.getText().isBlank()) {
            errorAlert("Name cannot be blank!");
            return;
        }
        if (contactNumberTextfield.getText().isBlank()) {
            errorAlert("Contact number cannot be blank!");
            return;
        }
        if (emailTextfield.getText().isBlank()) {
            errorAlert("Email cannot be blank!");
            return;
        }
        if (visitDatePicker.getValue() == null) {
            errorAlert("Please select a visit date!");
            return;
        }
        if (purposeOfVisitTextArea.getText().isBlank()) {
            errorAlert("Purpose of visit cannot be blank!");
            return;
        }

        // TODO: Your save logic here (DB insert, API call, etc.)
        infoAlert("Visitor information saved successfully.");
    }

    @FXML
    private void backButton(ActionEvent event) {
        // TODO: Implement your back/navigation logic
        // Example: close window
        // Stage stage = (Stage) backButton.getScene().getWindow();
        // stage.close();
    }

    private void errorAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Validation Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void infoAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
