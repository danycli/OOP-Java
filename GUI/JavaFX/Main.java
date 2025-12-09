package GUI.JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
public void start(Stage stage) {

    Label label = new Label("Hello DANY");
    TextField tf = new TextField();
    Button btn = new Button("Click Me");

    VBox layout = new VBox(10);
    layout.getChildren().addAll(label, tf, btn);

    Scene scene = new Scene(layout, 300, 200);

    stage.setTitle("Basic Layout Example");
    stage.setScene(scene);
    stage.show();
}

    public static void main(String [] args){
        launch(args);
    }
}
