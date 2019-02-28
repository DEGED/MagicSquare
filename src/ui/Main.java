package ui;
import  model.*;
import customExceptions.ParException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application  {

	public static void main(String[]args) throws ParException {
		AlgorithmMagicSquare p = new AlgorithmMagicSquare(5, 4, 4);
		
		p.magicFill();
		
		
		launch(args);
	
	}
	/*
	 * This method execute the GUI 
	 */
	@Override
	public void start(Stage stage) throws Exception {
		
		Parent root= FXMLLoader.load(getClass().getResource("magicInterfaz.fxml"));
       	
       	Scene scene= new Scene(root);
       	stage.setTitle("Magic Square");
       	stage.setScene(scene);
       	stage.show();
		
	}
}
