package mid.gulshan_club.Supplier.Controller;

import javafx.scene.control.Alert;

import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PurchaseOrderHandlingViewController
{
    @javafx.fxml.FXML
    private TableColumn totalLabel;
    @javafx.fxml.FXML
    private TableColumn unitPriceLabel;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private Button rejectButton;
    @javafx.fxml.FXML
    private TableColumn itemsLabel;
    @javafx.fxml.FXML
    private TableColumn quantityLabel;
    @javafx.fxml.FXML
    private Button confirmButton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Back");
        alert.setHeaderText(null);
        alert.setContentText("Returning to dashboard.");
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void rejectButton(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Order Rejected");
        alert.setHeaderText(null);
        alert.setContentText("The purchase order has been rejected.");
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void confirmButton(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Order Confirmed");
        alert.setHeaderText(null);
        alert.setContentText("The purchase order has been confirmed successfully.");
        alert.showAndWait();
    }
}