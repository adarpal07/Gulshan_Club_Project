package mid.gulshan_club.HR_Manager.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import mid.gulshan_club.AppendableObjectOutputStream;
import mid.gulshan_club.Employee;
import mid.gulshan_club.HR_Manager.Model.EmployeeScheduleManagement;
import mid.gulshan_club.HR_Manager.Model.UserRegistration;

import java.io.*;
import java.util.ArrayList;

public class EmployeeScheduleManagementController
{
    @javafx.fxml.FXML
    private ComboBox<Long> employeeIDComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> shiftTypeComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> shiftStartTimeComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> shiftEndTimeComboBox;

    ArrayList<Employee> employeeList = new ArrayList<Employee>();

    @javafx.fxml.FXML
    public void initialize() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("UserRegistrationObjects.bin"))) {
            try {
                while(true) {
                    UserRegistration u = (UserRegistration) ois.readObject();
                    employeeIDComboBox.getItems().add(u.getId());
                }
            } catch (EOFException eof) {
                ois.close();
            }
        } catch (Exception e) {

        }



        shiftTypeComboBox.getItems().addAll("Morning","Evening","Night");
        shiftStartTimeComboBox.getItems().addAll("08:00 AM","04:00 PM","12:00 AM");
        shiftEndTimeComboBox.getItems().addAll("04:00 PM","12:00 AM","08:00 AM");

    }
    ArrayList<EmployeeScheduleManagement> scheduleList = new ArrayList<EmployeeScheduleManagement>();

    @javafx.fxml.FXML
    public void saveScheduleButtonOnAction(ActionEvent actionEvent) {
        ObjectOutputStream oos = null;

        try{
            File objectFile = new File("EmployeeScheduleManagementObjects.bin");
            FileOutputStream fosObject = null;
            if (objectFile.exists()){
                fosObject = new FileOutputStream(objectFile,true);
                oos = new AppendableObjectOutputStream(fosObject);
            }
            else{
                fosObject = new FileOutputStream(objectFile);
                oos = new ObjectOutputStream(fosObject);
            }

            for (EmployeeScheduleManagement i : scheduleList){
                oos.writeObject(i);
            }
            oos.close();
        }
        catch (Exception e){

        }

    }

    @javafx.fxml.FXML
    public void createScheduleButtonOnAction(ActionEvent actionEvent) {
        EmployeeScheduleManagement s = new EmployeeScheduleManagement(
                employeeIDComboBox.getValue(),
                shiftStartTimeComboBox.getValue(),
                shiftEndTimeComboBox.getValue(),
                shiftTypeComboBox.getValue()
        );
        scheduleList.add(s);

    }
}