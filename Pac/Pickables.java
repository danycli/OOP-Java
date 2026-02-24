package Pac;

import java.util.ArrayList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Pickables{
    
    public ArrayList<ImageView> generatingMaze(Stage stage,Group root, Scene scene,double base, double radius){
        ArrayList<ImageView> bait = new ArrayList<>();
        
        Image cherry = new Image(getClass().getResourceAsStream("/Pac/Images/cherry.png"));
        Image diamond = new Image(getClass().getResourceAsStream("/Pac/Images/diamond.png"));

        ArrayList<ImageView> addingCherries = addingItemsToScreen(50, cherry, stage, root, scene, base, radius);
        int n = (int)(Math.random()*6);
        ArrayList<ImageView> addingDiamonds = addingItemsToScreen(n, diamond, stage, root, scene, base, radius);

        for(int i = 0; i < addingCherries.size()+addingDiamonds.size(); i++){
            if(i < addingDiamonds.size()){
                bait.add(addingDiamonds.get(i));
                bait.add(addingCherries.get(i));
            }else if(i > addingDiamonds.size() && i < addingCherries.size()){
                bait.add(addingCherries.get(i));
            }
        }

        // ImageView cir;
        // for(int i = 0; i < 50; i ++){
        //     double x_axis = 0;
        //     double y_axis = 0;
        //     cir = new ImageView(cherry);
        //     // cir.setRadius(5);
        //     // cir.setFill(Color.RED);
            
        //     x_axis = (Math.random()*(stage.getWidth()));
        //     y_axis = (Math.random()*(stage.getHeight()));

        //     cir.setTranslateX(x_axis);
        //     cir.setTranslateY(y_axis);

        //     double x = cir.getTranslateX();
        //     double y = cir.getTranslateY();

        //     double Swidth = stage.getWidth();
        //     double Sheight = stage.getHeight();

        //     x = Math.max(radius, Math.min(x, Swidth - radius));
        //     y = Math.max(radius+base, Math.min(y, Sheight - radius));


        //     cir.setTranslateX(x);
        //     cir.setTranslateY(y);

        //     root.getChildren().add(cir);

        //     bait.add(cir);
        // }
        return bait;
    }
    private ArrayList<ImageView> addingItemsToScreen(int numOfItem, Image item,Stage stage,Group root, Scene scene,double base, double radius){
        ArrayList<ImageView> items = new ArrayList<>();
        ImageView cir;
        for(int i = 0; i < numOfItem; i ++){
            double x_axis = 0;
            double y_axis = 0;
            cir = new ImageView(item);
            // cir.setRadius(5);
            // cir.setFill(Color.RED);
            
            x_axis = (Math.random()*(stage.getWidth()));
            y_axis = (Math.random()*(stage.getHeight()));

            cir.setTranslateX(x_axis);
            cir.setTranslateY(y_axis);

            double x = cir.getTranslateX();
            double y = cir.getTranslateY();

            double Swidth = stage.getWidth();
            double Sheight = stage.getHeight();

            x = Math.max(radius, Math.min(x, Swidth - radius));
            y = Math.max(radius+base, Math.min(y, Sheight - radius));


            cir.setTranslateX(x);
            cir.setTranslateY(y);

            root.getChildren().add(cir);

            items.add(cir);
        }
        return items;
    }
}
