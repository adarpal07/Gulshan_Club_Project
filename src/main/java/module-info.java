open module mid.gulshan_club {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    //requires mid.gulshan_club;
    requires javafx.graphics;

    requires javafx.base;
    requires mid.gulshan_club;
    // requires mid.gulshan_club;
    //requires mid.gulshan_club;
    //requires mid.gulshan_club;
    //requires mid.gulshan_club;
    //requires mid.gulshan_club;
    //requires mid.gulshan_club;
    //requires mid.gulshan_club;
    //requires mid.gulshan_club;
    //requires mid.gulshan_club;
    //requires mid.gulshan_club;
    //requires mid.gulshan_club;
    //requires mid.gulshan_club;
    //requires mid.gulshan_club;


    //opens mid.gulshan_club to javafx.fxml;
    exports mid.gulshan_club;
    exports mid.gulshan_club.HR_Manager.Model;
    exports mid.gulshan_club.HR_Manager.Controller;
    exports mid.gulshan_club.President.Controller;
<<<<<<< HEAD
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
    exports mid.gulshan_club.Chef.Controller;
    opens mid.gulshan_club.Chef.Controller to javafx.fxml;
//>>>>>>> 33d757138d85c3517e097818a3e1ae41e474ea58
}
=======
}
>>>>>>> 1620a3a49c7b28e3890a16c89d49c328a85b7749
