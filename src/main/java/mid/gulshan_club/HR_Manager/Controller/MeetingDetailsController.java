package mid.gulshan_club.HR_Manager.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import mid.gulshan_club.AppendableObjectOutputStream;
import mid.gulshan_club.HR_Manager.Model.MeetingDetails;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MeetingDetailsController
{
    @javafx.fxml.FXML
    private TextArea meetingVenueTextArea;
    @javafx.fxml.FXML
    private TextField meetingParticipantsTextField;
    @javafx.fxml.FXML
    private ComboBox<String> meetingCategoryComboBox;
    @javafx.fxml.FXML
    private TextField meetingAgendaTextField;
    @javafx.fxml.FXML
    private TextField meetingTitleTextField;
    @javafx.fxml.FXML
    private DatePicker meetingDateDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
        meetingCategoryComboBox.getItems().addAll("Executive","Administrative","Finance & Budget");
    }

    ArrayList<MeetingDetails> meetingList = new ArrayList<MeetingDetails>();

    @javafx.fxml.FXML
    public void postMeetingDetailsButtonOnAction(ActionEvent actionEvent) {

        MeetingDetails m = new MeetingDetails(
                meetingTitleTextField.getText(),
                meetingCategoryComboBox.getValue(),
                meetingAgendaTextField.getText(),
                meetingParticipantsTextField.getText(),
                meetingVenueTextArea.getText(),
                meetingDateDatePicker.getValue()
        );
        meetingList.add(m);
        meetingTitleTextField.clear();
        meetingAgendaTextField.clear();
        meetingParticipantsTextField.clear();
        meetingVenueTextArea.clear();


        ObjectOutputStream oos = null;
        try{
            File objectFile = new File("MeetingDetailsObjects.bin");
            FileOutputStream fosObject = null;
            if (objectFile.exists()){
                fosObject = new FileOutputStream(objectFile,true);
                oos = new AppendableObjectOutputStream(fosObject);
            }
            else{
                fosObject = new FileOutputStream(objectFile);
                oos = new ObjectOutputStream(fosObject);
            }

            for (MeetingDetails i : meetingList){
                oos.writeObject(i);
            }
            oos.close();
        }
        catch (Exception e){

        }



    }
}