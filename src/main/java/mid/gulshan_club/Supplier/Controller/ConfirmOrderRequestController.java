package mid.gulshan_club.Supplier.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ConfirmOrderRequestController {

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
        // This method is called automatically after the FXML is loaded
        // Initialize table columns, combo box values, etc.

        statusCombobox.getItems().addAll(
                "Pending",
                "Approved",
                "Rejected"
        );
    }

    @FXML
    public void loadataButton(ActionEvent actionEvent) {
        // TODO: load data into reqTableView
        // Example: fetch order requests from database
    }

    @FXML
    public void saveButton(ActionEvent actionEvent) {
        // TODO: save/update selected order status
    }

    @FXML
    public void backButton(ActionEvent actionEvent) {
        // TODO: navigate back to previous screen
    }
}
