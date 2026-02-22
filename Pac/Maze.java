package Pac;

import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Maze extends EventHandler{
    
    public static ArrayList<Circle> generatingMaze(Stage stage,Group root, Scene scene,double base, double radius){
        ArrayList<Circle> bait = new ArrayList<>();
        Circle cir ;

        for(int i = 0; i < 100; i ++){
            double x_axis = 0;
            double y_axis = 0;
            cir = new Circle();
            cir.setRadius(5);
            cir.setFill(Color.RED);
            
            x_axis = (Math.random()*(stage.getWidth()));
            y_axis = (Math.random()*(stage.getHeight()));

            cir.setTranslateX(x_axis);
            cir.setTranslateY(y_axis);

            double x = cir.getTranslateX();
            double y = cir.getTranslateY();

            double Swidth = stage.getWidth();
            double Sheight = stage.getHeight();

            x = Math.max(radius, Math.min(x, Swidth - radius));
            y = Math.max(radius+base, Math.min(y, Sheight - radius));


            cir.setTranslateX(x);
            cir.setTranslateY(y);

            root.getChildren().add(cir);

            bait.add(cir);
        }
        return bait;
    }
}
