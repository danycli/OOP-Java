package Pac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Collection {
    public void collection(){
        Stage stage = new Stage();
        StackPane root = new StackPane();
        Scene scene = new Scene(root,600,800);
        ArrayList<String> images = new ArrayList<>();
        ArrayList<Button> equip = new ArrayList<>();
        ArrayList<String> stats = new ArrayList<>();
        images.clear();

        try{
            File file = new File("Pac/stats.txt");
            if(file.createNewFile()){
                BufferedWriter write = new BufferedWriter(new FileWriter(file));
                write.write("Score = 0");
                write.newLine();
                write.write("Total Diamond = 0");
                write.newLine();
                write.write("7Pac_Man_Favicon.png");
                write.close();
            }
            BufferedReader read = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = read.readLine()) != null) {
                stats.add(line);
            }
            read.close();
        }
        catch(IOException t){
            System.out.println("Something went wrong while getting the content of stats.txt");
        }

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

        Text col = new Text("Collection");
        col.setFont(new Font("Minecrafter Alt",60));
        col.setFill(Color.WHITE);
        col.setTranslateY(-(((images.size()/2) * 80) + 70));
        root.getChildren().add(col);

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
                man.setTranslateX(-50);
                man.setFitHeight(50);
                man.setFitWidth(50);
                root.getChildren().add(man);

                Button eqiuipButton = GameOver.MenuButtons("Equip",y_axis);
                eqiuipButton.setFont(new Font("Minecrafter Alt", 20));
                eqiuipButton.setTranslateX(50);
                root.getChildren().add(eqiuipButton);
                eqiuipButton.setId(""+images.get(i));

                equip.add(eqiuipButton);

        }

        int count = 0;
        while(images.size() > count){
            final int index = count;
            equip.get(index).setOnAction(e ->{

                int currentIndex = equip.indexOf(e.getSource());
                if(currentIndex == -1) return;

                try{
                    File file = new File("Pac/stats.txt");
                    stats.set(2, images.get(currentIndex));

                    BufferedWriter write = new BufferedWriter(new FileWriter(file));
                    for(String line : stats){
                        write.write(line);
                        write.newLine();
                    }
                    write.close();

                    PopUp pop = new PopUp();
                    pop.cautionPopUp("Equipped");
                }
                catch(IOException r){
                    System.out.println("Something Went Wrong while equiping new skin");
                }
            });
            count++;
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
