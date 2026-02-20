package JavaFX.Styling;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Prob {
    public static void rotateIt(Line line, int secs, int angle) {
        // choose pivot point
        double pivotX = 255;
        double pivotY = 250;

        // create rotate transform with pivot
        Rotate rotate = new Rotate(0, pivotX, pivotY);

        // attach transform to line
        line.getTransforms().add(rotate);

        // animate the ANGLE of the transform using Timeline
        Timeline timeline = new Timeline(
            new KeyFrame(Duration.seconds(0), new KeyValue(rotate.angleProperty(), angle, Interpolator.LINEAR)),
            new KeyFrame(Duration.seconds(secs), new KeyValue(rotate.angleProperty(), 360+angle))
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }
}