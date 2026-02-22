package Pac;

import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Maze extends practice{
    
    public static ArrayList<Circle> generatingMaze(Stage stage,Group root, Scene scene){
        ArrayList<Circle> bait = new ArrayList<>();
        Circle cir ;

        for(int i = 0; i < 100; i ++){
            int x_axis = 0;
            int y_axis = 0;
            cir = new Circle();
            cir.setRadius(5);
            cir.setFill(Color.RED);
            
            x_axis = (int)(Math.random()*(stage.getWidth()));
            y_axis = (int)(Math.random()*(stage.getHeight()));
            cir.setTranslateX(x_axis);
            cir.setTranslateY(y_axis);

            root.getChildren().add(cir);

            bait.add(cir);
        }
        return bait;
    }
}
