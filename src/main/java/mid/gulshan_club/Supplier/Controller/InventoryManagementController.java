package mid.gulshan_club.Supplier.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;

import java.io.IOException;

public class InventoryManagementController {

    @FXML
    private TableColumn<?, ?> itemNameColumn;

    @FXML
    private TableColumn<?, ?> unitColumn;

    @FXML
    private Button submitButton;

    @FXML
    private TableColumn<?, ?> catagoryColumn;

    @FXML
    private TableColumn<?, ?> expDateColumn;

    @FXML
    private Button backButton;

    @FXML
    private TextField unitTextfield;

    @FXML
    private ComboBox<String> catagoryComboBox;

    @FXML
    private ComboBox<String> expDateCombobox;

    @FXML
    private TableView<?> inventoryTableview;

    @FXML
    private TextField itemNameTextfield;

    @FXML
    private DatePicker dateDatepicker;

    @FXML
    public void initialize() {
        // Initialize category options
        catagoryComboBox.getItems().addAll(
                "Food",
                "Beverage",
                "Cleaning Supplies",
                "Equipment",
                "Other"
        );

        // Initialize expiry options (for quick selection)
        expDateCombobox.getItems().addAll(
                "1 Week",
                "1 Month",
                "3 Months",
                "6 Months",
                "1 Year+"
        );
    }

    @FXML
    public void submitButton(ActionEvent actionEvent) {

        // Basic validation
        if (itemNameTextfield.getText().isBlank()
                || unitTextfield.getText().isBlank()
                || catagoryComboBox.getValue() == null
                || dateDatepicker.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Validation Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in item name, unit, category, and expiry date.");
            alert.showAndWait();
            return;
        }

        // At this point, data is valid.
        // You can later:
        //  - Add a model class for inventory items
        //  - Add rows to inventoryTableview
        //  - Save to file or database

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Inventory Updated");
        alert.setHeaderText(null);
        alert.setContentText("Inventory record saved successfully.");
        alert.showAndWait();

        // Optional: clear fields after save
        itemNameTextfield.clear();
        unitTextfield.clear();
        catagoryComboBox.setValue(null);
        expDateCombobox.setValue(null);
        dateDatepicker.setValue(null);
    }

    @FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("Supplier/supplierDashboard-view.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource())
                .getScene()
                .getWindow();
        stage.setTitle("Supplier Dashboard");
        stage.setScene(scene);
        stage.show();
    }
}