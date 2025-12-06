package mid.gulshan_club.Guest_Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SpecialFoodRequestController {

    @FXML
    private TextArea additionalNotexTextarea;

    @FXML
    private TextField bookingIdTextfield;

    @FXML
    private Button backButton;

    @FXML
    private TextField reqTimeTextfield;

    @FXML
    private ComboBox<String> numberOfservingsComboBox;

    @FXML
    private DatePicker visitDateDatepicker;

    @FXML
    private TextField foodTypeTextfield;

    @FXML
    private Button submitBychefButton;

    @FXML
    private TextField reqspecDishTextfield;

    @FXML
    private Button saveButton;

    @FXML
    public void initialize() {
        // Called automatically after FXML is loaded
        // Used to initialize UI components

        numberOfservingsComboBox.getItems().addAll(
                "1 Serving",
                "2 Servings",
                "3 Servings",
                "4+ Servings"
        );
    }

    @FXML
    public void backButton(ActionEvent actionEvent) {
        // TODO: Navigate back to previous screen/dashboard
    }

    @FXML
    public void saveButton(ActionEvent actionEvent) {
        // TODO: Save food request (without final submission)
    }

    @FXML
    public void submitBychefButton(ActionEvent actionEvent) {
        // TODO: Submit food request to chef
    }

    // If still referenced in FXML, keep it; otherwise it can be removed
    @Deprecated
    @FXML
    public void submitButton(ActionEvent actionEvent) {
        // Deprecated – no longer used
        // Kept only to avoid FXML runtime errors
    }

}
