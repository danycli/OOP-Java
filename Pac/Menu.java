package Pac;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Menu {
    private static boolean closeGame = false;
    private static boolean checkSetting = false;

    public static void ShowMenu(){
        EventHandler der = new EventHandler();
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

        Button exiButton = new Button("Quit Game");
        exiButton.setTranslateY(110);
        exiButton.setBorder(Border.EMPTY);
        exiButton.setFocusTraversable(false);
        exiButton.setTextFill(Color.BLACK);
        exiButton.setFont(new Font("Minecrafter Alt",30));
        exiButton.setBackground(Background.fill(Color.RED));


        if(!checkSetting){
            resume.setOnAction(e ->{
            stage2.close();
            EventHandler.setPauseAction(1);
        });
        settings.setOnAction(e ->{
            gameSettings.settingPopup();
        });
        exiButton.setOnAction(e ->{
            stage2.close();
            closeGame = true;
        });
        }

        root.getChildren().add(resume);
        root.getChildren().add(settings);
        root.getChildren().add(exiButton);

        stage2.setScene(scene2);
        stage2.setHeight(600);
        stage2.setWidth(500);
        stage2.setResizable(false);
        stage2.setAlwaysOnTop(true);

        scene2.setOnKeyPressed(e ->{
            if(e.getCode() == KeyCode.ESCAPE){
                stage2.close();
            }
        });
        der.deriveScene(scene2);
        stage2.initStyle(StageStyle.UNDECORATED);
        stage2.show();
    }
    public static boolean isCloseGame() {
        return closeGame;
    }
    public static void getScene(Scene scene){
        if(scene != null){
            checkSetting = true;
        }else{
            checkSetting = false;
        }
    }
}
