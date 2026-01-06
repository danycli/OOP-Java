package GUI.JavaFX;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label title = new Label("GPA Calculator");
        title.setFont(Font.font("Segoe UI", 26));
        title.setTextFill(Color.WHITE);

        GridPane grid = new GridPane();
        grid.setVgap(12);
        grid.setHgap(10);
        grid.setAlignment(Pos.CENTER);

        TextField quiz = field("Quiz (15)");
        TextField assignment = field("Assignment (10)");
        TextField midTheory = field("Mid Theory (25)");
        TextField finalTheory = field("Final Theory (50)");
        TextField midLab = field("Mid Lab (25)");
        TextField finalLab = field("Final Lab (50)");
        TextField theoryCredits = field("Theory Credits");
        TextField labCredits = field("Lab Credits");

        addRow(grid, 0, "Quiz Marks", quiz);
        addRow(grid, 1, "Assignment Marks", assignment);
        addRow(grid, 2, "Mid Theory Marks", midTheory);
        addRow(grid, 3, "Final Theory Marks", finalTheory);
        addRow(grid, 4, "Mid Lab Marks", midLab);
        addRow(grid, 5, "Final Lab Marks", finalLab);
        addRow(grid, 6, "Theory Credits", theoryCredits);
        addRow(grid, 7, "Lab Credits", labCredits);

        Button calcBtn = new Button("Calculate GPA");
        calcBtn.setStyle("""
                -fx-background-color: #00ADB5;
                -fx-text-fill: black;
                -fx-font-size: 15px;
                -fx-font-weight: bold;
                -fx-background-radius: 8;
                """);

        Label marksLabel = new Label("Total Marks: —");
        Label gpaLabel = new Label("GPA: —");
        marksLabel.setTextFill(Color.WHITE);
        gpaLabel.setTextFill(Color.WHITE);
        gpaLabel.setFont(Font.font(18));

        VBox resultBox = new VBox(6, marksLabel, gpaLabel);
        resultBox.setAlignment(Pos.CENTER);

        calcBtn.setOnAction(e -> {
            try {
                double totalMarks =
                        ((parse(quiz) + parse(assignment) + parse(midTheory) + parse(finalTheory))
                                * parse(theoryCredits)
                        + (parse(midLab) + parse(finalLab)) * parse(labCredits))
                        / (parse(theoryCredits) + parse(labCredits));

                double gpa = calculateGPA(totalMarks);

                marksLabel.setText(String.format("Total Marks: %.2f", totalMarks));
                gpaLabel.setText(String.format("GPA: %.2f", gpa));

            } catch (Exception ex) {
                alert("Please enter valid numeric values.");
            }
        });

        VBox card = new VBox(20, title, grid, calcBtn, resultBox);
        card.setPadding(new Insets(25));
        card.setAlignment(Pos.CENTER);
        card.setStyle("""
                -fx-background-color: #222831;
                -fx-background-radius: 15;
                """);

        card.setEffect(new DropShadow(20, Color.BLACK));

        StackPane root = new StackPane(card);
        root.setStyle("-fx-background-color: #0F2027;");

        stage.setTitle("GPA Calculator");
        stage.setScene(new Scene(root, 520, 620));
        stage.show();
    }

    private TextField field(String hint) {
        TextField tf = new TextField();
        tf.setPromptText(hint);
        tf.setPrefWidth(200);
        tf.setStyle("""
                -fx-background-radius: 6;
                -fx-font-size: 13px;
                """);
        return tf;
    }

    private void addRow(GridPane grid, int row, String label, TextField field) {
        Label l = new Label(label);
        l.setTextFill(Color.WHITE);
        grid.add(l, 0, row);
        grid.add(field, 1, row);
    }

    private double parse(TextField tf) {
        return Double.parseDouble(tf.getText());
    }

    private double calculateGPA(double marks) {
        if (marks >= 85) return 4.0;
        else if (marks >= 80) return 3.7;
        else if (marks >= 75) return 3.3;
        else if (marks >= 70) return 3.0;
        else if (marks >= 65) return 2.7;
        else if (marks >= 61) return 2.3;
        else if (marks >= 58) return 2.0;
        else if (marks >= 55) return 1.7;
        else if (marks >= 50) return 1.0;
        else return 0.0;
    }

    private void alert(String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR, msg, ButtonType.OK);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
