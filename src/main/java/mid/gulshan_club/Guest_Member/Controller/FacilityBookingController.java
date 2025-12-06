package mid.gulshan_club.Guest_Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mid.gulshan_club.ClubManager.Model.ClubFacilities;
import mid.gulshan_club.Guest_Member.Model.AppendableObjectOutputStream;
import mid.gulshan_club.Guest_Member.Model.FacilityBooking;
import mid.gulshan_club.HelloApplication;

import java.io.*;
import java.util.ArrayList;

public class FacilityBookingController {

    @FXML private TextField seatTextfield;
    @FXML private TableColumn<ClubFacilities, Integer> timeColumn;
    @FXML private ComboBox<String> availabilityComboBox;
    @FXML private TableView<ClubFacilities> facilitiesDataTableView;
    @FXML private TableColumn<ClubFacilities, String> nameColumn;
    @FXML private TableColumn<ClubFacilities, String> availabilityColumn;
    @FXML private TableColumn<ClubFacilities, Integer> seatColumn;
    @FXML private TextField timeTextfield;
    @FXML private TextField nameTextfield;

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("facilityName"));
        availabilityColumn.setCellValueFactory(new PropertyValueFactory<>("availability"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("availableSeat")); // time column
        seatColumn.setCellValueFactory(new PropertyValueFactory<>("seatCount"));

        availabilityComboBox.getItems().addAll("Available", "Not Available", "Booked");
    }

    @FXML
    public void refreshButton(ActionEvent actionEvent) {
        // optional: you can call loadDataButton(actionEvent) here if you want
    }

    @FXML
    public void bookButton(ActionEvent actionEvent) {
        if (nameTextfield.getText().isBlank()) {
            errorAlert("Facility name cannot be blank!");
            return;
        }
        if (timeTextfield.getText().isBlank()) {
            errorAlert("Time slot cannot be blank!");
            return;
        }
        if (seatTextfield.getText().isBlank()) {
            errorAlert("Seat count cannot be blank!");
            return;
        }
        if (availabilityComboBox.getValue() == null) {
            errorAlert("Please select availability!");
            return;
        }

        int time;
        int seat;
        try {
            time = Integer.parseInt(timeTextfield.getText());
            seat = Integer.parseInt(seatTextfield.getText());
        } catch (NumberFormatException e) {
            errorAlert("Time and Seat must be valid numbers!");
            return;
        }

        FacilityBooking bf = new FacilityBooking(
                nameTextfield.getText(),
                availabilityComboBox.getValue(),
                seat,
                time
        );

        try {
            File file = new File("GuestMemberfacilities.bin");
            FileOutputStream fos;
            ObjectOutputStream oos;

            if (file.exists()) {
                fos = new FileOutputStream(file, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(bf);
            oos.close();
            informationAlert("Facility booking saved successfully!");

        } catch (Exception e) {
            errorAlert("Error saving data to file!");
        }
    }

    @FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =
                new FXMLLoader(HelloApplication.class.getResource("Guest Member/guestMemberDashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Member Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void loadDataButton(ActionEvent actionEvent) {
        File file = new File("ClubFacility.bin");   // read from this file

        if (!file.exists()) {
            errorAlert("Bin file does not exist!");
            return;
        }

        ArrayList<ClubFacilities> records = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            while (true) {
                ClubFacilities r = (ClubFacilities) ois.readObject();
                records.add(r);
            }
        } catch (EOFException eof) {
            // end of file - normal
        } catch (ClassNotFoundException | IOException e) {
            errorAlert("Error reading data from file!");
        }

        facilitiesDataTableView.getItems().clear();
        facilitiesDataTableView.getItems().addAll(records);
    }

    private void errorAlert(String s){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText(s);
        a.showAndWait();
    }

    private void informationAlert(String s){
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(s);
        a.showAndWait();
    }
}
