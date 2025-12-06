package mid.gulshan_club.President.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import mid.gulshan_club.HR_Manager.Model.UserRegistration;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.time.LocalDate;

public class MembershipStatisticsController
{
    @javafx.fxml.FXML
    private TableColumn<UserRegistration,LocalDate> joiningYearTableColumn;
    @javafx.fxml.FXML
    private TableColumn<UserRegistration,String> addressTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> memberTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<UserRegistration,String> genderTableColumn;
    @javafx.fxml.FXML
    private TableView<UserRegistration> memberStatisticsTableView;

    @javafx.fxml.FXML
    public void initialize() {
        memberTypeComboBox.getItems().addAll("General Member","Guest Member");
        genderTableColumn.setCellValueFactory(new PropertyValueFactory<UserRegistration,String>("gender"));
        joiningYearTableColumn.setCellValueFactory(new PropertyValueFactory<UserRegistration,LocalDate>("dateOfJoining"));
        addressTableColumn.setCellValueFactory(new PropertyValueFactory<UserRegistration,String>("address"));

    }

    @javafx.fxml.FXML
    public void loadStatisticsButtonOnAction(ActionEvent actionEvent) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserRegistrationObjects.bin"))) {
            try {
                UserRegistration temp = null;
                while(true) {
                     temp = (UserRegistration) ois.readObject();
                     if(temp.getType().equals(memberTypeComboBox.getValue())){
                         memberStatisticsTableView.getItems().add(temp);
                     }
                }
            } catch (EOFException eof) {
               ois.close();
            }
        } catch (Exception e) {

        }

    }
}