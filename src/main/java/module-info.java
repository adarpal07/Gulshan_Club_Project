module mid.gulshan_club {
    requires javafx.controls;
    requires javafx.fxml;


    opens mid.gulshan_club to javafx.fxml;
    exports mid.gulshan_club;
}