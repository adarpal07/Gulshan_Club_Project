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
import mid.gulshan_club.Accountant.Model.RecordMembershipFee;
import mid.gulshan_club.HelloApplication;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class RecordMembershipFeeController
{
    @javafx.fxml.FXML
    private TextField amountTextfield;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private TextField idTextfield;
    @javafx.fxml.FXML
    private ComboBox<String> monthComboBox;
    @javafx.fxml.FXML
    private DatePicker recordDatePicker;
    @javafx.fxml.FXML
    private TextField nameTextfield;

    @javafx.fxml.FXML
    public void initialize() {
        statusComboBox.getItems().addAll("Paid","Unpaid");
        monthComboBox.getItems().addAll("January","February","March","April","May","June","July","August","September","October","November","December");
    }

    @javafx.fxml.FXML
    public void recordPaymentButton(ActionEvent actionEvent) {
        if (nameTextfield.getText().isBlank()) {
            errorAlert("Member name cannot be blank!");
            return;
        }
        if (idTextfield.getText().isBlank()) {
            errorAlert("Member ID cannot be blank!");
            return;
        }
        if (amountTextfield.getText().isBlank()) {
            errorAlert("Amount cannot be blank!");
            return;
        }
        if (statusComboBox.getValue() == null) {
            errorAlert("Please select a status!");
            return;
        }
        if (monthComboBox.getValue() == null) {
            errorAlert("Please select a month!");
            return;
        }
        if (recordDatePicker.getValue() == null) {
            errorAlert("Please select a record date!");
            return;
        }
        RecordMembershipFee rmf = new RecordMembershipFee(
                nameTextfield.getText(),
                statusComboBox.getValue(),
                monthComboBox.getValue(),
                Integer.parseInt(idTextfield.getText()),
                Integer.parseInt(amountTextfield.getText()),
                recordDatePicker.getValue()
        );
        try {

            File file = new File("RecordMembershipFee.bin");
            FileOutputStream fos;
            ObjectOutputStream oos;

            if (file.exists()) {
                fos = new FileOutputStream(file, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(rmf);
            oos.close();
            informationAlert("Membership fee record saved successfully!");

        } catch (Exception e) {
            errorAlert("Error saving data to file!");
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