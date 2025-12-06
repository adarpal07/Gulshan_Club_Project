package mid.gulshan_club.Guest_Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;

import java.io.IOException;

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


        infoAlert("Visitor information saved successfully.");
    }

    @FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Guest Member/bookVisitorAccess-view.fxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Guest Member Dashboard");
        stage.setScene(scene);
        stage.show();
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

    public void submitsaveButton(ActionEvent actionEvent) {
    }
}
