package Pac;

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EventHandler extends Application{
    private boolean upPressed = false;
    private boolean downPressed = false;
    private boolean leftPressed = false;
    private boolean rightPressed = false;
    private double rotate = 0;
    private int score = 0;
    private static int pauseAction = 1;
    private static int settingAction = 1;
    private boolean SceneChecking = false;
    
    @Override
    public void start(Stage arg0) throws Exception {
        Stage stage = new Stage();

        Group root = new Group();

        //Scene
        Scene scene = new Scene(root);

        Image player = new Image(getClass().getResourceAsStream("/Pac/Images/Pac_Man_Favicon.png"));
        ImageView circle = new ImageView(player);
        circle.setRotate(rotate);
        circle.setFitWidth(50);
        circle.setFitHeight(50);
        circle.setPreserveRatio(true);

        double CircleRadius = ((circle.getFitWidth()+circle.getFitHeight())/2) - 3;
        //Spawning at diff locations

        int x_axis = (int)(Math.random()*(1000 - CircleRadius + 1) + CircleRadius);
        int y_axis = (int)(Math.random()*(1000 - CircleRadius + 1) + CircleRadius);
        circle.setTranslateX(x_axis);
        circle.setTranslateY(y_axis);
        // circle.setFill(Color.GRAY);

        Text ScoreCard = new Text("Score = "+ score);
        ScoreCard.setFont(new Font("Minecrafter Alt",50));
        ScoreCard.setTranslateY(50);
        ScoreCard.setTranslateX(5);
        ScoreCard.setFill(Color.BLACK);

        Rectangle rec = new Rectangle();
        rec.setTranslateX(0);
        rec.setTranslateY(0);
        rec.setWidth(ScoreCard.getLayoutBounds().getWidth() + 10);
        rec.setHeight(ScoreCard.getLayoutBounds().getHeight() + 10);
        rec.setArcWidth(50);
        rec.setArcHeight(50);
        rec.setFill(Color.GRAY);

        Image settingsIcon = new Image(getClass().getResourceAsStream("/Pac/Images/setting.png"));
        ImageView icon = new ImageView(settingsIcon);
        // icon.setFitHeight(30);
        // icon.setFitWidth(30);
        // icon.setPreserveRatio(true);

        Image pause = new Image(getClass().getResourceAsStream("/Pac/Images/PauseButton.png"));
        ImageView pauseView = new ImageView(pause);
        pauseView.setFitHeight(40);
        pauseView.setFitWidth(35);
        // pauseView.setPreserveRatio(true);

        Button pauseButton = new Button();
        pauseButton.setGraphic(pauseView);
        pauseButton.setTranslateY(7);
        pauseButton.setFocusTraversable(false);
        pauseButton.setBackground(Background.fill(Color.YELLOW));

        Button settings = new Button();
        settings.setGraphic(icon);
        settings.setTranslateY(3);
        settings.setFocusTraversable(false);
        settings.setBackground(Background.fill(Color.YELLOW));

        Rectangle topRect = new Rectangle();
        topRect.setHeight(62);
        topRect.setFill(Color.YELLOW);

        //root
        root.getChildren().add(topRect);
        root.getChildren().add(rec);
        root.getChildren().add(circle);
        root.getChildren().add(ScoreCard);
        root.getChildren().add(settings);
        root.getChildren().add(pauseButton);
        

        //Stage
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.setTitle("Pac Man");
        stage.getIcons().add(player);
        stage.show(); 
        stage.setMinWidth(scene.getWidth());
        stage.setMinHeight(scene.getHeight());

        topRect.setWidth(stage.getWidth());
        settings.setTranslateX(stage.getWidth()-75);
        pauseButton.setTranslateX(stage.getWidth()-130);

        ArrayList<Circle> axisOfBait = Maze.generatingMaze(stage,root,scene,rec.getHeight(),CircleRadius);

        //Button Actions
        scene.setOnKeyPressed(e ->{
            switch(e.getCode()){
                case W -> {
                    upPressed = true;
                    circle.setScaleX(1);
                    rotate = -90;
                    circle.setRotate(rotate);
                }
                case S -> {
                    downPressed = true;
                    circle.setScaleX(1);
                    rotate = 90;
                    circle.setRotate(rotate);
                }
                case D -> {
                    rightPressed = true;
                    circle.setScaleX(1);
                    rotate = 0;
                    circle.setRotate(rotate);
                }
                case A -> {
                    leftPressed = true;
                    // rotate = 180;
                    rotate = 0;
                    circle.setRotate(rotate);
                    circle.setScaleX(-1);
                    // circle.setRotate(rotate);
                }
                case ESCAPE -> {
                    stage.setX(0);
                    stage.setY(0);
                    Menu.ShowMenu();
                }
                case F11 -> {
                    stage.setFullScreen(true);
                }

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

        settings.setOnAction(e ->{
            stage.setFullScreen(false);
            stage.setX(0);
            stage.setY(0);
            if(settingAction == 1){
                settingAction++;
                gameSettings.settingPopup();
            }
        });
        pauseButton.setOnAction(e ->{
            stage.setFullScreen(false);
            stage.setX(0);
            stage.setY(0);
            if(pauseAction == 1){
                pauseAction++;
                Menu.ShowMenu();
            }
        });

        AnimationTimer gameLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {
                double x = circle.getTranslateX();
                double y = circle.getTranslateY();
                double move = 10;

                if(SceneChecking == true){
                    upPressed = false;
                    downPressed = false;
                    rightPressed = false;
                    leftPressed = false;
                }
                
            
                if (upPressed) 
                    y -= move;
                if (downPressed) 
                    y += move;
                if (leftPressed) 
                    x -= move;
                if (rightPressed) 
                    x += move;
                
                // Boundary checking
                double radius = CircleRadius;
                double Swidth = stage.getWidth();
                double Sheight = stage.getHeight();

                x = Math.max(0, Math.min(x, Swidth - radius));
                y = Math.max(radius+13, Math.min(y, Sheight - radius));

                circle.setTranslateX(x);
                circle.setTranslateY(y);

                // Euclian Distance Formula for Distance between two points = √[(x₂ - x₁)² + (y₂ - y₁)²]
                for(int i = axisOfBait.size() - 1; i >= 0; i--) {
                    double distance = Math.sqrt(Math.pow(circle.getTranslateX() - axisOfBait.get(i).getTranslateX(), 2) + 
                                                Math.pow(circle.getTranslateY() - axisOfBait.get(i).getTranslateY(), 2));
                        //if the distance bw bait and the player is less than the sum of their radii so remove the bait
                        if(distance < CircleRadius + axisOfBait.get(i).getRadius()) {
                        root.getChildren().remove(axisOfBait.get(i));
                        axisOfBait.remove(i);
                        score+=2;
                        ScoreCard.setText("Score = "+score);
                        rec.setWidth(ScoreCard.getLayoutBounds().getWidth() + 10);
                        rec.setHeight(ScoreCard.getLayoutBounds().getHeight() + 10);
                    }
                }
                if(Menu.isCloseGame()){
                stage.close();
            }
            }
        };
        gameLoop.start();
        root.setFocusTraversable(true);
        root.requestFocus();
    }
    public void deriveScene(Scene scene){
        if(scene != null){
            SceneChecking = true;
        }else{
            SceneChecking = false;
        }
    }
    public static void setPauseAction(int PauseAction) {
        pauseAction = PauseAction;
    }
    public static void setSettingAction(int settingAction) {
        EventHandler.settingAction = settingAction;
    }
}
