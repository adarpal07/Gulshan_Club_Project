package mid.gulshan_club.Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mid.gulshan_club.ClubManager.Model.ClubFacilities;
import mid.gulshan_club.HelloApplication;
import mid.gulshan_club.Member.Model.BookFacility;

import java.io.*;
import java.util.ArrayList;

public class BookFacilityController
{
    @javafx.fxml.FXML
    private TextField seatTextfield;
    @javafx.fxml.FXML
    private TableColumn<ClubFacilities, Integer> timeColumn;
    @javafx.fxml.FXML
    private ComboBox<String> availabilityComboBox;
    @javafx.fxml.FXML
    private TableView<ClubFacilities> facilitiesDataTableView;
    @javafx.fxml.FXML
    private TableColumn<ClubFacilities, String> nameColumn;
    @javafx.fxml.FXML
    private TableColumn<ClubFacilities, String> availabilityColumn;
    @javafx.fxml.FXML
    private TableColumn<ClubFacilities, Integer> seatColumn;
    @javafx.fxml.FXML
    private TextField timeTextfield;
    @javafx.fxml.FXML
    private TextField nameTextfield;

    @javafx.fxml.FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("facilityName"));
        availabilityColumn.setCellValueFactory(new PropertyValueFactory<>("availability"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("availableSeat")); // if you meant timeslot change key
        seatColumn.setCellValueFactory(new PropertyValueFactory<>("seatCount"));

        availabilityComboBox.getItems().addAll("Available", "Not Available", "Booked");
    }

    @javafx.fxml.FXML
    public void loadDataButton(ActionEvent actionEvent) throws IOException {
        File file = new File("ClubFacilities.bin");

        if (!file.exists()) {
            System.out.println("Bin file dose not exist");
            return;
        }

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<ClubFacilities> records = new ArrayList<>();

        try {
            while (true) {
                ClubFacilities r = (ClubFacilities) ois.readObject();
                records.add(r);
            }
        } catch (EOFException eof) {
            errorAlert("End of file reached");
        } catch (ClassNotFoundException | IOException cnf) {
            errorAlert("Class not found!");
        }

        facilitiesDataTableView.getItems().clear();
        facilitiesDataTableView.getItems().addAll(records);
    }

    @javafx.fxml.FXML
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

        BookFacility bf = new BookFacility(
                nameTextfield.getText(),
                availabilityComboBox.getValue(),
                Integer.parseInt(timeTextfield.getText()),
                Integer.parseInt(seatTextfield.getText())
        );
        try {
            File file = new File("BookedFacilities.bin");
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