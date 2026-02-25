package Pac;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Border;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class GameOver {
    public void ShowMenu(EventHandler current, int score, int numOfDiamonds){
        Stage stage2 = new Stage();
        StackPane root = new StackPane();
        Scene scene2 = new Scene(root, 400,500);
        scene2.setFill(Color.AZURE);

        Text gameOver = new Text("Game Over");
        gameOver.setFont(new Font("Minecrafter Alt",60));
        gameOver.setFill(Color.WHITE);
        gameOver.setTranslateY(-200);

        Button playAgain = MenuButtons("Play Again",-90);

        Button settings = MenuButtons("View Stats",10);

        Button exitButton = MenuButtons("Quit Game",110);


        playAgain.setOnAction(e ->{
            stage2.close();
            current.startGame();
        });
        settings.setOnAction(e ->{
            gameOverstats.gameOverStatsPopup(score, numOfDiamonds);
        });
        exitButton.setOnAction(e ->{
            stage2.close();
        });

        root.getChildren().add(playAgain);
        root.getChildren().add(settings);
        root.getChildren().add(exitButton);
        root.getChildren().add(gameOver);

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
    private static Button MenuButtons(String text, double y){
        Button b = new Button(text);
        b.setTranslateY(y);
        b.setBorder(Border.EMPTY);
        b.setFocusTraversable(false);
        b.setTextFill(Color.WHITE);
        b.setFont(new Font("Minecrafter Alt",30));
        b.setStyle("""
                -fx-background-color: #ffffff43;
                -fx-background-radius:20;
                """);

        return b;
    }
}
