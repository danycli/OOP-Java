package JavaFX.Styling;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Prob {
    public static void rotateIt(Line line) {

    // choose pivot point
    double pivotX = 300;
    double pivotY = 200;

    // create rotate transform with pivot
    Rotate rotate = new Rotate(0, pivotX, pivotY);

    // attach transform to line
    line.getTransforms().add(rotate);

    // animate the ANGLE of the transform
    RotateTransition rotation = new RotateTransition();
    rotation.setDuration(Duration.seconds(60));
    rotation.setFromAngle(0);
    rotation.setToAngle(360);
    rotation.setCycleCount(Animation.INDEFINITE);
    rotation.setInterpolator(Interpolator.LINEAR);

    // IMPORTANT: animate the transform, not the line
    rotation.setNode(line); // still needed
    rotate.angleProperty().bind(rotation.currentTimeProperty().divide(rotation.getDuration().toMillis()).multiply(360));

    rotation.play();
}
}