module mid.gulshan_club {
    requires javafx.controls;
    requires javafx.fxml;


    opens mid.gulshan_club to javafx.fxml;
    exports mid.gulshan_club;
    exports mid.gulshan_club.HR_Manager.Controller;
    opens mid.gulshan_club.HR_Manager.Controller to javafx.fxml;
    exports mid.gulshan_club.Member.Controller;
    opens mid.gulshan_club.Member.Controller to javafx.fxml;
}