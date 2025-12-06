package mid.gulshan_club.Supplier.Controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;

import java.io.IOException;

public class ConfirmOrderController {

    @FXML
    private TableColumn<?, ?> reqNumColumn;

    @FXML
    private TableColumn<?, ?> reqDateColumn;

    @FXML
    private TextField amountTextfield;

    @FXML
    private ComboBox<String> statusCombobox;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @FXML
    private TableView<?> reqTableView;

    @FXML
    private TableColumn<?, ?> amountColumn;

    @FXML
    private Button backButton;

    @FXML
    private TextField reqNumTextfield;

    @FXML
    private DatePicker requestDatePicker;

    @FXML
    public void initialize() {
        // This method is called automatically after the FXML is loaded.
        // Initialize status combo box values.

        statusCombobox.getItems().addAll(
                "Pending",
                "Approved",
                "Rejected"
        );
    }

    @FXML
    public void loadataButton(ActionEvent actionEvent) {

    }

    @FXML
    public void saveButton(ActionEvent actionEvent) {

        // Basic validation
        if (reqNumTextfield.getText().isBlank()
                || requestDatePicker.getValue() == null
                || amountTextfield.getText().isBlank()
                || statusCombobox.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Validation Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all fields before saving the order.");
            alert.showAndWait();
            return;
        }

        // Validate amount is a number
        try {
            Double.parseDouble(amountTextfield.getText());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Amount");
            alert.setHeaderText(null);
            alert.setContentText("Amount must be a valid number.");
            alert.showAndWait();
            return;
        }

        // At this point, data is valid.
        // Here you could save/update to file or DB.
        // For now, just show a confirmation.

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Saved");
        alert.setHeaderText(null);
        alert.setContentText("Order request has been saved/updated successfully.");
        alert.showAndWait();
    }

    @FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        // Navigate back to Supplier Dashboard (adjust FXML name if needed)
        FXMLLoader fxmlLoader =
                new FXMLLoader(HelloApplication.class.getResource("Supplier/supplierDashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource())
                .getScene()
                .getWindow();
        stage.setTitle("Supplier Dashboard");
        stage.setScene(scene);
        stage.show();
    }
}

