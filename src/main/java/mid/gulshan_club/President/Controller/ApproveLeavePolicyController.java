package mid.gulshan_club.President.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import mid.gulshan_club.HR_Manager.Model.BudgetProposal;
import mid.gulshan_club.HR_Manager.Model.LeavePolicyUpdate;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class ApproveLeavePolicyController
{
    @javafx.fxml.FXML
    private TableColumn<LeavePolicyUpdate,String> leavetypeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LeavePolicyUpdate,String> proposedPolicyTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LeavePolicyUpdate, LocalDate> effectiveDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LeavePolicyUpdate,String> eligibilityTableColumn;
    @javafx.fxml.FXML
    private TableColumn<LeavePolicyUpdate,String> currentPolicyTableColumn;
    @javafx.fxml.FXML
    private TableView<LeavePolicyUpdate> leavePolicyUpdateTableView;

    @javafx.fxml.FXML
    public void initialize() {
        leavetypeTableColumn.setCellValueFactory(new PropertyValueFactory<LeavePolicyUpdate,String>("leaveType"));
        currentPolicyTableColumn.setCellValueFactory(new PropertyValueFactory<LeavePolicyUpdate,String>("currentPolicy"));
        proposedPolicyTableColumn.setCellValueFactory(new PropertyValueFactory<LeavePolicyUpdate,String>("proposedPolicy"));
        eligibilityTableColumn.setCellValueFactory(new PropertyValueFactory<LeavePolicyUpdate,String>("eligibility"));
        effectiveDateTableColumn.setCellValueFactory(new PropertyValueFactory<LeavePolicyUpdate,LocalDate>("effectiveDate"));

    }

    @javafx.fxml.FXML
    public void approveAndSaveButtonOnaction(ActionEvent actionEvent) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setHeaderText("Approved");
        a.showAndWait();
    }

    ArrayList<LeavePolicyUpdate> policyList = new ArrayList<LeavePolicyUpdate>();
    @javafx.fxml.FXML
    public void viewLeavePolicyRequestButtonOnAction(ActionEvent actionEvent) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("LeavePolicyUpdateObjects.bin"))) {
            try {
                LeavePolicyUpdate p = null;
                while(true) {
                    p = (LeavePolicyUpdate) ois.readObject();
                    policyList.add(p);
                }
            } catch (EOFException eof) {
                ois.close();
            }
        } catch (Exception e) {

        }
        if(policyList.isEmpty()){
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setHeaderText("No Leave Policy Update requested");
            a.showAndWait();
        }
        for(LeavePolicyUpdate i : policyList){
            leavePolicyUpdateTableView.getItems().addAll(i);
        }

    }


}
