package mid.gulshan_club.President.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import mid.gulshan_club.HR_Manager.Model.LeavePolicyUpdate;
import mid.gulshan_club.President.Model.MembershipPolicy;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.LocalDate;

public class ViewMembershipPolicy
{
    @javafx.fxml.FXML
    private TableColumn<MembershipPolicy,String> titleTableColumn;
    @javafx.fxml.FXML
    private TableColumn<MembershipPolicy, LocalDate> effectiveDateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<MembershipPolicy,String> descriptionTableColumn;
    @javafx.fxml.FXML
    private TableColumn<MembershipPolicy,String> categoryTableColumn;
    @javafx.fxml.FXML
    private TableView<MembershipPolicy> membershipPolicyTableView;

    @javafx.fxml.FXML
    public void initialize() {
        titleTableColumn.setCellValueFactory(new PropertyValueFactory<MembershipPolicy,String>("policyTitle"));
        descriptionTableColumn.setCellValueFactory(new PropertyValueFactory<MembershipPolicy,String>("description"));
        categoryTableColumn.setCellValueFactory(new PropertyValueFactory<MembershipPolicy,String>("category"));
        effectiveDateTableColumn.setCellValueFactory(new PropertyValueFactory<MembershipPolicy,LocalDate>("effectiveDate"));

    }

    @javafx.fxml.FXML
    public void ViewMembershipPolicyButtonOnAction(ActionEvent actionEvent) {
        ObjectInputStream ois = null;
        try{
            MembershipPolicy temp = null;
            FileInputStream fis = new FileInputStream("MembershipPolicyObjects.bin");
            ois = new ObjectInputStream(fis);

            while(true){
                temp = (MembershipPolicy) ois.readObject();
                membershipPolicyTableView.getItems().add(temp);
            }

        }
        catch(Exception e){

            try{
                ois.close();
            }
            catch(Exception e1){

            }

        }
    }
}