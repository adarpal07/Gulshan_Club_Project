package mid.gulshan_club.Guest_Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ParkingRegistrationController {

    @FXML
    private TextField modelTextfield;

    @FXML
    private TextField memberIdTextfield;

    @FXML
    private ComboBox<String> parkingDurationComboBox;

    @FXML
    private Button backButton;

    @FXML
    private TextField licensePlateNumberTextfield;

    @FXML
    private TextField brandTextfield;

    @FXML
    private TextField nameTextfield;

    @FXML
    public void initialize() {
        parkingDurationComboBox.getItems().addAll(
                "1 Hour",
                "2 Hours",
                "3 Hours",
                "Half Day",
                "Full Day"
        );
    }

    @FXML
    public void registarButton(ActionEvent actionEvent) {
        // TODO: Add parking registration logic
        // Example:
        // - Validate input fields
        // - Save parking registration data
    }

    @FXML
    public void backButton(ActionEvent actionEvent) {
        // TODO: Navigate back to previous screen/dashboard
    }
}
