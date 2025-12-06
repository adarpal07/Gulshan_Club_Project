package mid.gulshan_club.HR_Manager.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import mid.gulshan_club.AppendableObjectOutputStream;
import mid.gulshan_club.HR_Manager.Model.Task;
import mid.gulshan_club.HR_Manager.Model.UserRegistration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class TaskController
{
    @javafx.fxml.FXML
    private TextArea taskDescriptionTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> assignedToComboBox;
    @javafx.fxml.FXML
    private DatePicker dueDateDatePicker;
    @javafx.fxml.FXML
    private TextField taskTitleTextField;

    @javafx.fxml.FXML
    public void initialize() {
        assignedToComboBox.getItems().addAll("Chef","Club Manager","Accountant");
    }
    ArrayList<Task> taskList = new ArrayList<Task>();

    @javafx.fxml.FXML
    public void assignTaskButtonOnAction(ActionEvent actionEvent) {
        Task t = new Task(
                taskTitleTextField.getText(),
                taskDescriptionTextArea.getText(),
                assignedToComboBox.getValue(),
                dueDateDatePicker.getValue()
        );
        taskList.add(t);
        taskTitleTextField.clear();
        taskDescriptionTextArea.clear();

        ObjectOutputStream oos = null;

        try{
            File objectFile = new File("TaskObjects.bin");
            FileOutputStream fosObject = null;
            if (objectFile.exists()){
                fosObject = new FileOutputStream(objectFile,true);
                oos = new AppendableObjectOutputStream(fosObject);
            }
            else{
                fosObject = new FileOutputStream(objectFile);
                oos = new ObjectOutputStream(fosObject);
            }

            for (Task i : taskList){
                oos.writeObject(i);
            }
            oos.close();
            taskList.clear();
        }
        catch (Exception e){

        }

    }
}