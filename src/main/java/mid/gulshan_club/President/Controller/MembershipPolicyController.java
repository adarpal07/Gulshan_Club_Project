package mid.gulshan_club.President.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import mid.gulshan_club.AppendableObjectOutputStream;
import mid.gulshan_club.HR_Manager.Model.UserRegistration;
import mid.gulshan_club.President.Model.MembershipPolicy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MembershipPolicyController
{
    @javafx.fxml.FXML
    private ComboBox<String> policyCategoryComboBox;
    @javafx.fxml.FXML
    private TextField policyTitleTextField;
    @javafx.fxml.FXML
    private TextArea policyDescriptionTextArea;
    @javafx.fxml.FXML
    private DatePicker effectiveDateDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
        policyCategoryComboBox.getItems().addAll("Membership Eligibility","Membership Types","Member Conduct Rules");
    }

    ArrayList<MembershipPolicy> policyList = new ArrayList<MembershipPolicy>();

    @javafx.fxml.FXML
    public void savePolicyButtonOnAction(ActionEvent actionEvent) {
        ObjectOutputStream oos = null;

        try{
            File objectFile = new File("MembershipPolicyObjects.bin");
            FileOutputStream fosObject = null;
            if (objectFile.exists()){
                fosObject = new FileOutputStream(objectFile,true);
                oos = new AppendableObjectOutputStream(fosObject);
            }
            else{
                fosObject = new FileOutputStream(objectFile);
                oos = new ObjectOutputStream(fosObject);
            }

            for (MembershipPolicy i : policyList){
                oos.writeObject(i);
            }
            oos.close();
        }
        catch (Exception e){

        }

    }

    @javafx.fxml.FXML
    public void createPolicyButtonOnAction(ActionEvent actionEvent) {
        MembershipPolicy mp = new MembershipPolicy(
                policyTitleTextField.getText(),
                policyDescriptionTextArea.getText(),
                policyCategoryComboBox.getValue(),
                effectiveDateDatePicker.getValue()
        );
        policyList.add(mp);
        policyTitleTextField.clear();
        policyDescriptionTextArea.clear();
    }
}