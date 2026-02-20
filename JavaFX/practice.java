package JavaFX;

import JavaFX.Styling.Prob;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
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
        // stage.setX(50);
        // stage.setY(90);
        // stage.setFullScreen(true);
        // stage.setFullScreenExitHint("Escape full screen by pressing T");
        // stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("T"));

        // Text text = new Text("This is gonna end today");

        Line seconds = new Line();
        seconds.setStartX(265);
        seconds.setStartY(250);
        seconds.setEndX(100);
        seconds.setEndY(250);
        seconds.setStroke(Color.RED);
        seconds.setStrokeWidth(2);         
        Image image = new Image("JavaFX/Clock.png");
        ImageView imageView = new ImageView(image);

        imageView.setPreserveRatio(true);

        // root.getChildren().add(text);
        root.getChildren().add(imageView);
        root.getChildren().add(seconds);
        stage.setTitle("Practicing");
        stage.show();
        Prob.rotateIt(seconds);//Rotating line
    }
    
}
