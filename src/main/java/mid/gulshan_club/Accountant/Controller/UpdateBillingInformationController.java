package mid.gulshan_club.Accountant.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mid.gulshan_club.Accountant.Model.RecordMembershipFee;
import mid.gulshan_club.Accountant.Model.UpdateBillingInformation;
import mid.gulshan_club.HelloApplication;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class UpdateBillingInformationController
{
    @javafx.fxml.FXML
    private TableColumn<RecordMembershipFee, String> monthColumn;
    @javafx.fxml.FXML
    private TextField amountTextfield;
    @javafx.fxml.FXML
    private TableView<RecordMembershipFee> membershipFeeTableView;
    @javafx.fxml.FXML
    private TextField idTextfield;
    @javafx.fxml.FXML
    private TableColumn<RecordMembershipFee, Integer> amountColumn;
    @javafx.fxml.FXML
    private TextField nameTextfield;
    @javafx.fxml.FXML
    private TableColumn<RecordMembershipFee, String> nameColumn;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private TableColumn<RecordMembershipFee, String> statusColumn;
    @javafx.fxml.FXML
    private DatePicker updateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> monthComboBox;
    @javafx.fxml.FXML
    private TableColumn<RecordMembershipFee, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private TableColumn<RecordMembershipFee, Integer> idColumn;

    @javafx.fxml.FXML
    public void initialize() {
        statusComboBox.getItems().addAll("Paid", "Unpaid", "Pending");
        monthComboBox.getItems().addAll("January","February","March","April","May","June", "July","August","September","October","November","December");

        nameColumn.setCellValueFactory(new PropertyValueFactory<>("memberName"));
        idColumn.setCellValueFactory(new PropertyValueFactory<>("memberId"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        monthColumn.setCellValueFactory(new PropertyValueFactory<>("month"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("recordDate"));
    }

    @javafx.fxml.FXML
    public void loadDataButton(ActionEvent actionEvent) throws IOException {
        File file = new File("RecordMembershipFee.bin");

        if (!file.exists()) {
            System.out.println("Bin file dose not exist");
            return;
        }

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<RecordMembershipFee> records = new ArrayList<>();

        try {
            while (true) {
                RecordMembershipFee r = (RecordMembershipFee) ois.readObject();
                records.add(r);
            }
        } catch (EOFException eof) {
            errorAlert("End of file reached");
        } catch (ClassNotFoundException | IOException cnf) {
            errorAlert("Class not found!");
        }

        membershipFeeTableView.getItems().clear();
        membershipFeeTableView.getItems().addAll(records);
    }

    @javafx.fxml.FXML
    public void updateBillingInfoButton(ActionEvent actionEvent) {
        if (nameTextfield.getText().isBlank()) {
            errorAlert("Name of Member cannot be blank!");
            return;
        }
        if (idTextfield.getText().isBlank()) {
            errorAlert("Member ID cannot be blank!");
            return;
        }
        if (amountTextfield.getText().isBlank()) {
            errorAlert("Amount cannot be blank!");
            return;
        }
        if (statusComboBox.getValue() == null) {
            errorAlert("Please select a status!");
            return;
        }
        if (monthComboBox.getValue() == null) {
            errorAlert("Please select a month!");
            return;
        }
        if (updateDatePicker.getValue() == null) {
            errorAlert("Please select an update date!");
            return;
        }

        UpdateBillingInformation ubi = new UpdateBillingInformation(
                statusComboBox.getValue(),
                monthComboBox.getValue(),
                nameTextfield.getText(),
                Integer.parseInt(idTextfield.getText()),
                Integer.parseInt(amountTextfield.getText()),
                updateDatePicker.getValue()
        );

        try {
            File file = new File("UpdatedBillingInfo.bin");
            FileOutputStream fos;
            ObjectOutputStream oos;

            if (file.exists()) {
                fos = new FileOutputStream(file, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(ubi);
            oos.close();
            informationAlert("Billing information updated and saved!");

        } catch (Exception e) {
            errorAlert("Error saving data to file!");
        }

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