package mid.gulshan_club.President.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;

public class PresidentDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewBudgetPropsalButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President/BudgetProposalView.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage2 = new Stage();
            stage2.setTitle("Hello!");
            stage2.setScene(scene);
            stage2.show();
        }
        catch(Exception e){

        }

    }

    @javafx.fxml.FXML
    public void viewMeetingDetailButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President/ViewMeetingDetail.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage2 = new Stage();
            stage2.setTitle("Hello!");
            stage2.setScene(scene);
            stage2.show();
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void updateMembershipPolicyButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President/MembershipPolicy.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage2 = new Stage();
            stage2.setTitle("Hello!");
            stage2.setScene(scene);
            stage2.show();
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void eventAnnouncementButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President/EventAnnouncement.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage2 = new Stage();
            stage2.setTitle("Hello!");
            stage2.setScene(scene);
            stage2.show();
        }
        catch(Exception e){

        }
    }


    @javafx.fxml.FXML
    public void viewLeavePolicyUpdateButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President/ViewLeavePolicy.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage2 = new Stage();
            stage2.setTitle("Hello!");
            stage2.setScene(scene);
            stage2.show();
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void viewMonthlyFinancialReportButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ViewMembershipPolicyButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President/ViewMembershipPolicy.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage2 = new Stage();
            stage2.setTitle("Hello!");
            stage2.setScene(scene);
            stage2.show();
        }
        catch(Exception e){

        }
    }

    @javafx.fxml.FXML
    public void viewMembershipStatisticsButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President/MembershipStatistics.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage2 = new Stage();
            stage2.setTitle("Hello!");
            stage2.setScene(scene);
            stage2.show();
        }
        catch(Exception e){

        }

    }
}
