package mid.gulshan_club.Guest_Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;

import java.io.IOException;

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
        // Initialize parking duration options
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
        // Basic validation
        if (nameTextfield.getText().isBlank()
                || memberIdTextfield.getText().isBlank()
                || licensePlateNumberTextfield.getText().isBlank()
                || brandTextfield.getText().isBlank()
                || modelTextfield.getText().isBlank()
                || parkingDurationComboBox.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Validation Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all fields before registering parking.");
            alert.showAndWait();
            return;
        }

        // At this stage, data is valid. Here you could:
        // - Save to file / database
        // - Send request to backend, etc.
        // For now we just show a confirmation.

        Alert success = new Alert(Alert.AlertType.INFORMATION);
        success.setTitle("Parking Registered");
        success.setHeaderText(null);
        success.setContentText("Guest parking has been registered successfully.");
        success.showAndWait();

        // Clear inputs after successful registration
        nameTextfield.clear();
        memberIdTextfield.clear();
        licensePlateNumberTextfield.clear();
        brandTextfield.clear();
        modelTextfield.clear();
        parkingDurationComboBox.setValue(null);
    }

    @FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        // Navigate back to Guest Member Dashboard (adjust path if needed)
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("Guest_Member/guestMemberDashboard-view.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource())
                .getScene()
                .getWindow();
        stage.setTitle("Guest Member Dashboard");
        stage.setScene(scene);
        stage.show();
    }
}
