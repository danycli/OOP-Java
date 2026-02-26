package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MiainClass {
    public static void main(String[] args) {
        // String filePath = "FileHandling/Java.txt";
        // try{
        //     File file = new File(filePath);
        //     if(file.createNewFile()){
        //         System.out.println("File Created = "+ file.getName());
        //     }else{
        //         ArrayList<String> lines = new ArrayList<>();
        //         int score = 50;
        //         BufferedReader read = new BufferedReader(new FileReader(file));
        //         String line = null;
        //         int i = 0;
        //         while((line = read.readLine()) != null){
        //             if(i == 0 && line.startsWith("Score")){
        //                 String[] sp = line.split(" ");
        //                 int n = Integer.parseInt(sp[sp.length-1]);
        //                 if(score > n){
        //                     line = "Score = " + score;
        //                 }
        //             }
        //             lines.add(line);
        //             i++;
        //         }
        //         FileWriter write = new FileWriter(filePath);
        //         BufferedWriter Bwrite = new BufferedWriter(write);
        //         for(String l : lines){
        //             Bwrite.write(l);
        //             Bwrite.newLine();
        //         }
        //         Bwrite.close();
        //         read.close();
        //     }
        // }
        // catch(IOException e){
        //     System.out.println("Something went wrong");
        // }

        Path directory = Paths.get("Pac/Images/PacSkins");
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(directory)){
            for(Path file : stream){
            }
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
}
