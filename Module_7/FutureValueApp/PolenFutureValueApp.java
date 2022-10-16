/*
Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.

IceFire. (2016, March 15). ComboBox with numbers. Stack Overflow.
Retrieved October 16, 2022, from https://stackoverflow.com/questions/36020486/combobox-with-numbers

JavaFX tutorial - Javatpoint (n.d.). 
Retrieved October 16, 2022, from https://www.javatpoint.com/javafx-tutorial 

pinkston00. (2018, November 26). JavaFX - how to make ComboBox hgrow? Stack Overflow. 
Retrieved October 16, 2022, from https://stackoverflow.com/questions/29489880/javafx-how-to-make-combobox-hgrow 
*/

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

/**
 * @author Joe Polen CIS-505 Bellevue University
 * 
 *         Class for Future Values App JavaFX GUI
 */

public class PolenFutureValueApp extends Application {

	// Create TexFields
	private TextField monthlyPmtField = new TextField();
	private TextField interestRateField = new TextField();

	// Create TextArea
	private TextArea textArea = new TextArea();

	// Create Labels for the controllers
	private Label lblMonthlyPayment = new Label("Monthly Payment:");
	private Label lblInterestRate = new Label("Interest Rate:");
	private Label lblInterestRateFormat = new Label("Enter 11.1% as 11.1");
	private Label lblYears = new Label("Years:");

	// Assignment instructions say to create 5 Labels, couldn't figure out what 5th is for
	private Label fifthLabel = new Label();

	// Create ComboBox of type Integer
	private ComboBox<Integer> yearsBox = new ComboBox<Integer>();

	// Create buttons
	private Button btnClear = new Button("Clear");
	private Button btnCalculate = new Button("Calculate");

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
		pane.add(monthlyPmtField, 1, 0);
		pane.add(interestRateField, 1, 1);
		//Set text area to occupy 2 columns
		pane.add(textArea, 0, 5, 2, 1);
		pane.add(lblMonthlyPayment, 0, 0);
		pane.add(lblInterestRate, 0, 1);
		lblInterestRateFormat.setTextFill(Color.RED);
		pane.add(lblInterestRateFormat, 1, 2);
		GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);
		pane.add(lblYears, 0, 3);
		pane.add(yearsBox, 1, 3);
		//Set combobox to max width so it fills entire row
		yearsBox.setMaxWidth(Double.MAX_VALUE);
		
		//Create HBox for buttons
		HBox actionBtnContainer = new HBox();
		actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
		actionBtnContainer.setSpacing(10);
		actionBtnContainer.getChildren().add(btnClear);
		actionBtnContainer.getChildren().add(btnCalculate);
		pane.add(actionBtnContainer, 1, 4);	

		//Set the scene, add title and show the GUI
		Scene scene = new Scene(pane, 300, 350);
		primaryStage.setTitle("Polen Future Value App");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		//Launch the window
		launch(args);
	}

}