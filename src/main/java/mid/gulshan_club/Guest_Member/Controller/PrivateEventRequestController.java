package mid.gulshan_club.Guest_Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
        eventTypeCombobox.getItems().addAll(
                "Wedding",
                "Corporate Event",
                "Anniversary"
        );
        cateringServiceCombobox.getItems().addAll(
                "In-house Catering",
                "External Catering",
                "No Catering"
        );
        conventionHallsComboBox.getItems().addAll(
                "Banquet Hall A",
                "Banquet Hall B",
                "Convention Hall"
        );
        estimatedGuestCombobox.getItems().addAll(
                "50–100",
                "100–200",
                "200–300",
                "300+"
        );
    }

    @FXML
    public void submitButton(ActionEvent actionEvent) {
        // TODO: Validate inputs and submit private event request
        // Example:
        // - Check required fields
        // - Save data to database
        // - Show confirmation alert
    }

    @FXML
    public void cancelButton(ActionEvent actionEvent) {
        // TODO: Clear form fields or reset selections
    }

    @FXML
    public void backButton(ActionEvent actionEvent) {
        // TODO: Navigate back to dashboard or previous screen
    }
}
