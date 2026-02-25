package Pac;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PlayGame {
    // private int setPop = 1;

    public void playGame(EventHandler current){
        Stage stage2 = new Stage();
        StackPane root = new StackPane();
        Scene scene2 = new Scene(root, 400,500);
        scene2.setFill(Color.AZURE);

        Text PacMan = new Text("Pac Man");
        PacMan.setFont(new Font("Minecrafter Alt",60));
        PacMan.setFill(Color.WHITE);
        PacMan.setTranslateY(-200);

        Button play = GameOver.MenuButtons("Play",-90);

        Button settings = GameOver.MenuButtons("Settings",10);

        Button exitButton = GameOver.MenuButtons("Quit Game",110);


        play.setOnAction(e ->{
            stage2.close();
            current.startGame();
        });
        settings.setOnAction(e ->{
            gameSettings.settingPopup();
        });
        exitButton.setOnAction(e ->{
            stage2.close();
        });

        root.getChildren().add(play);
        root.getChildren().add(settings);
        root.getChildren().add(exitButton);
        root.getChildren().add(PacMan);

        Image player = new Image(getClass().getResourceAsStream("/Pac/Images/Pac_Man_Favicon.png"));

        stage2.setScene(scene2);
        stage2.setTitle("Game Over");
        stage2.getIcons().add(player);
        stage2.setHeight(600);
        stage2.setWidth(500);
        stage2.setResizable(false);
        stage2.setAlwaysOnTop(true);

        scene2.setOnKeyPressed(e ->{
            if(e.getCode() == KeyCode.ESCAPE){
                stage2.close();
            }
        });
        current.deriveScene(scene2);
        stage2.initStyle(StageStyle.UNDECORATED);

        stage2.initStyle(StageStyle.TRANSPARENT);
        scene2.setFill(Color.TRANSPARENT);
        root.setStyle("""
            -fx-background-color: #0B132B;
            -fx-background-radius: 20;
        """);

        stage2.show();
    }
}
