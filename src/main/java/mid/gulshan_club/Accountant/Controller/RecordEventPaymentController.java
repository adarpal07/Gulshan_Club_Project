package mid.gulshan_club.Accountant.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mid.gulshan_club.Accountant.Model.RecordEventPayment;
import mid.gulshan_club.HelloApplication;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class RecordEventPaymentController
{
    @javafx.fxml.FXML
    private DatePicker eventDateDatePicker;
    @javafx.fxml.FXML
    private TextField amountTextfield;
    @javafx.fxml.FXML
    private TextField venueTextfield;
    @javafx.fxml.FXML
    private ComboBox<String> monthComboBox;
    @javafx.fxml.FXML
    private TextField timeTextfield;
    @javafx.fxml.FXML
    private DatePicker recordDatePicker;
    @javafx.fxml.FXML
    private TextField nameTextfield;

    @javafx.fxml.FXML
    public void initialize() {
        monthComboBox.getItems().addAll("January","February","March","April","May","June","July","August","September","October","November","December");
    }

    @javafx.fxml.FXML
    public void recordPaymentButton(ActionEvent actionEvent) {
        if (nameTextfield.getText().isBlank()) {
            errorAlert("Name field can't be blank!");
            return;
        }
        if (venueTextfield.getText().isBlank()) {
            errorAlert("Venue name field can't be blank!");
            return;
        }
        if (monthComboBox.getValue() == null) {
            errorAlert("Please select a month!");
            return;
        }
        if (eventDateDatePicker.getValue() == null) {
            errorAlert("Please select an event date!");
            return;
        }
        if (recordDatePicker.getValue() == null) {
            errorAlert("Please select a record date!");
            return;
        }
        RecordEventPayment rep = new RecordEventPayment(
                nameTextfield.getText(),
                venueTextfield.getText(),
                monthComboBox.getValue(),
                Integer.parseInt(amountTextfield.getText()),
                Integer.parseInt(timeTextfield.getText()),
                eventDateDatePicker.getValue(),
                recordDatePicker.getValue()
        );
        try {
            File file = new File("EventPaymentRecord.bin");

            FileOutputStream fos;
            ObjectOutputStream oos;

            if (file.exists()) {
                fos = new FileOutputStream(file, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(rep);
            oos.close();

            informationAlert("Event Payment Recorded Successfully!");

        } catch (Exception e) {
            errorAlert("Error while saving event payment record!");
        }
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Accountant/accountantDashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Accountant Dashboard");
        stage.setScene(scene);
        stage.show();
    }
    public void errorAlert(String s){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText(s);
        a.showAndWait();
    }
    public void informationAlert(String s){
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(s);
        a.showAndWait();
    }
}