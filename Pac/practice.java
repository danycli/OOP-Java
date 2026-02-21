package Pac;

import javafx.scene.input.KeyCode;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class practice extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        Stage stage = new Stage();

        Group root = new Group();

        //Scene
        Scene scene = new Scene(root);
        
        Circle circle = new Circle();
        circle.setRadius(40);
        int x_axis = (int)(Math.random()*(1000 - 40 + 1) + 40);
        int y_axis = (int)(Math.random()*(1000 - 40 + 1) + 40);
        System.out.println("x = "+x_axis+"\nY = "+y_axis);
        circle.setTranslateX(x_axis);
        circle.setTranslateY(y_axis);
        circle.setFill(Color.GRAY);

        //Button Actions
        scene.setOnKeyPressed(e ->{
            double x = circle.getTranslateX();
            double y = circle.getTranslateY();
            double move = 10;
            if(e.getCode() == KeyCode.RIGHT){
                x += move;
            }else if(e.getCode() == KeyCode.LEFT){
                x -= move;
            }else if(e.getCode() == KeyCode.UP){
                y -= move;
            }else if(e.getCode() == KeyCode.DOWN){
                y += move;
            }
            double radius = circle.getRadius();
            double Swidth = scene.getWidth();
            double Sheight = scene.getHeight();

            x = Math.max(radius, Math.min(x, Swidth - radius));
            y = Math.max(radius, Math.min(y, Sheight - radius));

            circle.setTranslateX(x);
            circle.setTranslateY(y);
        });

        //root
        root.getChildren().add(circle);
        // root.getChildren().add(text);

        //Stage
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();

        root.setFocusTraversable(true);
        root.requestFocus();

        //Setting X and Y after Pressing a key

    }
}
