package Pac;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Border;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Menu {
    private static boolean closeGame = false;
    private static int setPop = 1;

    public void ShowMenu(){
        EventHandler der = new EventHandler();
        Stage stage2 = new Stage();
        StackPane root = new StackPane();
        Scene scene2 = new Scene(root, 500,600);
        scene2.setFill(Color.AZURE);

        Button resume = MenuButtons("Resume",-90);

        Button settings = MenuButtons("Setting",10);

        Button exitButton = MenuButtons("Quit Game",110);


        resume.setOnAction(e ->{
        if(setPop == 1){
            stage2.close();
            EventHandler.setPauseAction(1);
        }
        });
        settings.setOnAction(e ->{
            if(setPop == 1){
                gameSettings set = new gameSettings();
                set.settingPopup();
            }
            setPop++;
        });
        exitButton.setOnAction(e ->{
            if(setPop == 1){
                stage2.close();
                closeGame = true;
            }
        });

        root.getChildren().add(resume);
        root.getChildren().add(settings);
        root.getChildren().add(exitButton);

        Image player = new Image(getClass().getResourceAsStream("/Pac/Images/PacSkins/7Pac_Man_Favicon.png"));

        stage2.getIcons().add(player);
        stage2.setTitle("Menu");
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

        stage2.initStyle(StageStyle.TRANSPARENT);
        scene2.setFill(Color.TRANSPARENT);
        root.setStyle("""
            -fx-background-color: #0B132B;
            -fx-background-radius: 20;
        """);

        stage2.show();
    }
    public static boolean isCloseGame() {
        return closeGame;
    }
    public static void setSetPop(int setPop) {
        Menu.setPop = setPop;
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
