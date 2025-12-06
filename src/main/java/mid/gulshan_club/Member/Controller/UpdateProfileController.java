package mid.gulshan_club.Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;
import mid.gulshan_club.Member.Model.UpdateProfile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UpdateProfileController
{
    @javafx.fxml.FXML
    private TextField nidNumTextfield;
    @javafx.fxml.FXML
    private TextField phoneNumTextfield;
    @javafx.fxml.FXML
    private TextField idTextfield;
    @javafx.fxml.FXML
    private TextField addressTextfield;
    @javafx.fxml.FXML
    private TextField ageTextfield;
    @javafx.fxml.FXML
    private TextField emailTextfield;
    @javafx.fxml.FXML
    private DatePicker dateOfBithDatePicker;
    @javafx.fxml.FXML
    private TextField nameTextfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveInfoButton(ActionEvent actionEvent) {
        if (nameTextfield.getText().isBlank()) {
            errorAlert("Name cannot be blank!");
            return;
        }
        if (idTextfield.getText().isBlank()) {
            errorAlert("ID cannot be blank!");
            return;
        }
        if (addressTextfield.getText().isBlank()) {
            errorAlert("Address cannot be blank!");
            return;
        }
        if (emailTextfield.getText().isBlank()) {
            errorAlert("Email cannot be blank!");
            return;
        }
        if (ageTextfield.getText().isBlank()) {
            errorAlert("Age cannot be blank!");
            return;
        }
        if (phoneNumTextfield.getText().isBlank()) {
            errorAlert("Phone number cannot be blank!");
            return;
        }
        if (nidNumTextfield.getText().isBlank()) {
            errorAlert("NID number cannot be blank!");
            return;
        }
        if (dateOfBithDatePicker.getValue() == null) {
            errorAlert("Please select your date of birth!");
            return;
        }
        UpdateProfile up = new UpdateProfile(
                nameTextfield.getText(),
                addressTextfield.getText(),
                emailTextfield.getText(),
                Integer.parseInt(idTextfield.getText()),
                Integer.parseInt(ageTextfield.getText()),
                Integer.parseInt(phoneNumTextfield.getText()),
                Integer.parseInt(nidNumTextfield.getText()),
                dateOfBithDatePicker.getValue()
        );
        try {
            File file = new File("PersonalInformation.bin");
            FileOutputStream fos;
            ObjectOutputStream oos;

            if (file.exists()) {
                fos = new FileOutputStream(file, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(up);
            oos.close();
            informationAlert("Personal information saved successfully!");
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