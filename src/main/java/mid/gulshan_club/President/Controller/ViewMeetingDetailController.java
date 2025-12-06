package mid.gulshan_club.President.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import mid.gulshan_club.HR_Manager.Model.MeetingDetails;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ViewMeetingDetailController
{
    @javafx.fxml.FXML
    private Label meetingDetailViewLabel;

    @javafx.fxml.FXML
    public void initialize() {
        ObjectInputStream ois = null;

        try{
            FileInputStream fis = new FileInputStream("MeetingDetailsObjects.bin");
            ois = new ObjectInputStream(fis);

            MeetingDetails m = null;
            while(true){
                m = (MeetingDetails) ois.readObject();
                meetingDetailViewLabel.setText(m.toString());
            }

        }
        catch (Exception e) {
            try{
                ois.close();
            }
            catch (Exception e1){

            }

        }

    }

    @javafx.fxml.FXML
    public void confirmMeetingButtonOnAction(ActionEvent actionEvent) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setHeaderText("Confirmed.");
        a.showAndWait();
    }
}