package mid.gulshan_club.Accountant.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mid.gulshan_club.Accountant.Model.PendingPayments;
import mid.gulshan_club.Accountant.Model.RecordMembershipFee;
import mid.gulshan_club.HelloApplication;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class PendingPaymentController
{
    @javafx.fxml.FXML
    private TableView<RecordMembershipFee> pendingPaymentTableView;
    @javafx.fxml.FXML
    private TableColumn<RecordMembershipFee, String> memberColumn;
    @javafx.fxml.FXML
    private TableColumn<RecordMembershipFee, String> statusColumn;
    @javafx.fxml.FXML
    private TableColumn<RecordMembershipFee, Integer> amountColumn;
    @javafx.fxml.FXML
    private TableColumn<RecordMembershipFee, Integer> idColumn;
    @javafx.fxml.FXML
    private TableColumn<RecordMembershipFee, String> monthColumn;
    @javafx.fxml.FXML
    private TableColumn<RecordMembershipFee, LocalDate> recordDateColumn;

    @javafx.fxml.FXML
    public void initialize() {
        memberColumn.setCellValueFactory(new PropertyValueFactory<>("memberName"));
        idColumn.setCellValueFactory(new PropertyValueFactory<>("memberId"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        monthColumn.setCellValueFactory(new PropertyValueFactory<>("month"));
        recordDateColumn.setCellValueFactory(new PropertyValueFactory<>("recordDate"));
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
    public void showPendingPaymentButton(ActionEvent actionEvent) throws IOException {
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

        pendingPaymentTableView.getItems().clear();
        pendingPaymentTableView.getItems().addAll(records);
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

