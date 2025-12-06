package mid.gulshan_club.Guest_Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
        // This runs after FXML is loaded; use it to populate combo boxes, etc.

        eventTypeCombobox.getItems().addAll(
                "Cultural Program",
                "Sports Event",
                "Musical Night",
                "Other Special Event"
        );

        numberOfGuestComboBox.getItems().addAll(
                "0–50",
                "50–100",
                "100–200",
                "200+"
        );
    }

    @FXML
    public void submitButton(ActionEvent actionEvent) {
        // TODO: Validate inputs and submit the request
        // Example:
        // - Check required fields (memberId, date, time, etc.)
        // - Show a confirmation Alert
    }

    @FXML
    public void cancelButton(ActionEvent actionEvent) {
        // TODO: Clear/reset all fields
        memberIdTextfield.clear();
        eventDateTextfield.clear();
        eventTimeTextfield.clear();
        locationTextfield.clear();
        reqNotesTextarea.clear();
        eventTypeCombobox.getSelectionModel().clearSelection();
        numberOfGuestComboBox.getSelectionModel().clearSelection();
    }

    @FXML
    public void backButton(ActionEvent actionEvent) {
        // TODO: Navigate back to the previous scene / dashboard
    }
}
