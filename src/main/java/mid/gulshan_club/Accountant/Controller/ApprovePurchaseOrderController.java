package mid.gulshan_club.Accountant.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mid.gulshan_club.Accountant.Model.ApprovePurchaseOrder;
import mid.gulshan_club.HelloApplication;
import mid.gulshan_club.Supplier.Model.ConfirmOrderRequest;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ApprovePurchaseOrderController
{
    @javafx.fxml.FXML
    private TableColumn<ConfirmOrderRequest, Integer> reqNumColumn;
    @javafx.fxml.FXML
    private TableColumn<ConfirmOrderRequest, LocalDate> reqDateColumn;
    @javafx.fxml.FXML
    private TextField amountTextfield;
    @javafx.fxml.FXML
    private ComboBox<String> statusCombobox;
    @javafx.fxml.FXML
    private TableColumn<ConfirmOrderRequest, String> statusColumn;
    @javafx.fxml.FXML
    private TableView<ConfirmOrderRequest> reqTableView;
    @javafx.fxml.FXML
    private TableColumn<ConfirmOrderRequest, Integer> amountColumn;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private TextField reqNumTextfield;
    @javafx.fxml.FXML
    private DatePicker approvalDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
        reqNumColumn.setCellValueFactory(new PropertyValueFactory<>("reqNum"));
        reqDateColumn.setCellValueFactory(new PropertyValueFactory<>("requestDate"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        statusCombobox.getItems().addAll("Approved", "Rejected", "Pending");
    }

    @javafx.fxml.FXML
    public void loadDataButton(ActionEvent actionEvent) throws IOException {
        File file = new File("ConfirmOrderReq.bin");

        if (!file.exists()) {
            System.out.println("Bin file dose not exist");
            return;
        }

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<ConfirmOrderRequest> records = new ArrayList<>();

        try {
            while (true) {
                ConfirmOrderRequest r = (ConfirmOrderRequest) ois.readObject();
                records.add(r);
            }
        } catch (EOFException eof) {
            errorAlert("End of file reached");
        } catch (ClassNotFoundException | IOException cnf) {
            errorAlert("Class not found!");
        }

        reqTableView.getItems().clear();
        reqTableView.getItems().addAll(records);
    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {
        if (reqNumTextfield.getText().isBlank()) {
            errorAlert("Req Number cannot be blank!");
            return;
        }
        if (amountTextfield.getText().isBlank()) {
            errorAlert("Amount cannot be blank!");
            return;
        }
        if (statusCombobox.getValue() == null) {
            errorAlert("Please select a status!");
            return;
        }
        if (approvalDatePicker.getValue() == null) {
            errorAlert("Please select an approval date!");
            return;
        }
        ApprovePurchaseOrder apo = new ApprovePurchaseOrder(
                Integer.parseInt(reqNumTextfield.getText()),
                Integer.parseInt(amountTextfield.getText()),
                statusCombobox.getValue(),
                approvalDatePicker.getValue()
        );
        try {
            File file = new File("ApprovedOrderReq.bin");
            FileOutputStream fos;
            ObjectOutputStream oos;

            if (file.exists()) {
                fos = new FileOutputStream(file, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(apo);
            oos.close();
            informationAlert("Approval saved successfully!");
            // clear inputs
            reqNumTextfield.clear();
            amountTextfield.clear();
            statusCombobox.setValue(null);
            approvalDatePicker.setValue(null);
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