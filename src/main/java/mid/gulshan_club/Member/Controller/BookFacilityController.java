package mid.gulshan_club.Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;

import java.io.IOException;

public class BookFacilityController
{
    @javafx.fxml.FXML
    private TextField seatTextfield;
    @javafx.fxml.FXML
    private TableColumn timeColumn;
    @javafx.fxml.FXML
    private ComboBox availabilityComboBox;
    @javafx.fxml.FXML
    private TableView facilitiesDataTableView;
    @javafx.fxml.FXML
    private TableColumn nameColumn;
    @javafx.fxml.FXML
    private TableColumn availabilityColumn;
    @javafx.fxml.FXML
    private TableColumn seatColumn;
    @javafx.fxml.FXML
    private TextField timeTextfield;
    @javafx.fxml.FXML
    private TextField nameTextfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loadDataButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void bookButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Member/memberDashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Member Dashboard");
        stage.setScene(scene);
        stage.show();
    }
}