package mid.gulshan_club.HR_Manager.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import mid.gulshan_club.AppendableObjectOutputStream;
import mid.gulshan_club.HR_Manager.Model.BudgetProposal;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BudgetProposalController
{
    @javafx.fxml.FXML
    private ComboBox<String> budgetCategoryComboBox;
    @javafx.fxml.FXML
    private TextArea budgetJustificationTextArea;
    @javafx.fxml.FXML
    private TextField budgetTitleTextField;
    @javafx.fxml.FXML
    private TextField budgetAmountTextField;
    @javafx.fxml.FXML
    private TextField budgetPeriodInDaysTextField;

    @javafx.fxml.FXML
    public void initialize() {
        budgetCategoryComboBox.getItems().addAll("Marketing & Promotion","Maintenance & Operations","Staff & Employee Welfare","Events & Activities");

    }
    ArrayList<BudgetProposal> budgetList = new ArrayList<BudgetProposal>();

    @javafx.fxml.FXML
    public void saveBudgetProposalButtonOnAction(ActionEvent actionEvent) {
        BudgetProposal b = new BudgetProposal(
                budgetTitleTextField.getText(),
                budgetJustificationTextArea.getText(),
                budgetCategoryComboBox.getValue(),
                Double.parseDouble(budgetAmountTextField.getText()),
                Double.parseDouble(budgetPeriodInDaysTextField.getText())
        );
        budgetList.add(b);
        budgetTitleTextField.clear();
        budgetAmountTextField.clear();
        budgetJustificationTextArea.clear();
        budgetPeriodInDaysTextField.clear();

        ObjectOutputStream oos = null;
        try{
            File objectFile = new File("BudgetObjects.bin");
            FileOutputStream fosObject = null;
            if (objectFile.exists()){
                fosObject = new FileOutputStream(objectFile,true);
                oos = new AppendableObjectOutputStream(fosObject);
            }
            else{
                fosObject = new FileOutputStream(objectFile);
                oos = new ObjectOutputStream(fosObject);
            }

            for (BudgetProposal i : budgetList){
                oos.writeObject(i);
            }
            oos.close();
            budgetList.clear();
        }
        catch (Exception e){


        }

    }

}