package Pac;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Menu {
    
    public static void ShowMenu(){
        Stage stage2 = new Stage();
        StackPane root = new StackPane();
        Scene scene2 = new Scene(root, 500,600);

        Button resume = new Button("Resume");
        resume.setTranslateY(-90);
        resume.setBorder(Border.EMPTY);
        resume.setFocusTraversable(false);
        resume.setTextFill(Color.BLACK);
        resume.setFont(new Font("Minecrafter Alt",30));
        resume.setBackground(Background.fill(Color.RED));

        Button settings = new Button("Setting");
        settings.setTranslateY(10);
        settings.setBorder(Border.EMPTY);
        settings.setFocusTraversable(false);
        settings.setTextFill(Color.BLACK);
        settings.setFont(new Font("Minecrafter Alt",30));
        settings.setBackground(Background.fill(Color.RED));

        Button exiButton = new Button("Setting");
        exiButton.setTranslateY(110);
        exiButton.setBorder(Border.EMPTY);
        exiButton.setFocusTraversable(false);
        exiButton.setTextFill(Color.BLACK);
        exiButton.setFont(new Font("Minecrafter Alt",30));
        exiButton.setBackground(Background.fill(Color.RED));

        root.getChildren().add(resume);
        root.getChildren().add(settings);
        root.getChildren().add(exiButton);
        
        stage2.setScene(scene2);
        stage2.setHeight(600);
        stage2.setWidth(500);
        stage2.setResizable(false);
        stage2.setAlwaysOnTop(true);
        stage2.show();
    }
}
