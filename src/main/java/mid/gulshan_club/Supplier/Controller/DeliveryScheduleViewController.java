package mid.gulshan_club.Supplier.Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class DeliveryScheduleViewController
{
    @javafx.fxml.FXML
    private Button submitButton;
    @javafx.fxml.FXML
    private TextField contactNumTextfield;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private TextField unitTextfield;
    @javafx.fxml.FXML
    private TextField nameOfItemTextfield;
    @javafx.fxml.FXML
    private ComboBox<String > deliveryTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker dateDatepicker;
    @javafx.fxml.FXML
    private TextArea noteTextarea;

    @javafx.fxml.FXML
    public void initialize() {
        // Initialize delivery type options
        deliveryTypeComboBox.getItems().addAll(
                "Normal Delivery",
                "Express Delivery",
                "Urgent Delivery"
        );
    }

    @javafx.fxml.FXML
    public void submitButton(ActionEvent actionEvent) {

        // Simple confirmation message
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Submitted");
        alert.setHeaderText(null);
        alert.setContentText("Your request has been submitted successfully.");
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void backButton(javafx.event.ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Supplier/DeliverySchedule-View.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Supplier Dashboard");
        stage.setScene(scene);
        stage.show();
    }
}