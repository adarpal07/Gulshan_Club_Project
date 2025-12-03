package mid.gulshan_club.Member.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PaymentHistoryController
{
    @javafx.fxml.FXML
    private ComboBox billTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn monthColumn;
    @javafx.fxml.FXML
    private TableColumn nameColumn;
    @javafx.fxml.FXML
    private TableColumn amountColumn;
    @javafx.fxml.FXML
    private TableColumn dateColumn;
    @javafx.fxml.FXML
    private TableView paymentHistoryTableView;
    @javafx.fxml.FXML
    private TableColumn idColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewHistoryButton(ActionEvent actionEvent) {
    }
}