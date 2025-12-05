package mid.gulshan_club.Guest_Member.Controller;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CLubEventViewController
{
    @javafx.fxml.FXML
    private TableColumn timeColumn;
    @javafx.fxml.FXML
    private TextField eventNameTextfield;
    @javafx.fxml.FXML
    private TableColumn locationColumn;
    @javafx.fxml.FXML
    private TableView ClubEventTableview;
    @javafx.fxml.FXML
    private TableColumn evetNameColumn;
    @javafx.fxml.FXML
    private TextField timeTextField;
    @javafx.fxml.FXML
    private TableColumn dateColumn;
    @javafx.fxml.FXML
    private ComboBox locationCombobox;
    @javafx.fxml.FXML
    private DatePicker dateDatepicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void refreshButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void requestToAttendButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDashboardbutton(ActionEvent actionEvent) {
    }
}