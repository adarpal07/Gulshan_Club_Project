package mid.gulshan_club.Accountant.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mid.gulshan_club.Accountant.Model.RecordEventPayment;
import mid.gulshan_club.HelloApplication;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class viewEventFinancialReportController
{
    @javafx.fxml.FXML
    private TableColumn<RecordEventPayment, Integer> timeColumn;
    @javafx.fxml.FXML
    private TableColumn<RecordEventPayment, String> monthColumn;
    @javafx.fxml.FXML
    private TableColumn<RecordEventPayment, String> nameColumn;
    @javafx.fxml.FXML
    private TableColumn<RecordEventPayment, String> recordDateColumn;
    @javafx.fxml.FXML
    private TableColumn<RecordEventPayment, Integer> amountColumn;
    @javafx.fxml.FXML
    private TableColumn<RecordEventPayment, String> venueColumn;
    @javafx.fxml.FXML
    private TableColumn<RecordEventPayment, LocalDate> eventDateColumn;
    @javafx.fxml.FXML
    private TableView<RecordEventPayment> eventTableView;

    @javafx.fxml.FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        venueColumn.setCellValueFactory(new PropertyValueFactory<>("venueName"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("eventTime"));
        monthColumn.setCellValueFactory(new PropertyValueFactory<>("month"));
        eventDateColumn.setCellValueFactory(new PropertyValueFactory<>("eventDate"));
        recordDateColumn.setCellValueFactory(new PropertyValueFactory<>("recordDate"));
    }

    @javafx.fxml.FXML
    public void loadDataButton(ActionEvent actionEvent) throws IOException {
        File file = new File("EventPaymentRecord.bin");

        if (!file.exists()) {
            System.out.println("Bin file dose not exist");
            return;
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<RecordEventPayment> records = new ArrayList<>();

        try {
            while (true) {
                RecordEventPayment r = (RecordEventPayment) ois.readObject();
                records.add(r);
            }
        } catch (EOFException eof) {
            errorAlert("End of file reached");
        } catch (ClassNotFoundException | IOException cnf) {
            errorAlert("Class not found!");
        }
        eventTableView.getItems().clear();
        eventTableView.getItems().addAll(records);

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException  {
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