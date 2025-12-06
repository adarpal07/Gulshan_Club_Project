package mid.gulshan_club.HR_Manager.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import mid.gulshan_club.HR_Manager.Model.EmployeeAvailability;
import mid.gulshan_club.HR_Manager.Model.EmployeeScheduleManagement;
import mid.gulshan_club.HR_Manager.Model.UserRegistration;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class EmployeeAvailabilityController
{
    @javafx.fxml.FXML
    private TableColumn<EmployeeAvailability,Long> idTableColumn;
    @javafx.fxml.FXML
    private TableColumn<EmployeeAvailability,String> nameTableColumn;
    @javafx.fxml.FXML
    private TableView<EmployeeAvailability> scheduleTableView;
    @javafx.fxml.FXML
    private TableColumn<EmployeeAvailability,String> endTimeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<EmployeeAvailability,Integer> phoneNoTableColumn;
    @javafx.fxml.FXML
    private ComboBox<Long> searchIdComboBox;
    @javafx.fxml.FXML
    private TableColumn<EmployeeAvailability,String> startTimeTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("EmployeeScheduleManagementObjects.bin"))) {
            try {
                while(true) {
                   EmployeeScheduleManagement s = (EmployeeScheduleManagement) ois.readObject();
                   searchIdComboBox.getItems().add(s.getEmployeeId());
                }
            } catch (EOFException eof) {
            }
        } catch (Exception e) {

        }
        idTableColumn.setCellValueFactory(new PropertyValueFactory<EmployeeAvailability,Long>("empId"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<EmployeeAvailability,String>("empName"));
        startTimeTableColumn.setCellValueFactory(new PropertyValueFactory<EmployeeAvailability,String>("startTime"));
        endTimeTableColumn.setCellValueFactory(new PropertyValueFactory<EmployeeAvailability,String>("endTime"));
        phoneNoTableColumn.setCellValueFactory(new PropertyValueFactory<EmployeeAvailability,Integer>("empPhoneNo"));

    }

    @javafx.fxml.FXML
    public void checkScheduleComboBox(ActionEvent actionEvent) {
        try{
            long searchId = searchIdComboBox.getValue();

            FileInputStream fis1 = new FileInputStream("EmployeeScheduleManagementObjects.bin");
            ObjectInputStream ois1 = new ObjectInputStream(fis1);

            FileInputStream fis2 = new FileInputStream("UserRegistrationObjects.bin");
            ObjectInputStream ois2 = new ObjectInputStream(fis2);

            UserRegistration tempEmp = null;
            EmployeeScheduleManagement tempSchedule = null;

            while(true){
                tempEmp =(UserRegistration) ois2.readObject();
                if(tempEmp.getId()==searchId){
                    try{
                        ois2.close();
                        while(true){
                            tempSchedule = (EmployeeScheduleManagement) ois1.readObject();
                            if(tempSchedule.getEmployeeId()==searchId){
                                scheduleTableView.getItems().add(
                                        new EmployeeAvailability(
                                                tempEmp.getId(),
                                                tempEmp.getName(),
                                                tempSchedule.getShiftStartTime(),
                                                tempSchedule.getShiftEndTime(),
                                                tempEmp.getPhoneNumber()
                                        )
                                );
                                ois1.close();
                                break;
                            }

                        }
                        break;

                    }
                    catch(Exception e){

                    }
                }

            }

        }
        catch(Exception e){

        }
    }
}