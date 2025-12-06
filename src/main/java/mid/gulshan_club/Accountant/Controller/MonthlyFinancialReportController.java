package mid.gulshan_club.Accountant.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import mid.gulshan_club.Accountant.Model.MonthlyFinancialReport;
import mid.gulshan_club.HelloApplication;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MonthlyFinancialReportController
{
    @javafx.fxml.FXML
    private ComboBox<String> monthComboBox;
    @javafx.fxml.FXML
    private TextField recorderTextfield;
    @javafx.fxml.FXML
    private TextField yearTextfield;
    @javafx.fxml.FXML
    private TextField costTextfield;
    @javafx.fxml.FXML
    private DatePicker recordDatePicker;
    @javafx.fxml.FXML
    private TextField profitTextfield;

    @javafx.fxml.FXML
    public void initialize() {
        monthComboBox.getItems().addAll("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Accountant/accountantDashboard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setTitle("Accountant Dashboard");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void generateButton(ActionEvent actionEvent) {
        if (monthComboBox.getValue() == null) {
            errorAlert("Please select a month!");
            return;
        }
        if (yearTextfield.getText().isBlank()) {
            errorAlert("Year cannot be blank!");
            return;
        }
        if (costTextfield.getText().isBlank()) {
            errorAlert("Total cost cannot be blank!");
            return;
        }
        if (profitTextfield.getText().isBlank()) {
            errorAlert("Total profit cannot be blank!");
            return;
        }
        if (recorderTextfield.getText().isBlank()) {
            errorAlert("Recorder name cannot be blank!");
            return;
        }
        if (recordDatePicker.getValue() == null) {
            errorAlert("Please select a record date!");
            return;
        }
        MonthlyFinancialReport mfr = new MonthlyFinancialReport(
                monthComboBox.getValue(),
                recorderTextfield.getText(),
                Integer.parseInt(yearTextfield.getText()),
                Integer.parseInt(profitTextfield.getText()),
                Integer.parseInt(costTextfield.getText()),
                recordDatePicker.getValue()
        );
        try {
            File file = new File("MonthlyFinancialReport.bin");
            FileOutputStream fos;
            ObjectOutputStream oos;

            if (file.exists()) {
                fos = new FileOutputStream(file, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(mfr);
            oos.close();
            informationAlert("Monthly financial report saved successfully!");

        } catch (Exception e) {
            errorAlert("Error saving data to file!");
        }
    }

    public void errorAlert(String s){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText(s);
        a.showAndWait();
    }
    public void informationAlert(String s){
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(s);
        a.showAndWait();
    }
}