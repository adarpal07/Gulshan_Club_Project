package mid.gulshan_club.President.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import mid.gulshan_club.HR_Manager.Model.BudgetProposal;
import mid.gulshan_club.HR_Manager.Model.UserRegistration;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class BudgetProposalViewController
{

    @javafx.fxml.FXML
    private TableColumn<BudgetProposal,String> titleTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> budgetCategoryComboBox;
    @javafx.fxml.FXML
    private TableView<BudgetProposal> budgetProposalTableView;
    @javafx.fxml.FXML
    private TableColumn<BudgetProposal,Double> amountTableColumn;
    @javafx.fxml.FXML
    private TableColumn<BudgetProposal,String> justificationTableColumn;

    ArrayList<BudgetProposal> budgetList = new ArrayList<BudgetProposal>();
    @javafx.fxml.FXML
    private TableColumn<BudgetProposal,String> categoryTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BudgetObjects.bin"))) {
            try {
                BudgetProposal b = null;
                while(true) {
                    b = (BudgetProposal) ois.readObject();
                    budgetCategoryComboBox.getItems().add(b.getCategory());
                    budgetList.add(b);
                }
            } catch (EOFException eof) {
                ois.close();
            }
        } catch (Exception e) {

        }
        titleTableColumn.setCellValueFactory(new PropertyValueFactory<BudgetProposal,String>("budgetTitle"));
        amountTableColumn.setCellValueFactory(new PropertyValueFactory<BudgetProposal,Double>("totalAmount"));
        justificationTableColumn.setCellValueFactory(new PropertyValueFactory<BudgetProposal,String>("justification"));
        categoryTableColumn.setCellValueFactory(new PropertyValueFactory<BudgetProposal,String>("category"));

    }

    @javafx.fxml.FXML
    public void approveBudgetProposalButtonOnAction(ActionEvent actionEvent) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setHeaderText("Budget Proposal for " +  budgetCategoryComboBox.getValue() + " is approved.");
        a.showAndWait();

    }

    @javafx.fxml.FXML
    public void loadBudgetProposalButtonOnAction(ActionEvent actionEvent) {



        for(BudgetProposal b : budgetList){
            budgetProposalTableView.getItems().addAll(b);
        }


    }
}
