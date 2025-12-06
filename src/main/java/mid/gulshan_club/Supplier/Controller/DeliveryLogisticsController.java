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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;
import mid.gulshan_club.Supplier.Model.DeliveryLogistics;

import java.io.IOException;

public class DeliveryLogisticsController {

    @FXML
    private TextField driverContactTextfield;

    @FXML
    private TextField tracNumTextfield;

    @FXML
    private TextField driverNameTextfield;

    @FXML
    private DatePicker etaDatepicker;

    @FXML
    private Button saveButton;

    @FXML
    private Button backButton;

    @FXML
    private ComboBox<String> courrierOptionComboBox;

    @FXML
    public void initialize() {
        courrierOptionComboBox.getItems().addAll(
                "DHL",
                "FedEx",
                "Local Courier",
                "In-house Delivery"
        );
    }

    @FXML
    public void saveButton(ActionEvent actionEvent) {

        if (tracNumTextfield.getText().isBlank()
                || courrierOptionComboBox.getValue() == null
                || driverNameTextfield.getText().isBlank()
                || driverContactTextfield.getText().isBlank()
                || etaDatepicker.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Validation Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all required fields.");
            alert.showAndWait();
            return;
        }

        DeliveryLogistics logistics = new DeliveryLogistics(
                tracNumTextfield.getText(),
                courrierOptionComboBox.getValue(),
                driverNameTextfield.getText(),
                driverContactTextfield.getText(),
                etaDatepicker.getValue()
        );

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Saved");
        alert.setHeaderText(null);
        alert.setContentText("Delivery logistics saved successfully.");
        alert.showAndWait();

        clearForm();
    }

    private void clearForm() {
        tracNumTextfield.clear();
        driverNameTextfield.clear();
        driverContactTextfield.clear();
        etaDatepicker.setValue(null);
        courrierOptionComboBox.setValue(null);
    }

    @FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
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
