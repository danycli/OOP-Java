package Pac;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class gameSettings {

    public static boolean setColor = false;

    public static void settingPopup(){
        Stage stage = new Stage();
        StackPane root = new StackPane();
        Scene scene = new Scene(root,300,200);
        scene.setFill(Color.AZURE);
        

        Button darkMode = MenuButtons("Dark Mode",-40,Color.WHITE);

        Button lightMode = MenuButtons("Light Mode",20,Color.BLACK);

        darkMode.setOnAction(e ->{
            EventHandler.setSettingAction(1);
            stage.close();
            Menu.setSetPop(1);
            setColor = true;
        });
        lightMode.setOnAction(e ->{
            EventHandler.setSettingAction(1);
            stage.close();
            Menu.setSetPop(1);
            setColor = false;
        });


        root.getChildren().add(lightMode);
        root.getChildren().add(darkMode);

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

    public static Color MainSceneColor(){
        if(setColor == true){
            return Color.BLACK;
        }else{
            return Color.WHITE;
        }
    }
    private static Button MenuButtons(String text, double y,Color color){
        Button b = new Button(text);
        b.setTranslateY(y);
        b.setBorder(Border.EMPTY);
        b.setFocusTraversable(false);
        b.setTextFill(color);
        b.setFont(new Font("Minecrafter Alt",20));
        b.setStyle("""
                -fx-background-color: #ffffff43;
                -fx-background-radius:15;
                """);

        return b;
    }
}
