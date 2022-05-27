package isep.jfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;

public class MainController {

    @FXML
    protected void onStartButtonClick() throws IOException {
        // Affiche la fenêtre principale du jeu
        FXMLLoader fxmlLoader = new FXMLLoader
                (MainApplication.class.getResource("game-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        MainApplication.stage.setScene(scene);
        MainApplication.stage.show();
    }
    @FXML
    protected void onStartButtonClick2() throws IOException {
        // Affiche la fenêtre principale du jeu
        FXMLLoader fxmlLoader = new FXMLLoader
                (MainApplication.class.getResource("number_view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        MainApplication.stage.setScene(scene);
        MainApplication.stage.show();
    }

}