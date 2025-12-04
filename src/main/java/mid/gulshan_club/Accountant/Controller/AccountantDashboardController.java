package mid.gulshan_club.Accountant.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;
import java.io.IOException;

public class AccountantDashboardController
{
    @javafx.fxml.FXML
    private Label outputLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void orderApprovalButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("approvalPurchaseOrder.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void billingInformationButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void monthlyFinancialReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewPaymentRecordButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void pendingPaymentsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void recordEventPaymentButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void memberOrEventFinancialReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void recordMembershipFeeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void signOutButton(ActionEvent actionEvent) {
    }
}