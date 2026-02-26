package Pac;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Collection {
    public void collection(){
        Stage stage = new Stage();
        StackPane root = new StackPane();
        Scene scene = new Scene(root,500,700);
        ArrayList<String> images = new ArrayList<>();
        images.clear();

        try{
            File col = new File("Pac/CollectedItems.txt");
            col.createNewFile();
            BufferedReader read = new BufferedReader(new FileReader(col));
            String line = null;
            while((line = read.readLine()) != null){
                images.add(line);
            }
            read.close();
        }
        catch(IOException e){
            System.out.println("Something went Wrong");
        }

        int y_axis = 0;
        Button quit = GameOver.MenuButtons("Back",0);
        quit.setTranslateY(((images.size()/2) * 80) + 80);
        for(int i = 0; i < images.size(); i++){

            for(int j = 0 ; j < i; j++){
                if(i % 2 != 0){
                    y_axis += 80;
                }else{
                    y_axis -= 80;
                }
            }
                Image pac = new Image("/Pac/Images/PacSkins/"+images.get(i));
                ImageView man = new ImageView(pac);

                man.setTranslateY(y_axis);
                man.setFitHeight(50);
                man.setFitWidth(50);
                root.getChildren().add(man);
        }
        root.getChildren().add(quit);

        quit.setOnAction(e ->{
            stage.close();
        });

        Image player = new Image(getClass().getResourceAsStream("/Pac/Images/PacSkins/7Pac_Man_Favicon.png"));

        stage.setScene(scene);
        stage.setTitle("Store");
        stage.setAlwaysOnTop(true);
        stage.setResizable(false);
        stage.getIcons().add(player);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);
        root.setStyle("""
            -fx-background-color: #0B132B;
            -fx-background-radius: 20;
        """);
        stage.show();
    }
}
