package mid.gulshan_club.Guest_Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;

import java.io.IOException;

public class SpecialEventRequestController {

    @FXML
    private Button submitButton;

    @FXML
    private TextField memberIdTextfield;

    @FXML
    private TextField eventDateTextfield;

    @FXML
    private TextArea reqNotesTextarea;

    @FXML
    private Button backButton;

    @FXML
    private ComboBox<String> numberOfGuestComboBox;

    @FXML
    private ComboBox<String> eventTypeCombobox;

    @FXML
    private TextField eventTimeTextfield;

    @FXML
    private TextField locationTextfield;

    @FXML
    public void initialize() {
        // Populate event types
        eventTypeCombobox.getItems().addAll(
                "Cultural Program",
                "Sports Event",
                "Musical Night",
                "Other Special Event"
        );

        // Populate number of guests options
        numberOfGuestComboBox.getItems().addAll(
                "0–50",
                "50–100",
                "100–200",
                "200+"
        );
    }

    @FXML
    public void submitButton(ActionEvent actionEvent) {

        // Basic validation
        if (memberIdTextfield.getText().isBlank()
                || eventDateTextfield.getText().isBlank()
                || eventTimeTextfield.getText().isBlank()
                || locationTextfield.getText().isBlank()
                || eventTypeCombobox.getValue() == null
                || numberOfGuestComboBox.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Validation Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all required fields before submitting.");
            alert.showAndWait();
            return;
        }

        // Show confirmation
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Request Submitted");
        alert.setHeaderText("Special Event Request Submitted");
        alert.setContentText(
                "Your request to attend the event has been submitted.\n\n" +
                        "Member ID: " + memberIdTextfield.getText() + "\n" +
                        "Event Type: " + eventTypeCombobox.getValue() + "\n" +
                        "Date: " + eventDateTextfield.getText() + "\n" +
                        "Time: " + eventTimeTextfield.getText() + "\n" +
                        "Location: " + locationTextfield.getText() + "\n" +
                        "Guests: " + numberOfGuestComboBox.getValue()
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
        memberIdTextfield.clear();
        eventDateTextfield.clear();
        eventTimeTextfield.clear();
        locationTextfield.clear();
        reqNotesTextarea.clear();
        eventTypeCombobox.getSelectionModel().clearSelection();
        numberOfGuestComboBox.getSelectionModel().clearSelection();
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
