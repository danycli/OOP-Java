package Pac;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class gameOverstats {
    
    public static void gameOverStatsPopup(int score, int NumofDiamondsCollected){
        Stage stage = new Stage();
        StackPane root = new StackPane();
        Scene scene = new Scene(root,350,450);
        // scene.setFill(Color.AZURE);
        
        Text totalScore = new Text("Score = "+score);
        totalScore.setFont(new Font("Minecrafter Alt",40));
        totalScore.setFill(Color.WHITE);
        totalScore.setTranslateY(-50);

        Text numOfDiamonds = new Text("Diamonds = "+NumofDiamondsCollected);
        numOfDiamonds.setFont(new Font("Minecrafter Alt",40));
        numOfDiamonds.setFill(Color.WHITE);
        numOfDiamonds.setTranslateY(20);

        Button close = new Button("Close");
        close.setTranslateY(110);
        close.setTextFill(Color.WHITE);
        close.setFont(new Font("Minecrafter Alt",20));
        close.setBorder(Border.EMPTY);
        close.setFocusTraversable(false);
        close.setStyle("""
                -fx-background-color: #ffffff43;
                -fx-background-radius:20;
                """);

        close.setOnAction(e ->{
            stage.close();
        });

        root.getChildren().add(numOfDiamonds);
        root.getChildren().add(close);
        root.getChildren().add(totalScore);

        stage.setScene(scene);
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        stage.initStyle(StageStyle.UNDECORATED);
        // Menu.getScene(scene);
        EventHandler der = new EventHandler();
        der.deriveScene(scene);

        stage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);
        root.setStyle("""
            -fx-background-color: #16203f;
            -fx-background-radius: 30;
        """);

        stage.show();
    }
}
