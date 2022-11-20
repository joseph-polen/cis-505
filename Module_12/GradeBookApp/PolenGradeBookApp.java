/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.

https://stackoverflow.com/questions/16003102/redirecting-system-out-and-appending-to-an-existing-file

https://www.javatpoint.com/how-to-read-csv-file-in-java
*/

import javafx.stage.Stage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 * @author Joe Polen CIS-505 Bellevue University
 * 
 *         Class for Grade Book App
 */

public class PolenGradeBookApp extends Application {

	// Create TexFields
	private TextField firstNameField = new TextField();
	private TextField lastNameField = new TextField();
	private TextField courseField = new TextField();

	// Create TextArea for grades output
	private TextArea gradeResults = new TextArea();

	// Create Labels for the controllers
	private Label lblFirstName = new Label("First Name:");
	private Label lblLastName = new Label("Last Name:");
	private Label lblCourse = new Label("Course:");
	private Label lblGrade = new Label("Grade:");

	// Create ComboBox of type String for grades
	private ComboBox<String> gradesBox = new ComboBox<String>();

	// Create buttons
	private Button btnClear = new Button("Clear");
	private Button btnViewGrades = new Button("View Grades");
	private Button btnSaveGrades = new Button("Save Grades");

	/**
	 * Overridden start method for starting the GUI
	 */
	@Override
	public void start(Stage primaryStage) {

		// Create grid pane and set attributes
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setVgap(5.5);
		pane.setHgap(5.5);
		
		//Add controllers to GridPane
		pane.add(firstNameField, 1, 0);
		pane.add(lastNameField, 1, 1);
		pane.add(courseField, 1, 2);
		pane.add(gradeResults, 0, 5, 2, 1);
		pane.add(lblFirstName, 0, 0);
		pane.add(lblLastName, 0, 1);
		pane.add(lblCourse, 0, 2);
		pane.add(lblGrade, 0, 3);
		pane.add(gradesBox, 1, 3);
		//Set combobox to max width so it fills entire row
		gradesBox.setMaxWidth(Double.MAX_VALUE);
		// Add combobox items
		gradesBox.getItems().addAll("A", "B", "C", "D", "F");
		
		//Create HBox for buttons
		HBox actionBtnContainer = new HBox();
		actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
		actionBtnContainer.setSpacing(10);
		actionBtnContainer.getChildren().add(btnViewGrades);
		actionBtnContainer.getChildren().add(btnSaveGrades);
		actionBtnContainer.getChildren().add(btnClear);
		pane.add(actionBtnContainer, 1, 4);	
		
		// Set actions for the buttons
		btnClear.setOnAction(e -> clearFormFields());
		btnSaveGrades.setOnAction(e -> saveGrades());
		btnViewGrades.setOnAction(e -> viewGrades());

		//Set the scene, add title and show the GUI
		Scene scene = new Scene(pane, 350, 350);
		primaryStage.setTitle("Polen Grade Book App");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		//Launch the window
		launch(args);
	}
	
	/**
	 * Method to save grades
	 */
	private void saveGrades() {
		
		//Get text from fields
		String firstName = firstNameField.getText();
		String lastName = lastNameField.getText();
		String course = courseField.getText();
		String grade = gradesBox.getValue();
		
		//Create student object
		Student student = new Student(firstName, lastName, course, grade);
		
		//Try to write to the file
		try {
			//redirect system output to the file
			System.setOut(new PrintStream(new FileOutputStream("grades.csv", true)));
		    student.toString();
		} catch (FileNotFoundException e) {
			System.out.println("grades.csv not found");
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Method to view grades
	 */
	private void viewGrades() {
		
		//Clear results every time you view grades
		gradeResults.setText("");
		
		//Add columns for what is displayed
		gradeResults.setText("First Name  |  Last Name  |  Course  |  Grade \n\n");
		
		//Try to open the file
		try {
			Scanner scanner = new Scanner(new File("grades.csv"));
			scanner.useDelimiter(",");
			
			while (scanner.hasNext()) {
				gradeResults.appendText(scanner.next() + "       ");
			}
			gradeResults.appendText("\n");
			
			scanner.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("grades.csv not found");
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Method to clear form text
	 */
	private void clearFormFields() {

		firstNameField.setText("");
		lastNameField.setText("");
		courseField.setText("");
		gradesBox.setValue("");
		gradeResults.setText("");

	}

}