package mid.gulshan_club.ClubManager.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import mid.gulshan_club.ClubManager.Model.ClubFacilities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CreateClubFacilityController
{
    @javafx.fxml.FXML
    private TextField seatTextfield;
    @javafx.fxml.FXML
    private ComboBox<String> availabilityComboBox;
    @javafx.fxml.FXML
    private TextField timeTextfield;
    @javafx.fxml.FXML
    private TextField nameTextfield;

    @javafx.fxml.FXML
    public void initialize() {
        availabilityComboBox.getItems().addAll("Available", "Not Available", "Pending");
    }

    @javafx.fxml.FXML
    public void createButton(ActionEvent actionEvent) {
        if (nameTextfield.getText().isBlank()) {
            errorAlert("Facility name cannot be blank!");
            return;
        }
        if (availabilityComboBox.getValue() == null) {
            errorAlert("Please select the availability!");
            return;
        }
        if (seatTextfield.getText().isBlank()) {
            errorAlert("Seat count cannot be blank!");
            return;
        }
        if (timeTextfield.getText().isBlank()) {
            errorAlert("Available seat cannot be blank!");
            return;
        }

        ClubFacilities cf = new ClubFacilities(
                nameTextfield.getText(),
                availabilityComboBox.getValue(),
                Integer.parseInt(timeTextfield.getText()),
                Integer.parseInt(seatTextfield.getText())
        );

        try {
            File file = new File("ClubFacility.bin");
            FileOutputStream fos;
            ObjectOutputStream oos;

            if (file.exists()) {
                fos = new FileOutputStream(file, true);
                oos = new AppendableObjectOutputStream(fos); // custom class to skip header
            } else {
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(cf);
            oos.close();
            informationAlert("Facility created successfully!");

        } catch (Exception e) {
            errorAlert("Error saving facility data to file!");
        }
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