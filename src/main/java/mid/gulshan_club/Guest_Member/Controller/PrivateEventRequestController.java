package mid.gulshan_club.Guest_Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;

import java.io.IOException;

public class PrivateEventRequestController {

    @FXML
    private TextArea AddiNotesTextarea;

    @FXML
    private ComboBox<String> cateringServiceCombobox;

    @FXML
    private TextField memberIDTextfield;

    @FXML
    private TextField reqDateTextfield;

    @FXML
    private ComboBox<String> eventTypeCombobox;

    @FXML
    private ComboBox<String> conventionHallsComboBox;

    @FXML
    private ComboBox<String> estimatedGuestCombobox;

    @FXML
    private TextField nameTextfield;

    @FXML
    public void initialize() {

        // Initialize event types
        eventTypeCombobox.getItems().addAll(
                "Wedding",
                "Corporate Event",
                "Anniversary"
        );

        // Initialize catering services
        cateringServiceCombobox.getItems().addAll(
                "In-house Catering",
                "External Catering",
                "No Catering"
        );

        // Initialize convention halls
        conventionHallsComboBox.getItems().addAll(
                "Banquet Hall A",
                "Banquet Hall B",
                "Convention Hall"
        );

        // Initialize estimated guests
        estimatedGuestCombobox.getItems().addAll(
                "50–100",
                "100–200",
                "200–300",
                "300+"
        );
    }

    @FXML
    public void submitButton(ActionEvent actionEvent) {

        // Validation
        if (nameTextfield.getText().isBlank()
                || memberIDTextfield.getText().isBlank()
                || reqDateTextfield.getText().isBlank()
                || eventTypeCombobox.getValue() == null
                || conventionHallsComboBox.getValue() == null
                || estimatedGuestCombobox.getValue() == null
                || cateringServiceCombobox.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Validation Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all required fields before submitting.");
            alert.showAndWait();
            return;
        }

        // Success confirmation
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Request Submitted");
        alert.setHeaderText(null);
        alert.setContentText(
                "Private event request submitted successfully!\n\n" +
                        "Event Type: " + eventTypeCombobox.getValue() + "\n" +
                        "Date: " + reqDateTextfield.getText() + "\n" +
                        "Guests: " + estimatedGuestCombobox.getValue() + "\n" +
                        "Hall: " + conventionHallsComboBox.getValue()
        );
        alert.showAndWait();

        // Clear form after submission
        clearForm();
    }

    @FXML
    public void cancelButton(ActionEvent actionEvent) {
        clearForm();
    }

    private void clearForm() {
        nameTextfield.clear();
        memberIDTextfield.clear();
        reqDateTextfield.clear();
        AddiNotesTextarea.clear();
        eventTypeCombobox.setValue(null);
        cateringServiceCombobox.setValue(null);
        conventionHallsComboBox.setValue(null);
        estimatedGuestCombobox.setValue(null);
    }

    @FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

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

