package mid.gulshan_club.ClubManager.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class MembershipManageController
{
    @javafx.fxml.FXML
    private BorderPane MemberInfoBorderPane;
    @javafx.fxml.FXML
    private TableView MemberInfoTableView;
    @javafx.fxml.FXML
    private TableColumn MemberNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn PermanentLocationTableColumn;
    @javafx.fxml.FXML
    private TableColumn MemberIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn ContactNoTableColumn;
    @javafx.fxml.FXML
    private TextField memberIdTextField;
    @javafx.fxml.FXML
    private TextField memberContactNoTextField;
    @javafx.fxml.FXML
    private TextField memberPermanentLocationTextField;
    @javafx.fxml.FXML
    private TextField memberNameTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AddNewMemberButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BacktoDashBoardButtonOnAction(ActionEvent actionEvent) {
    }
}