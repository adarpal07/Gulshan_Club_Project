package mid.gulshan_club.Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mid.gulshan_club.ClubManager.Model.CreateEvent;
import mid.gulshan_club.HelloApplication;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class UpcomingEventController
{
    @javafx.fxml.FXML
    private TableView<CreateEvent> eventDataTableView;
    @javafx.fxml.FXML
    private TableColumn<CreateEvent, String> nameColumn;
    @javafx.fxml.FXML
    private TableColumn<CreateEvent, Integer> amountColumn;
    @javafx.fxml.FXML
    private TableColumn<CreateEvent, LocalDate> dateColumn;
    @javafx.fxml.FXML
    private TableColumn<CreateEvent, String> venueColumn;
    @javafx.fxml.FXML
    private TableColumn<CreateEvent, Integer> seatColumn;

    @javafx.fxml.FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        venueColumn.setCellValueFactory(new PropertyValueFactory<>("venue"));
        seatColumn.setCellValueFactory(new PropertyValueFactory<>("seat"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("eventDate"));
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
    public void loadEventButton(ActionEvent actionEvent) throws IOException {
        File file = new File("EventInfo.bin");

        if (!file.exists()) {
            System.out.println("Bin file dose not exist");
            return;
        }

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<CreateEvent> records = new ArrayList<>();

        try {
            while (true) {
                CreateEvent r = (CreateEvent) ois.readObject();
                records.add(r);
            }
        } catch (EOFException eof) {
            errorAlert("End of file reached");
        } catch (ClassNotFoundException | IOException cnf) {
            errorAlert("Class not found!");
        }

        eventDataTableView.getItems().clear();
        eventDataTableView.getItems().addAll(records);
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

