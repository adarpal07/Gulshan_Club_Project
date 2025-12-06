package mid.gulshan_club;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController
{
    @javafx.fxml.FXML
    private TextField loginIdTextField;
    @javafx.fxml.FXML
    private TextField loginPasswordTextfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loginButtonOnAction(ActionEvent actionEvent) {
        if(loginIdTextField.getText().isEmpty()){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setHeaderText("Enter Id");
            a.showAndWait();
        }
        if(loginPasswordTextfield.getText().isEmpty()){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setHeaderText("Enter Password");
            a.showAndWait();
        }
        if(!loginIdTextField.getText().matches("\\d+")){
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setHeaderText("Enter Valid Id");
            a.showAndWait();
        }
        if(loginIdTextField.getText().equals("1")){
            if (loginPasswordTextfield.getText().equals("president")){
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President/presidentDashboard.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Hello!");
                    stage2.setScene(scene);
                    stage2.show();
                }
                catch(Exception e){

                }

            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();
            }
        }
        if(loginIdTextField.getText().equals("2")){
            if (loginPasswordTextfield.getText().equals("hrmanager")){
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HR Manager/HRManagerDashboard.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Hello!");
                    stage2.setScene(scene);
                    stage2.show();
                }
                catch(Exception e){

                }

            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();
            }

        }
        if(loginIdTextField.getText().equals("3")){
            if (loginPasswordTextfield.getText().equals("accountant")){
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Accountant/accountantDashboard-view.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Hello!");
                    stage2.setScene(scene);
                    stage2.show();
                }
                catch(Exception e){

                }
            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();
            }

        }
        if(loginIdTextField.getText().equals("4")){
            if (loginPasswordTextfield.getText().equals("clubmanager")){
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ClubManager/ClubManagerDashboardFxml.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Hello!");
                    stage2.setScene(scene);
                    stage2.show();
                }
                catch(Exception e){

                }

            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();
            }

        }
        if(loginIdTextField.getText().equals("5")){
            if (loginPasswordTextfield.getText().equals("chef")){
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Chef/ChefDashboardViewFxml.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Hello!");
                    stage2.setScene(scene);
                    stage2.show();
                }
                catch(Exception e){

                }

            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();
            }

        }
        if(loginIdTextField.getText().equals("6")){
            if (loginPasswordTextfield.getText().equals("supplier")){
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Supplier/supplierDashboard-View.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Hello!");
                    stage2.setScene(scene);
                    stage2.show();
                }
                catch(Exception e){

                }

            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();
            }

        }
        if(loginIdTextField.getText().equals("7")){
            if (loginPasswordTextfield.getText().equals("member")){
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Member/memberDashboard-view.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Hello!");
                    stage2.setScene(scene);
                    stage2.show();
                }
                catch(Exception e){

                }

            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();
            }

        }
        if(loginIdTextField.getText().equals("8")){
            if (loginPasswordTextfield.getText().equals("guestmember")){
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Guest Member/guestMemberDashBoard-view.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    Stage stage2 = new Stage();
                    stage2.setTitle("Hello!");
                    stage2.setScene(scene);
                    stage2.show();
                }
                catch(Exception e){

                }

            }
            else{
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setHeaderText("Incorrect Password");
                a.showAndWait();
            }

        }

    }
}