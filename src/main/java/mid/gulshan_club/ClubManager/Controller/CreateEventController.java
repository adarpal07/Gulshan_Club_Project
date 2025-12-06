package mid.gulshan_club.ClubManager.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import mid.gulshan_club.ClubManager.Model.CreateEvent;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class CreateEventController
{
    @javafx.fxml.FXML
    private TextField seatTextfield;
    @javafx.fxml.FXML
    private DatePicker eventDatepicker;
    @javafx.fxml.FXML
    private TextField amountTextfield;
    @javafx.fxml.FXML
    private TextField venueTextfield;
    @javafx.fxml.FXML
    private TextField nameTextfield;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void createButton(ActionEvent actionEvent) {
        if (nameTextfield.getText().isBlank()) {
            errorAlert("Event name cannot be blank!");
            return;
        }
        if (venueTextfield.getText().isBlank()) {
            errorAlert("Venue cannot be blank!");
            return;
        }
        if (seatTextfield.getText().isBlank()) {
            errorAlert("Seat count cannot be blank!");
            return;
        }
        if (amountTextfield.getText().isBlank()) {
            errorAlert("Amount cannot be blank!");
            return;
        }
        if (eventDatepicker.getValue() == null) {
            errorAlert("Please select an event date!");
            return;
        }

        CreateEvent ce = new CreateEvent(
                nameTextfield.getText(),
                venueTextfield.getText(),
                Integer.parseInt(seatTextfield.getText()),
                Integer.parseInt(amountTextfield.getText()),
                eventDatepicker.getValue()
        );

        try {
            File file = new File("EventInfo.bin");
            FileOutputStream fos;
            ObjectOutputStream oos;

            if (file.exists()) {
                fos = new FileOutputStream(file, true);
                oos = new AppendableObjectOutputStream(fos); // custom class
            } else {
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(ce);
            oos.close();
            informationAlert("Event created successfully!");

        } catch (Exception e) {
            errorAlert("Error saving event data to file!");
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

