package Pac;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class gameSettings {
    
    public static void settingPopup(){
        Stage stage = new Stage();
        StackPane root = new StackPane();
        Scene scene = new Scene(root,300,200);

        Button darkMode = new Button("Dark Mode");
        darkMode.setTextFill(Color.WHITE);
        darkMode.setBackground(Background.fill(Color.BLACK));
        darkMode.setTranslateY(-30);

        Button lightMode = new Button("Light Mode");
        lightMode.setTextFill(Color.BLACK);
        lightMode.setBackground(Background.fill(Color.WHITE));
        lightMode.setTranslateY(10);

        

        root.getChildren().add(lightMode);
        root.getChildren().add(darkMode);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        stage.show();
    }
}
