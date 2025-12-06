package mid.gulshan_club.President.Controller;

import javafx.scene.control.Label;
import mid.gulshan_club.Accountant.Model.MonthlyFinancialReport;
import mid.gulshan_club.HR_Manager.Model.BudgetProposal;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ViewMonthlyFinancialReportController
{
    @javafx.fxml.FXML
    private Label monthyFinancialReportLabel;

    @javafx.fxml.FXML
    public void initialize() {
        ObjectInputStream ois = null;

        try{
            FileInputStream fis = new FileInputStream("MonthlyFinancialReportObjects.bin");
            ois = new ObjectInputStream(fis);

            MonthlyFinancialReport m = null;
            while(true){
                m = (MonthlyFinancialReport) ois.readObject();
                monthyFinancialReportLabel.setText(m.toString());
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

}
