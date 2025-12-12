package GUI.Match;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Logics extends Application{
    @Override
    public void start(Stage stage){
        Group root = new Group();
        Scene scene = new Scene(root,Color.BISQUE);
        
        Image favicon = new Image("favicon3.png");
        stage.getIcons().add(favicon);
        stage.setScene(scene);
        stage.setTitle("Score Board");
        stage.show();
    }
}   
