package mid.gulshan_club.Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;
import mid.gulshan_club.Member.Model.SubscriptionBillPayment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SubscriptionBillPaymentController
{
    @javafx.fxml.FXML
    private TextField amountTextfield;
    @javafx.fxml.FXML
    private ComboBox<String> paymentmethodComboBox;
    @javafx.fxml.FXML
    private TextField idTextfield;
    @javafx.fxml.FXML
    private ComboBox<String> monthComboBox;
    @javafx.fxml.FXML
    private DatePicker paymentDatePicker;
    @javafx.fxml.FXML
    private TextField nameTextfield;

    @javafx.fxml.FXML
    public void initialize() {
        paymentmethodComboBox.getItems().addAll("Cash", "Card", "Bkash", "Rocket", "Nagad");
        monthComboBox.getItems().addAll("January","February","March","April","May","June", "July","August","September","October","November","December");
    }

    @javafx.fxml.FXML
    public void payBillButton(ActionEvent actionEvent) {
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
        if (paymentmethodComboBox.getValue() == null) {
            errorAlert("Please select a payment method!");
            return;
        }
        if (monthComboBox.getValue() == null) {
            errorAlert("Please select a payment month!");
            return;
        }
        if (paymentDatePicker.getValue() == null) {
            errorAlert("Please select a payment date!");
            return;
        }
        SubscriptionBillPayment sbp = new SubscriptionBillPayment(
                nameTextfield.getText(),
                paymentmethodComboBox.getValue(),
                monthComboBox.getValue(),
                Integer.parseInt(idTextfield.getText()),
                Integer.parseInt(amountTextfield.getText()),
                paymentDatePicker.getValue()
        );
        try {
            File file = new File("PaySubscriptionBill.bin");
            FileOutputStream fos;
            ObjectOutputStream oos;

            if (file.exists()) {
                fos = new FileOutputStream(file, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(sbp);
            oos.close();
            informationAlert("Subscription bill payment saved successfully!");

        } catch (Exception e) {
            errorAlert("Error saving data to file!");
        }
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Member/memberDashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Member Dashboard");
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