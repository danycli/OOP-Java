package GPACAL;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GPACalculatorFX extends Application {

    @Override
    public void start(Stage stage) {

        Label title = new Label("GPA Calculator");
        title.setStyle("-fx-font-size: 22px; -fx-text-fill: white;");

        // -------- Theory Fields --------
        TextField quizField = new TextField();        // out of 15
        TextField assignField = new TextField();      // out of 10
        TextField midTheoryField = new TextField();   // out of 25
        TextField finalTheoryField = new TextField(); // out of 50

        // -------- Lab Fields --------
        TextField labAssignField = new TextField();   // out of 25
        TextField midLabField = new TextField();      // out of 25
        TextField finalLabField = new TextField();    // out of 50

        // -------- Credits --------
        TextField theoryCreditsField = new TextField();
        TextField labCreditsField = new TextField();

        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setAlignment(Pos.CENTER);

        int r = 0;
        grid.add(label("Quiz (15)"), 0, r);           grid.add(quizField, 1, r++);
        grid.add(label("Assignment (10)"), 0, r);     grid.add(assignField, 1, r++);
        grid.add(label("Mid Theory (25)"), 0, r);     grid.add(midTheoryField, 1, r++);
        grid.add(label("Final Theory (50)"), 0, r);   grid.add(finalTheoryField, 1, r++);

        grid.add(label("Lab Assignment (25)"), 0, r); grid.add(labAssignField, 1, r++);
        grid.add(label("Mid Lab (25)"), 0, r);        grid.add(midLabField, 1, r++);
        grid.add(label("Final Lab (50)"), 0, r);      grid.add(finalLabField, 1, r++);

        grid.add(label("Theory Credits"), 0, r);      grid.add(theoryCreditsField, 1, r++);
        grid.add(label("Lab Credits"), 0, r);         grid.add(labCreditsField, 1, r++);

        Button calcBtn = new Button("Calculate GPA");
        calcBtn.setStyle("-fx-background-color: #00ADB5; -fx-font-weight: bold;");

        Label totalLabel = new Label("Total Marks: —");
        Label gpaLabel = new Label("GPA: —");
        totalLabel.setStyle("-fx-text-fill: white;");
        gpaLabel.setStyle("-fx-text-fill: white; -fx-font-size: 16px;");

        calcBtn.setOnAction(e -> {
            try {
                // ---- Parse inputs ----
                double quiz = Double.parseDouble(quizField.getText());
                double assignment = Double.parseDouble(assignField.getText());
                double midTheory = Double.parseDouble(midTheoryField.getText());
                double finalTheory = Double.parseDouble(finalTheoryField.getText());

                double labAssign = Double.parseDouble(labAssignField.getText());
                double midLab = Double.parseDouble(midLabField.getText());
                double finalLab = Double.parseDouble(finalLabField.getText());

                double theoryCredits = Double.parseDouble(theoryCreditsField.getText());
                double labCredits = Double.parseDouble(labCreditsField.getText());

                // ---- Totals ----
                double theoryTotal = quiz + assignment + midTheory + finalTheory; // out of 100
                double labTotal = labAssign + midLab + finalLab;                  // out of 100

                double totalMarks =
                        (theoryTotal * theoryCredits + labTotal * labCredits)
                        / (theoryCredits + labCredits);

                double gpa = calculateGPA(totalMarks);

                totalLabel.setText(String.format("Total Marks: %.2f", totalMarks));
                gpaLabel.setText(String.format("GPA: %.2f", gpa));

            } catch (Exception ex) {
                showError("Please enter valid numeric values.");
            }
        });

        VBox root = new VBox(20, title, grid, calcBtn, totalLabel, gpaLabel);
        root.setPadding(new Insets(25));
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #222831;");

        stage.setTitle("GPA Calculator");
        stage.setScene(new Scene(root, 420, 650));
        stage.show();
    }

    private Label label(String text) {
        Label l = new Label(text);
        l.setStyle("-fx-text-fill: white;");
        return l;
    }

    private double calculateGPA(double m) {
        if (m >= 85) return 4.0;
        else if (m >= 80) return 3.7;
        else if (m >= 75) return 3.3;
        else if (m >= 70) return 3.0;
        else if (m >= 65) return 2.7;
        else if (m >= 61) return 2.3;
        else if (m >= 58) return 2.0;
        else if (m >= 55) return 1.7;
        else if (m >= 50) return 1.0;
        else return 0.0;
    }

    private void showError(String msg) {
        Alert a = new Alert(Alert.AlertType.ERROR, msg, ButtonType.OK);
        a.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
