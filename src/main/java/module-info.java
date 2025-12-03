module mid.gulshan_club {
    requires javafx.controls;
    requires javafx.fxml;


    opens mid.gulshan_club to javafx.fxml;
    exports mid.gulshan_club;
    exports mid.gulshan_club.HR_Manager.Controller;
    opens mid.gulshan_club.HR_Manager.Controller to javafx.fxml;
    exports mid.gulshan_club.Member.Controller;
    opens mid.gulshan_club.Member.Controller to javafx.fxml;
    exports mid.gulshan_club.Accountant.Controller;
    opens mid.gulshan_club.Accountant.Controller to javafx.fxml;
    exports mid.gulshan_club.Supplier.Controller;
    opens mid.gulshan_club.Supplier.Controller to javafx.fxml;
    exports mid.gulshan_club.Guest_Member.Controller;
    opens mid.gulshan_club.Guest_Member.Controller to javafx.fxml;
    exports mid.gulshan_club.President.Controller;
    opens mid.gulshan_club.President.Controller to javafx.fxml;
}