package mid.gulshan_club.Supplier.Controller;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class InventoryManagementController
{
    @javafx.fxml.FXML
    private TableColumn itemNameColumn;
    @javafx.fxml.FXML
    private TableColumn unitColumn;
    @javafx.fxml.FXML
    private Button submitButton;
    @javafx.fxml.FXML
    private TableColumn catagoryColumn;
    @javafx.fxml.FXML
    private TableColumn expDateColumn;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private TextField unitTextfield;
    @javafx.fxml.FXML
    private ComboBox catagoryComboBox;
    @javafx.fxml.FXML
    private ComboBox expDateCombobox;
    @javafx.fxml.FXML
    private TableView inventoryTableview;
    @javafx.fxml.FXML
    private TextField itemNameTextfield;
    @javafx.fxml.FXML
    private DatePicker dateDatepicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }
}