package mid.gulshan_club.Guest_Member.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CLubEventViewController {

    @FXML
    private TableColumn<?, ?> timeColumn;

    @FXML
    private TextField eventNameTextfield;

    @FXML
    private TableColumn<?, ?> locationColumn;

    @FXML
    private TableView<?> ClubEventTableview;

    @FXML
    private TableColumn<?, ?> evetNameColumn;

    @FXML
    private TextField timeTextField;

    @FXML
    private TableColumn<?, ?> dateColumn;

    @FXML
    private ComboBox<String> locationCombobox;

    @FXML
    private DatePicker dateDatepicker;

    @FXML
    public void initialize() {
        // TODO: initialize table columns, combo box, etc.
        // Example: Hall A, Hall B, Hall B
        // locationCombobox.getItems().addAll("Hall A", "Hall B", "Hall B");
    }

    @FXML
    public void refreshButton(ActionEvent actionEvent) {
        // TODO: reload events into ClubEventTableview
    }

    @FXML
    public void requestToAttendButton(ActionEvent actionEvent) {
        // TODO: handle request to attend selected event
    }

    @FXML
    public void backToDashboardbutton(ActionEvent actionEvent) {
        // TODO: navigate back to dashboard scene
    }
}
