package Pac;

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class practice extends Application{
    private boolean upPressed = false;
    private boolean downPressed = false;
    private boolean leftPressed = false;
    private boolean rightPressed = false;
    @Override
    public void start(Stage arg0) throws Exception {
        Stage stage = new Stage();

        Group root = new Group();

        //Scene
        Scene scene = new Scene(root);
        
        Circle circle = new Circle();
        circle.setRadius(20);
        //Spawning at diff locations
        int x_axis = (int)(Math.random()*(1000 - circle.getRadius() + 1) + circle.getRadius());
        int y_axis = (int)(Math.random()*(1000 - circle.getRadius() + 1) + circle.getRadius());
        circle.setTranslateX(x_axis);
        circle.setTranslateY(y_axis);
        circle.setFill(Color.GRAY);

        //root
        root.getChildren().add(circle);
        // root.getChildren().add(text);

        //Stage
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();

        ArrayList<Circle> axisOfBait = Maze.generatingMaze(stage,root,scene);

        //Button Actions
        scene.setOnKeyPressed(e ->{
            switch(e.getCode()){
                case W -> upPressed = true;
                case S -> downPressed = true;
                case D -> rightPressed = true;
                case A -> leftPressed = true;

                default -> System.out.println();
            }
        });

        scene.setOnKeyReleased(e ->{
            switch(e.getCode()){
            case W -> upPressed = false;
            case S -> downPressed = false;
            case D -> rightPressed = false;
            case A -> leftPressed = false;

            default -> System.out.println();
            }
        });

        AnimationTimer gameLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {
                double x = circle.getTranslateX();
                double y = circle.getTranslateY();
                double move = 10;
            
                if (upPressed) 
                    y -= move;
                if (downPressed) 
                    y += move;
                if (leftPressed) 
                    x -= move;
                if (rightPressed) 
                    x += move;
                
                // Boundary checking
                double radius = circle.getRadius();
                double Swidth = stage.getWidth();
                double Sheight = stage.getHeight();

                x = Math.max(radius, Math.min(x, Swidth - radius));
                y = Math.max(radius, Math.min(y, Sheight - radius));

                circle.setTranslateX(x);
                circle.setTranslateY(y);

                // 
                for(int i = axisOfBait.size() - 1; i >= 0; i--) {
                    double distance = Math.sqrt(Math.pow(circle.getTranslateX() - axisOfBait.get(i).getTranslateX(), 2) + 
                                                Math.pow(circle.getTranslateY() - axisOfBait.get(i).getTranslateY(), 2));
                    if(distance < circle.getRadius() + axisOfBait.get(i).getRadius()) {
                        root.getChildren().remove(axisOfBait.get(i));
                        axisOfBait.remove(i);
                    }
                }
            }
        };
        gameLoop.start();
        root.setFocusTraversable(true);
        root.requestFocus();

    }
}
