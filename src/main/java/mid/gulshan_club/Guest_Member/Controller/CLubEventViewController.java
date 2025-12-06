package mid.gulshan_club.Guest_Member.Controller;

import com.sun.javafx.collections.ElementObservableListDecorator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import mid.gulshan_club.Guest_Member.Model.CLubEventView;
import mid.gulshan_club.HelloApplication;

import java.io.IOException;
import java.time.LocalDate;

public class CLubEventViewController {

    @FXML
    private TableColumn<?, ?> timeColumn;

    @FXML
    private TextField eventNameTextfield;

    @FXML
    private TableColumn<?, ?> locationColumn;

    @FXML
    private TableView<?> ClubEventTableview;

    @FXML
    private TableColumn<?, ?> evetNameColumn;

    @FXML
    private TextField timeTextField;

    @FXML
    private TableColumn<?, ?> dateColumn;

    @FXML
    private ComboBox<String> locationCombobox;

    @FXML
    private DatePicker dateDatepicker;

    @FXML
    public void initialize() {
        /*
         * This method is automatically called by JavaFX
         * after the FXML file is loaded.
         * Use it to prepare UI components.
         */

        // Populate location combo box with available event venues
        locationCombobox.getItems().addAll(
                "Main Hall",
                "Banquet Hall",
                "Conference Room",
                "Garden Area",
                "Rooftop"
        );

        // You can also initialize TableView data or
        // add listeners here if needed later
    }


    @FXML
    public void refreshButton(ActionEvent actionEvent) {
        // Clear existing items from the table
        ClubEventTableview.getItems().clear();

        // Reload events (sample/static data for now)
        ElementObservableListDecorator events = null;
        events.add(new CLubEventView(
                "Music Night",
                LocalDate.now(),
                "7:00 PM",
                "Main Hall"
        ));

        events.add(new CLubEventView(
                "Family Brunch",
                LocalDate.now().plusDays(2),
                "11:00 AM",
                "Banquet Hall"
        ));
    }

    @FXML
    public void requestToAttendButton(ActionEvent actionEvent) {// Get the selected event from the table
        CLubEventView selectedEvent =
                (CLubEventView) ClubEventTableview.getSelectionModel().getSelectedItem();

        // If no event is selected, show error
        if (selectedEvent == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("No Event Selected");
            alert.setHeaderText(null);
            alert.setContentText("Please select an event from the table first.");
            alert.showAndWait();
            return;
        }

        // Show confirmation of request
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Request Submitted");
        alert.setHeaderText("Event Attendance Requested");
        alert.setContentText(
                "You have successfully requested to attend:\n\n" +
                        "Event: " + selectedEvent.getEventName() + "\n" +
                        "Date: " + selectedEvent.getEventDate() + "\n" +
                        "Time: " + selectedEvent.getEventTime() + "\n" +
                        "Location: " + selectedEvent.getLocation()
        );
        alert.showAndWait();
    }

    @FXML
    public void backToDashboardbutton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Guest Member/ClubEvents-View.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Guest Member Dashboard");
        stage.setScene(scene);
        stage.show();
    }
}
