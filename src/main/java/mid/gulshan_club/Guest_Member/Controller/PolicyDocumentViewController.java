package mid.gulshan_club.Guest_Member.Controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class PolicyDocumentViewController
{
    @javafx.fxml.FXML
    private ComboBox<String > dressCodeCombobox;
    @javafx.fxml.FXML
    private ComboBox<String > descriptionCombobox;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private Button acknowledgeButton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(javafx.event.ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Guest Member/ParkingRegistration-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Guest Member Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void acknowledgeButton(ActionEvent actionEvent) {

        if (dressCodeCombobox.getValue() == null ||
                descriptionCombobox.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Missing Selection");
            alert.setHeaderText(null);
            alert.setContentText("Please select all policy options before acknowledging.");
            alert.showAndWait();
            return;
        }

        String message =
                "Policy Acknowledged Successfully!\n\n" +
                        "Dress Code: " + dressCodeCombobox.getValue() + "\n" +
                        "Description: " + descriptionCombobox.getValue();

        outputLabel.setText(message);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Acknowledgement");
        alert.setHeaderText(null);
        alert.setContentText("Thank you for acknowledging the club policy.");
        alert.showAndWait();
    }

    public void acknowledgeButton(javafx.event.ActionEvent actionEvent) {
        if (dressCodeCombobox.getValue() == null ||
                descriptionCombobox.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Missing Selection");
            alert.setHeaderText(null);
            alert.setContentText("Please select all policy options before acknowledging.");
            alert.showAndWait();
            return;
        }

        String message =
                "Policy Acknowledged Successfully!\n\n" +
                        "Dress Code: " + dressCodeCombobox.getValue() + "\n" +
                        "Description: " + descriptionCombobox.getValue();

        outputLabel.setText(message);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Acknowledgement");
        alert.setHeaderText(null);
        alert.setContentText("Thank you for acknowledging the club policy.");
        alert.showAndWait();
    }
}