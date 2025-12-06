package mid.gulshan_club.Guest_Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;

import java.io.IOException;

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
        // Initialize number of servings options
        numberOfservingsComboBox.getItems().addAll(
                "1 Serving",
                "2 Servings",
                "3 Servings",
                "4+ Servings"
        );
    }

    @FXML
    public void saveButton(ActionEvent actionEvent) {

        // Validation for draft saving (minimal)
        if (bookingIdTextfield.getText().isBlank()
                || foodTypeTextfield.getText().isBlank()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Validation Error");
            alert.setHeaderText(null);
            alert.setContentText("Booking ID and Food Type are required to save a draft.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Draft Saved");
        alert.setHeaderText(null);
        alert.setContentText("Special food request has been saved as a draft.");
        alert.showAndWait();
    }

    @FXML
    public void submitBychefButton(ActionEvent actionEvent) {

        // Full validation before submission
        if (bookingIdTextfield.getText().isBlank()
                || foodTypeTextfield.getText().isBlank()
                || numberOfservingsComboBox.getValue() == null
                || visitDateDatepicker.getValue() == null
                || reqTimeTextfield.getText().isBlank()
                || reqspecDishTextfield.getText().isBlank()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Validation Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all required fields before submitting.");
            alert.showAndWait();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Request Submitted");
        alert.setHeaderText("Special Food Request Sent to Chef");
        alert.setContentText(
                "Booking ID: " + bookingIdTextfield.getText() + "\n" +
                        "Food Type: " + foodTypeTextfield.getText() + "\n" +
                        "Servings: " + numberOfservingsComboBox.getValue() + "\n" +
                        "Visit Date: " + visitDateDatepicker.getValue() + "\n" +
                        "Time: " + reqTimeTextfield.getText() + "\n" +
                        "Special Dish: " + reqspecDishTextfield.getText()
        );
        alert.showAndWait();

        // Clear form after successful submission
        clearForm();
    }

    private void clearForm() {
        bookingIdTextfield.clear();
        foodTypeTextfield.clear();
        reqTimeTextfield.clear();
        reqspecDishTextfield.clear();
        additionalNotexTextarea.clear();
        numberOfservingsComboBox.setValue(null);
        visitDateDatepicker.setValue(null);
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

    // Deprecated handler kept only if referenced in FXML
    @Deprecated
    @FXML
    public void submitButton(ActionEvent actionEvent) {
        // No longer used
    }
}
