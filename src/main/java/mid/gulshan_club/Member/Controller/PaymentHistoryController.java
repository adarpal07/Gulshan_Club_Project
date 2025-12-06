package mid.gulshan_club.Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mid.gulshan_club.HelloApplication;
import mid.gulshan_club.Member.Model.SubscriptionBillPayment;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class PaymentHistoryController
{
    @javafx.fxml.FXML
    private TableColumn<SubscriptionBillPayment, String> monthColumn;
    @javafx.fxml.FXML
    private TableColumn<SubscriptionBillPayment, String> nameColumn;
    @javafx.fxml.FXML
    private TableColumn<SubscriptionBillPayment, Integer> amountColumn;
    @javafx.fxml.FXML
    private TableColumn<SubscriptionBillPayment, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private TableView<SubscriptionBillPayment> paymentHistoryTableView;
    @javafx.fxml.FXML
    private TableColumn<SubscriptionBillPayment, Integer> idColumn;
    @javafx.fxml.FXML
    private TableColumn<SubscriptionBillPayment, String> methodColumn;

    @javafx.fxml.FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("memberName"));
        idColumn.setCellValueFactory(new PropertyValueFactory<>("memberId"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("paymentDate"));
        monthColumn.setCellValueFactory(new PropertyValueFactory<>("paymentMonth"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        methodColumn.setCellValueFactory(new PropertyValueFactory<>("paymentMethod"));
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

    @javafx.fxml.FXML
    public void viewHistoryButton(ActionEvent actionEvent) throws IOException {
        File file = new File("PaySubscriptionBill.bin");

        if (!file.exists()) {
            System.out.println("Bin file dose not exist");
            return;
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<SubscriptionBillPayment> records = new ArrayList<>();

        try {
            while (true) {
                SubscriptionBillPayment r = (SubscriptionBillPayment) ois.readObject();
                records.add(r);
            }
        } catch (EOFException eof) {
            informationAlert("Click Ok to Load Data");
        } catch (ClassNotFoundException | IOException cnf) {
            errorAlert("Class not found!");
        }
        paymentHistoryTableView.getItems().clear();
        paymentHistoryTableView.getItems().addAll(records);
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

