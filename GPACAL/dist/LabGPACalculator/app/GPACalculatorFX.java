package GPACAL;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GPACalculatorFX extends Application {

    // Text fields for input
    private TextField quizField, assignField, midTheoryField, finalTheoryField;
    private TextField labAssignField, midLabField, finalLabField;
    private TextField theoryCreditsField, labCreditsField;

    // Result labels
    private Label totalLabel, gpaLabel, gradeLabel;
    private Label theoryTotalLabel, labTotalLabel;

    @Override
    public void start(Stage stage) {

        // -------- Title --------
        Label title = new Label("GPA Calculator");
        title.setStyle("-fx-font-size: 28px; -fx-text-fill: #00ADB5; -fx-font-weight: bold;");

        Label subtitle = new Label("Enter your marks below");
        subtitle.setStyle("-fx-font-size: 14px; -fx-text-fill: #AAAAAA;");

        // -------- Theory Section Header --------
        Label theoryHeader = new Label("📚 Theory Component");
        theoryHeader.setStyle("-fx-font-size: 16px; -fx-text-fill: #00ADB5; -fx-font-weight: bold;");

        // -------- Theory Fields --------
        quizField = createTextField("0", 15);
        assignField = createTextField("0", 10);
        midTheoryField = createTextField("0", 25);
        finalTheoryField = createTextField("0", 50);

        // -------- Lab Section Header --------
        Label labHeader = new Label("🔬 Lab Component");
        labHeader.setStyle("-fx-font-size: 16px; -fx-text-fill: #00ADB5; -fx-font-weight: bold;");

        // -------- Lab Fields --------
        labAssignField = createTextField("0", 25);
        midLabField = createTextField("0", 25);
        finalLabField = createTextField("0", 50);

        // -------- Credits Section Header --------
        Label creditsHeader = new Label("📊 Credit Hours");
        creditsHeader.setStyle("-fx-font-size: 16px; -fx-text-fill: #00ADB5; -fx-font-weight: bold;");

        // -------- Credits --------
        theoryCreditsField = createTextField("3", 10);
        labCreditsField = createTextField("1", 10);

        // -------- Grid Layout --------
        GridPane theoryGrid = createStyledGrid();
        int r = 0;
        theoryGrid.add(createLabel("Quiz (max 15)"), 0, r);
        theoryGrid.add(quizField, 1, r++);
        theoryGrid.add(createLabel("Assignment (max 10)"), 0, r);
        theoryGrid.add(assignField, 1, r++);
        theoryGrid.add(createLabel("Mid Theory (max 25)"), 0, r);
        theoryGrid.add(midTheoryField, 1, r++);
        theoryGrid.add(createLabel("Final Theory (max 50)"), 0, r);
        theoryGrid.add(finalTheoryField, 1, r++);

        GridPane labGrid = createStyledGrid();
        r = 0;
        labGrid.add(createLabel("Lab Assignment (max 25)"), 0, r);
        labGrid.add(labAssignField, 1, r++);
        labGrid.add(createLabel("Mid Lab (max 25)"), 0, r);
        labGrid.add(midLabField, 1, r++);
        labGrid.add(createLabel("Final Lab (max 50)"), 0, r);
        labGrid.add(finalLabField, 1, r++);

        GridPane creditsGrid = createStyledGrid();
        r = 0;
        creditsGrid.add(createLabel("Theory Credits"), 0, r);
        creditsGrid.add(theoryCreditsField, 1, r++);
        creditsGrid.add(createLabel("Lab Credits"), 0, r);
        creditsGrid.add(labCreditsField, 1, r++);

        // -------- Buttons --------
        Button calcBtn = new Button("Calculate GPA");
        calcBtn.setStyle("-fx-background-color: #00ADB5; -fx-text-fill: white; " +
                "-fx-font-weight: bold; -fx-font-size: 14px; -fx-padding: 10 30; " +
                "-fx-background-radius: 20;");
        calcBtn.setEffect(new DropShadow(10, Color.rgb(0, 173, 181, 0.5)));

        Button resetBtn = new Button("Reset");
        resetBtn.setStyle("-fx-background-color: #393E46; -fx-text-fill: white; " +
                "-fx-font-weight: bold; -fx-font-size: 14px; -fx-padding: 10 30; " +
                "-fx-background-radius: 20;");

        HBox buttonBox = new HBox(15, calcBtn, resetBtn);
        buttonBox.setAlignment(Pos.CENTER);

        // -------- Result Labels --------
        theoryTotalLabel = new Label("Theory: —/100");
        theoryTotalLabel.setStyle("-fx-text-fill: #AAAAAA; -fx-font-size: 13px;");

        labTotalLabel = new Label("Lab: —/100");
        labTotalLabel.setStyle("-fx-text-fill: #AAAAAA; -fx-font-size: 13px;");

        totalLabel = new Label("Total Marks: —");
        totalLabel.setStyle("-fx-text-fill: white; -fx-font-size: 16px;");

        gpaLabel = new Label("GPA: —");
        gpaLabel.setStyle("-fx-text-fill: #00ADB5; -fx-font-size: 24px; -fx-font-weight: bold;");

        gradeLabel = new Label("");
        gradeLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        VBox resultBox = new VBox(8, theoryTotalLabel, labTotalLabel, totalLabel, gpaLabel, gradeLabel);
        resultBox.setAlignment(Pos.CENTER);
        resultBox.setPadding(new Insets(15));
        resultBox.setStyle("-fx-background-color: #2D333B; -fx-background-radius: 15;");

        // -------- Button Actions --------
        calcBtn.setOnAction(e -> calculateGPA());
        resetBtn.setOnAction(e -> resetFields());

        // Hover effects for buttons
        calcBtn.setOnMouseEntered(e -> calcBtn.setStyle("-fx-background-color: #00CED1; -fx-text-fill: white; " +
                "-fx-font-weight: bold; -fx-font-size: 14px; -fx-padding: 10 30; -fx-background-radius: 20;"));
        calcBtn.setOnMouseExited(e -> calcBtn.setStyle("-fx-background-color: #00ADB5; -fx-text-fill: white; " +
                "-fx-font-weight: bold; -fx-font-size: 14px; -fx-padding: 10 30; -fx-background-radius: 20;"));

        resetBtn.setOnMouseEntered(e -> resetBtn.setStyle("-fx-background-color: #4A5568; -fx-text-fill: white; " +
                "-fx-font-weight: bold; -fx-font-size: 14px; -fx-padding: 10 30; -fx-background-radius: 20;"));
        resetBtn.setOnMouseExited(e -> resetBtn.setStyle("-fx-background-color: #393E46; -fx-text-fill: white; " +
                "-fx-font-weight: bold; -fx-font-size: 14px; -fx-padding: 10 30; -fx-background-radius: 20;"));

        // -------- Main Layout --------
        VBox content = new VBox(12,
                title, subtitle,
                theoryHeader, theoryGrid,
                labHeader, labGrid,
                creditsHeader, creditsGrid,
                buttonBox,
                resultBox);
        content.setPadding(new Insets(25));
        content.setAlignment(Pos.CENTER);
        content.setStyle("-fx-background-color: linear-gradient(to bottom, #1a1a2e, #222831);");

        // Wrap in ScrollPane for smaller screens
        ScrollPane scrollPane = new ScrollPane(content);
        scrollPane.setFitToWidth(true);
        scrollPane.setStyle("-fx-background: #1a1a2e; -fx-background-color: #1a1a2e;");

        // -------- Scene & Stage --------
        Scene scene = new Scene(scrollPane, 450, 700);
        stage.setTitle("Lab GPA Calculator");

        // Set window icon
        try {
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/favicon3.png")));
        } catch (Exception e) {
            System.out.println("Could not load icon: " + e.getMessage());
        }

        stage.setScene(scene);
        stage.setMinHeight(500);
        stage.setMinWidth(400);
        stage.show();
    }

    private TextField createTextField(String defaultValue, int maxValue) {
        TextField tf = new TextField(defaultValue);
        tf.setPrefWidth(100);
        tf.setStyle("-fx-background-color: #393E46; -fx-text-fill: white; " +
                "-fx-background-radius: 8; -fx-padding: 8;");

        // Add tooltip
        tf.setTooltip(new Tooltip("Max: " + maxValue));

        // Focus styling
        tf.focusedProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal) {
                tf.setStyle("-fx-background-color: #4A5568; -fx-text-fill: white; " +
                        "-fx-background-radius: 8; -fx-padding: 8; -fx-border-color: #00ADB5; " +
                        "-fx-border-radius: 8;");
            } else {
                tf.setStyle("-fx-background-color: #393E46; -fx-text-fill: white; " +
                        "-fx-background-radius: 8; -fx-padding: 8;");
            }
        });

        return tf;
    }

    private Label createLabel(String text) {
        Label l = new Label(text);
        l.setStyle("-fx-text-fill: #EEEEEE; -fx-font-size: 13px;");
        return l;
    }

    private GridPane createStyledGrid() {
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(15);
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(10, 20, 10, 20));
        grid.setStyle("-fx-background-color: rgba(57, 62, 70, 0.3); -fx-background-radius: 10;");
        return grid;
    }

    private void calculateGPA() {
        try {
            // ---- Parse and validate inputs ----
            double quiz = parseAndValidate(quizField, 15, "Quiz");
            double assignment = parseAndValidate(assignField, 10, "Assignment");
            double midTheory = parseAndValidate(midTheoryField, 25, "Mid Theory");
            double finalTheory = parseAndValidate(finalTheoryField, 50, "Final Theory");

            double labAssign = parseAndValidate(labAssignField, 25, "Lab Assignment");
            double midLab = parseAndValidate(midLabField, 25, "Mid Lab");
            double finalLab = parseAndValidate(finalLabField, 50, "Final Lab");

            double theoryCredits = parseAndValidate(theoryCreditsField, 10, "Theory Credits");
            double labCredits = parseAndValidate(labCreditsField, 10, "Lab Credits");

            if (theoryCredits + labCredits == 0) {
                showError("Total credits cannot be zero!");
                return;
            }

            // ---- Calculate Totals ----
            double theoryTotal = quiz + assignment + midTheory + finalTheory;
            double labTotal = labAssign + midLab + finalLab;

            double weightedTotal = (theoryTotal * theoryCredits + labTotal * labCredits)
                    / (theoryCredits + labCredits);

            double gpa = getGPA(weightedTotal);
            String grade = getGradeLetter(weightedTotal);
            String gradeColor = getGradeColor(grade);

            // ---- Update Labels ----
            theoryTotalLabel.setText(String.format("Theory: %.1f/100", theoryTotal));
            labTotalLabel.setText(String.format("Lab: %.1f/100", labTotal));
            totalLabel.setText(String.format("Weighted Total: %.2f%%", weightedTotal));
            gpaLabel.setText(String.format("GPA: %.2f", gpa));
            gradeLabel.setText("Grade: " + grade);
            gradeLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold; -fx-text-fill: " + gradeColor + ";");

        } catch (ValidationException ex) {
            showError(ex.getMessage());
        } catch (Exception ex) {
            showError("Please enter valid numeric values.");
        }
    }

    private double parseAndValidate(TextField field, double max, String name) throws ValidationException {
        String text = field.getText().trim();
        if (text.isEmpty()) {
            throw new ValidationException(name + " cannot be empty!");
        }

        double value;
        try {
            value = Double.parseDouble(text);
        } catch (NumberFormatException e) {
            throw new ValidationException(name + " must be a valid number!");
        }

        if (value < 0) {
            throw new ValidationException(name + " cannot be negative!");
        }
        if (value > max) {
            throw new ValidationException(name + " cannot exceed " + (int) max + "!");
        }

        return value;
    }

    private double getGPA(double marks) {
        if (marks >= 85)
            return 4.0;
        else if (marks >= 80)
            return 3.7;
        else if (marks >= 75)
            return 3.3;
        else if (marks >= 70)
            return 3.0;
        else if (marks >= 65)
            return 2.7;
        else if (marks >= 61)
            return 2.3;
        else if (marks >= 58)
            return 2.0;
        else if (marks >= 55)
            return 1.7;
        else if (marks >= 50)
            return 1.0;
        else
            return 0.0;
    }

    private String getGradeLetter(double marks) {
        if (marks >= 85)
            return "A";
        else if (marks >= 80)
            return "A-";
        else if (marks >= 75)
            return "B+";
        else if (marks >= 70)
            return "B";
        else if (marks >= 65)
            return "B-";
        else if (marks >= 61)
            return "C+";
        else if (marks >= 58)
            return "C";
        else if (marks >= 55)
            return "C-";
        else if (marks >= 50)
            return "D";
        else
            return "F";
    }

    private String getGradeColor(String grade) {
        switch (grade) {
            case "A":
            case "A-":
                return "#00FF7F"; // Spring Green
            case "B+":
            case "B":
            case "B-":
                return "#00ADB5"; // Teal
            case "C+":
            case "C":
            case "C-":
                return "#FFD700"; // Gold
            case "D":
                return "#FFA500"; // Orange
            default:
                return "#FF4757"; // Red
        }
    }

    private void resetFields() {
        quizField.setText("0");
        assignField.setText("0");
        midTheoryField.setText("0");
        finalTheoryField.setText("0");
        labAssignField.setText("0");
        midLabField.setText("0");
        finalLabField.setText("0");
        theoryCreditsField.setText("3");
        labCreditsField.setText("1");

        theoryTotalLabel.setText("Theory: —/100");
        labTotalLabel.setText("Lab: —/100");
        totalLabel.setText("Total Marks: —");
        gpaLabel.setText("GPA: —");
        gradeLabel.setText("");
    }

    private void showError(String msg) {
        Alert alert = new Alert(Alert.AlertType.ERROR, msg, ButtonType.OK);
        alert.setTitle("Input Error");
        alert.setHeaderText("Invalid Input");
        alert.showAndWait();
    }

    // Custom exception for validation errors
    private static class ValidationException extends Exception {
        public ValidationException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
