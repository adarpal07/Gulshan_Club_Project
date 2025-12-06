package mid.gulshan_club.Supplier.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;
import mid.gulshan_club.Supplier.Model.TrainingSupply;

import java.io.IOException;

public class TrainingSuppliesViewController {

    @FXML
    private TextField poNoTextfield;

    @FXML
    private TextField itemTextField;

    @FXML
    private TextField kitchenLocatTextfield;

    @FXML
    private DatePicker proposedeliveryDatetoChefDatepicker;

    @FXML
    private ComboBox<String> trainingDateComboBox;

    @FXML
    private TextField quantityTextfield;

    @FXML
    private Button confirmButton;

    @FXML
    private Button backButton;

    @FXML
    public void initialize() {
        trainingDateComboBox.getItems().addAll(
                "Morning Session",
                "Afternoon Session",
                "Evening Session"
        );
    }

    @FXML
    public void confirmButton(ActionEvent actionEvent) {

        if (poNoTextfield.getText().isBlank()
                || itemTextField.getText().isBlank()
                || kitchenLocatTextfield.getText().isBlank()
                || trainingDateComboBox.getValue() == null
                || proposedeliveryDatetoChefDatepicker.getValue() == null
                || quantityTextfield.getText().isBlank()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Validation Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all fields before confirming.");
            alert.showAndWait();
            return;
        }

        int quantity;
        try {
            quantity = Integer.parseInt(quantityTextfield.getText());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Quantity");
            alert.setHeaderText(null);
            alert.setContentText("Quantity must be a whole number.");
            alert.showAndWait();
            return;
        }

        TrainingSupply supply = new TrainingSupply(
                poNoTextfield.getText(),
                itemTextField.getText(),
                kitchenLocatTextfield.getText(),
                trainingDateComboBox.getValue(),
                proposedeliveryDatetoChefDatepicker.getValue(),
                quantity
        );

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Confirmed");
        alert.setHeaderText(null);
        alert.setContentText("Training supply confirmed:\n" + supply);
        alert.showAndWait();

        clearForm();
    }

    private void clearForm() {
        poNoTextfield.clear();
        itemTextField.clear();
        kitchenLocatTextfield.clear();
        quantityTextfield.clear();
        trainingDateComboBox.setValue(null);
        proposedeliveryDatetoChefDatepicker.setValue(null);
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
