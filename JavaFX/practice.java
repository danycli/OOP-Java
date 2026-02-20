package JavaFX;

import java.time.LocalTime;

import JavaFX.Styling.Prob;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class practice extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Image icon = new Image("JavaFX/favicon5.png");
        Scene scene = new Scene(root,new Color(0, 1.0, 0, 0.5));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.setHeight(650);
        stage.setWidth(530);
        stage.setResizable(false);
        stage.setTitle("Practicing");
        // stage.setX(50);
        // stage.setY(90);
        // stage.setFullScreen(true);
        // stage.setFullScreenExitHint("Escape full screen by pressing T");
        // stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("T"));

        Text text = new Text(".");
        text.setX(240);
        text.setY(255);
        text.setFont(Font.font("Aptos",150));

        //Seconds
        Line seconds = new Line();
        seconds.setStartX(255);
        seconds.setStartY(250);
        seconds.setEndX(255);
        seconds.setEndY(50);
        seconds.setStroke(Color.RED);
        seconds.setStrokeWidth(2);   
        
        //minutes
        Line minutes = new Line();
        minutes.setStartX(255);
        minutes.setStartY(250);
        minutes.setEndX(255);
        minutes.setEndY(70);
        minutes.setStroke(Color.BLACK);
        minutes.setStrokeWidth(3);  

        //Hours
        Line hours = new Line();
        hours.setStartX(255);
        hours.setStartY(250);
        hours.setEndX(255);
        hours.setEndY(120);
        hours.setStroke(Color.BLACK);
        hours.setStrokeWidth(5);  

        Image image = new Image("JavaFX/Clock.png");
        ImageView imageView = new ImageView(image);

        imageView.setPreserveRatio(true);

        root.getChildren().add(imageView);
        root.getChildren().add(seconds);
        root.getChildren().add(minutes);
        root.getChildren().add(hours);
        root.getChildren().add(text);

        stage.show();

        LocalTime now = LocalTime.now();
        int Seconds = now.getSecond();
        int Minutes = now.getMinute();
        int Hours = now.getHour() % 12;

        long speed1 = 61;
        long speed2 = (speed1*3600)/60;
        long speed3 = (((speed1*3600)/60)*216000)/3600;
        
        Prob.rotateIt(seconds,(int)speed1, Seconds*6);//Rotating line
        Prob.rotateIt(minutes,(int)speed2,Minutes*6);
        Prob.rotateIt(hours,(int)speed3, Hours*30 + (Minutes / 2));
    }
    
}
