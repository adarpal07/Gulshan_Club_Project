package mid.gulshan_club.HR_Manager.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import mid.gulshan_club.AppendableObjectOutputStream;
import mid.gulshan_club.HR_Manager.Model.BudgetProposal;
import mid.gulshan_club.HR_Manager.Model.LeavePolicyUpdate;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class LeavePolicyUpdateController
{
    @javafx.fxml.FXML
    private ComboBox<String> eligibilityComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> leaveTypeComboBox;
    @javafx.fxml.FXML
    private TextArea currentLeavePolicyTextArea;
    @javafx.fxml.FXML
    private TextArea proposedLeavepolicyTextArea;
    @javafx.fxml.FXML
    private DatePicker effectiveDateDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
        leaveTypeComboBox.getItems().addAll("Annual Leave","Sick Leave","Maternity Leave");
        eligibilityComboBox.getItems().addAll("Only Permanent Employee","All Employee","Only Female Employee");
    }

    ArrayList<LeavePolicyUpdate> leavePolicyList = new ArrayList<LeavePolicyUpdate>();

    @javafx.fxml.FXML
    public void sendLeavePolicyUpdateRequestButtonOnAction(ActionEvent actionEvent) {
        ObjectOutputStream oos = null;
        try{
            File objectFile = new File("LeavePolicyUpdateObjects.bin");
            FileOutputStream fosObject = null;
            if (objectFile.exists()){
                fosObject = new FileOutputStream(objectFile,true);
                oos = new AppendableObjectOutputStream(fosObject);
            }
            else{
                fosObject = new FileOutputStream(objectFile);
                oos = new ObjectOutputStream(fosObject);
            }


            for (LeavePolicyUpdate i : leavePolicyList){
                oos.writeObject(i);
            }
            oos.close();
            leavePolicyList.clear();
        }
        catch (Exception e){

        }
    }

    @javafx.fxml.FXML
    public void createLeavePolicyUpdateButtonOnAction(ActionEvent actionEvent) {

        if ("Maternity Leave".equals(leaveTypeComboBox.getValue())) {

            if (!"Only Female Employee".equals(eligibilityComboBox.getValue())) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setContentText("Only Female Employees are eligible for maternity leave.");
                a.showAndWait();
            }

        }

        LeavePolicyUpdate leavePolicy = new LeavePolicyUpdate(
                leaveTypeComboBox.getValue(),
                currentLeavePolicyTextArea.getText(),
                proposedLeavepolicyTextArea.getText(),
                eligibilityComboBox.getValue(),
                effectiveDateDatePicker.getValue()
        );
        leavePolicyList.add(leavePolicy);

        currentLeavePolicyTextArea.clear();
        proposedLeavepolicyTextArea.clear();

    }
}