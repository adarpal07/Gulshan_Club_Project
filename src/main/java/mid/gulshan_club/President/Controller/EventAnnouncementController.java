package mid.gulshan_club.President.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import mid.gulshan_club.AppendableObjectOutputStream;
import mid.gulshan_club.President.Model.Event;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EventAnnouncementController
{
    @javafx.fxml.FXML
    private TextField eventTimeTextField;
    @javafx.fxml.FXML
    private DatePicker eventDateDatePicker;
    @javafx.fxml.FXML
    private TextArea eventDescriptionTextArea;
    @javafx.fxml.FXML
    private TextArea eventVenueTextarea;
    @javafx.fxml.FXML
    private TextField eventTitleTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    ArrayList<Event> eventList = new ArrayList<Event>();

    @javafx.fxml.FXML
    public void saveAndAnnounceEventButtonOnAction(ActionEvent actionEvent) {

        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setHeaderText("Event on " + eventTitleTextField.getText() + " is announced.");
        a.showAndWait();

        ObjectOutputStream oos = null;
        try{
            File objectFile = new File("EventAnnouncementObjects.bin");
            FileOutputStream fosObject = null;

            if(objectFile.exists()){
                fosObject = new FileOutputStream (objectFile,true);
                oos = new AppendableObjectOutputStream(fosObject);
            }
            else{
                fosObject = new FileOutputStream (objectFile);
                oos = new ObjectOutputStream(fosObject);

            }
            for (Event i : eventList ){
                oos.writeObject(i);

            }
            oos.close();

        }
        catch (Exception e1) {

        }

    }

    @javafx.fxml.FXML
    public void createEventButtonOnAction(ActionEvent actionEvent) {
        Event e = new Event(
                eventTitleTextField.getText(),
                eventDescriptionTextArea.getText(),
                eventVenueTextarea.getText(),
                eventTimeTextField.getText(),
                eventDateDatePicker.getValue()
        );
        eventList.add(e);
        eventTitleTextField.clear();
                eventDescriptionTextArea.clear();
                eventTimeTextField.clear();
    }
}