package mid.gulshan_club;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
       //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("President/PresidentDashboard.fxml"));

        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Club Portal");
        stage.setScene(scene);
        stage.show();
    }
}




