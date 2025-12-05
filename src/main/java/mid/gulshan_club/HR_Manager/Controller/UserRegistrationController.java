package mid.gulshan_club.HR_Manager.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import mid.gulshan_club.AppendableObjectOutputStream;
import mid.gulshan_club.HR_Manager.Model.UserRegistration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserRegistrationController
{
    @javafx.fxml.FXML
    private TextField phoneNumberTextField;
    @javafx.fxml.FXML
    private ComboBox<String> userTypeComboBox;
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private TextField idNumberTextField;
    @javafx.fxml.FXML
    private TextField nIDTextField;
    @javafx.fxml.FXML
    private DatePicker joiningDateDatePicker;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private ComboBox<String>genderComboBox;
    @javafx.fxml.FXML
    private Label emailAddressTextField;
    @javafx.fxml.FXML
    private ComboBox<String> departmentComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        userTypeComboBox.getItems().addAll("General Member","Guest Member","Chef","Accountant","Club Manager","Supplier","");
        departmentComboBox.getItems().addAll("Administration","Accounts & Finance","Kitchen","Membership","Procurement");
        genderComboBox.getItems().addAll("Male","Female");

    }
    ArrayList<UserRegistration> userList = new ArrayList<UserRegistration>();

    @javafx.fxml.FXML
    public void saveUserInfoButtonOnAction(ActionEvent actionEvent) {
        ObjectOutputStream oos = null;

        try{
            File objectFile = new File("UserRegistrationObjects.bin");
            FileOutputStream fosObject = null;
            if (objectFile.exists()){
                fosObject = new FileOutputStream(objectFile,true);
                oos = new AppendableObjectOutputStream(fosObject);
            }
            else{
                fosObject = new FileOutputStream(objectFile);
                oos = new ObjectOutputStream(fosObject);
            }

            for (UserRegistration i : userList){
                oos.writeObject(i);
            }
            oos.close();
        }
        catch (Exception e){

        }


    }

    @javafx.fxml.FXML
    public void createNewUserButtonOnAction(ActionEvent actionEvent) {
        UserRegistration u = new UserRegistration(
                Long.parseLong(idNumberTextField.getText()),
                nameTextField.getText(),
                userTypeComboBox.getValue(),
                departmentComboBox.getValue(),
                addressTextField.getText(),
                emailAddressTextField.getText(),
                genderComboBox.getValue(),
                joiningDateDatePicker.getValue(),
                Integer.parseInt(phoneNumberTextField.getText()),
                Integer.parseInt(nIDTextField.getText())
        );

    }
}