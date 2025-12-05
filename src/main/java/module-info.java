module mid.gulshan_club {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    //requires mid.gulshan_club;
    requires javafx.graphics;

    requires javafx.base;
    //requires mid.gulshan_club;


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
    //exports mid.gulshan_club.ClubManager;
    opens mid.gulshan_club.ClubManager to javafx.fxml;
    //exports mid.gulshan_club.ClubManager;
    //opens mid.gulshan_club.ClubManager to javafx.fxml;
    exports mid.gulshan_club.ClubManager.Controller;
    opens mid.gulshan_club.ClubManager.Controller to javafx.fxml;
//<<<<<<< HEAD
    //exports mid.gulshan_club.Club_Manager;
    //opens mid.gulshan_club.Club_Manager to javafx.fxml;
    //exports mid.gulshan_club.Club_Manager.Controller;
    //opens mid.gulshan_club.Club_Manager.Controller to javafx.fxml;
//=======
    exports mid.gulshan_club.ClubManager.Model;
    opens mid.gulshan_club.ClubManager.Model to javafx.fxml;
//>>>>>>> 33d757138d85c3517e097818a3e1ae41e474ea58
}