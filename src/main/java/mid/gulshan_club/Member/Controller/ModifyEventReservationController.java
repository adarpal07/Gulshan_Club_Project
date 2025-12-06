package mid.gulshan_club.Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mid.gulshan_club.ClubManager.Model.CreateEvent;
import mid.gulshan_club.HelloApplication;
import mid.gulshan_club.Member.Model.SeatReservation;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ModifyEventReservationController
{
    @javafx.fxml.FXML
    private TextField seatTextfield;
    @javafx.fxml.FXML
    private TableView<SeatReservation> eventDataTableView;
    @javafx.fxml.FXML
    private TableColumn<SeatReservation, String> nameColumn;
    @javafx.fxml.FXML
    private TextField venueTextfield;
    @javafx.fxml.FXML
    private TableColumn<SeatReservation, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private TableColumn<SeatReservation, String> venueColumn;
    @javafx.fxml.FXML
    private TableColumn<SeatReservation, Integer> seatColumn;
    @javafx.fxml.FXML
    private DatePicker eventDatePicker;
    @javafx.fxml.FXML
    private TextField nameTextfield;

    @javafx.fxml.FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("eventDate"));
        venueColumn.setCellValueFactory(new PropertyValueFactory<>("venue"));
        seatColumn.setCellValueFactory(new PropertyValueFactory<>("seatCount"));
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

    @javafx.fxml.FXML
    public void loadEventButton(ActionEvent actionEvent) throws IOException {
        File file = new File("SeatReservation.bin");

        if (!file.exists()) {
            System.out.println("Bin file dose not exist");
            return;
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<SeatReservation> records = new ArrayList<>();

        try {
            while (true) {
                SeatReservation r = (SeatReservation) ois.readObject();
                records.add(r);
            }
        } catch (EOFException eof) {
            informationAlert("Click Ok to Load Data");
        } catch (ClassNotFoundException | IOException cnf) {
            errorAlert("Class not found!");
        }
        eventDataTableView.getItems().clear();
        eventDataTableView.getItems().addAll(records);
    }

    @javafx.fxml.FXML
    public void reservationModifyButton(ActionEvent actionEvent) {
        if (nameTextfield.getText().isBlank()) {
            errorAlert("Event name cannot be blank!");
            return;
        }
        if (venueTextfield.getText().isBlank()) {
            errorAlert("Venue cannot be blank!");
            return;
        }
        if (seatTextfield.getText().isBlank()) {
            errorAlert("Modified seat count cannot be blank!");
            return;
        }
        if (eventDatePicker.getValue() == null) {
            errorAlert("Please select an event date!");
            return;
        }
        SeatReservation sr = new SeatReservation(
                nameTextfield.getText(),
                venueTextfield.getText(),
                eventDatePicker.getValue(),
                Integer.parseInt(seatTextfield.getText())
        );
        try {
            File file = new File("ModifiedSeatReservation.bin");
            FileOutputStream fos;
            ObjectOutputStream oos;

            if (file.exists()) {
                fos = new FileOutputStream(file, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(sr);
            oos.close();
            informationAlert("Seat reservation modified successfully!");

        } catch (Exception e) {
            errorAlert("Error saving reservation data to file!");
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

