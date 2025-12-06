package mid.gulshan_club.HR_Manager.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;

public class HRManagerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void employeeScheduleManagementButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HR Manager/EmployeeScheduleManagement.fxml"));
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
    public void registrationInfoButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HR Manager/UserRegistration.fxml"));
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
    public void createBudgetProposalButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HR Manager/BudgetProposal.fxml"));
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
    public void createMeetingButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HR Manager/MeetingDetails.fxml"));
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
    public void leavePolicyUpdateButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HR Manager/LeavePolicyUpdate.fxml"));
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
    public void PurchaseOrderButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HR Manager/PurchaseOrder.fxml"));
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
    public void checkAvailabilityButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HR Manager/EmployeeAvailability.fxml"));
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
    public void assignTaskButtonOnAction(ActionEvent actionEvent) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HR Manager/Task.fxml"));
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

