package ui;
import java.net.URL;
import java.util.ResourceBundle;
import customExceptions.ParException;
import customExceptions.ParException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import model.AlgorithmMagicSquare;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.stage.StageStyle;


public class MagicSquareController {
	
    @FXML
    private TilePane Tpane;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private BorderPane pane;
   
    @FXML
    private Button button;

    @FXML
    private ComboBox<String> directionButton;

    @FXML
    private ComboBox<String> positionButton;

    @FXML
    private TextField sizeField;
    
    @FXML
    private GridPane gridPane; 
    
    private AlgorithmMagicSquare lol;
    
    private Label advice = new Label("You can't generate the magic square because "); 
    
    @FXML
    void start(ActionEvent event) throws ParException {
    	try {
    		Tpane.getChildren().clear();
    		String ini = positionButton.getValue();
    		String p = directionButton.getValue();
    		int size = Integer.parseInt(sizeField.getText());    	
    		int position =convertPosition(ini);
    		int direction = convertDirection(p);
    		lol = new AlgorithmMagicSquare(size, position, direction); 
    		lol.magicFill();
    		int[][]ma = lol.getMagicSquare();	
    		gridPane = new GridPane();
    		for(int i = 0; i<size; i++) {
    			for(int j = 0; j<size; j++) {
    				int n = ma[i][j];
    				Label k = new Label(" "+n);
    				k.setPrefHeight(20);
    				gridPane.add(k, j, i);
    			}
    		}
    		Tpane.getChildren().add(gridPane);    
    	}catch(NegativeArraySizeException negative) {
    		Alert k = new Alert(AlertType.INFORMATION);
    		k.setTitle("ERROR negative size");
    		k.setHeaderText(null);
    		k.initStyle(StageStyle.UTILITY);
    		k.setContentText("You can't generate because you type a negative number");
    		k.show();
    	}catch(NumberFormatException string){
    		Alert k = new Alert(AlertType.INFORMATION);
    		k.setTitle("ERROR not number");
    		k.setHeaderText(null);
    		k.initStyle(StageStyle.UTILITY);
    		k.setContentText("You can't generate because you dont type a number");
    		k.show();
    	}catch(ParException op){
    		Alert k = new Alert(AlertType.INFORMATION);
    		k.setTitle("ERROR par size");
    		k.setHeaderText(null);
    		k.initStyle(StageStyle.UTILITY);
    		k.setContentText("You can't generate because you type a par size");
    		k.show();
    	}
    	
    
    }
    
    public int convertPosition(String ini) {
    	int p = 0;
    	if(ini == "UP") {
    		p = 1;
    	}
    	else if(ini == "RIGTH") {
    		p = 3;
    	}
    	else if(ini == "LEFT") {
    		p = 2;
    	}
    	else if(ini == "DOWN") {
    		p = 4;
    	}
    	return p;
    }
    public int convertDirection(String ini) {
    	int p = 0;
    	if(ini == "NO") {
    		p = 1;
    	}
    	else if(ini == "NE") {
    		p = 2;
    	}
    	else if(ini == "SO") {
    		p = 3;
    	}
    	else if(ini == "SE") {
    		p = 4;
    	}
    	return p;
    }
    @FXML
    void initialize(){
    	
    	assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'magicInterfaz.fxml'.";
    	assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'magicInterfaz.fxml'.";
        assert directionButton != null : "fx:id=\"directionButton\" was not injected: check your FXML file 'magicInterfaz.fxml'.";
        assert positionButton != null : "fx:id=\"positionButton\" was not injected: check your FXML file 'magicInterfaz.fxml'.";
        assert sizeField != null : "fx:id=\"sizeField\" was not injected: check your FXML file 'magicInterfaz.fxml'.";
        assert gridPane != null : "fx:id=\"gridPane\" was not injected: check your FXML file 'magicInterfaz.fxml'.";
        directionButton.getItems().add("NO");
        directionButton.getItems().add("NE");
        directionButton.getItems().add("SE");
        directionButton.getItems().add("SO");
        positionButton.getItems().add("UP");
        positionButton.getItems().add("LEFT");
        positionButton.getItems().add("RIGTH");
        positionButton.getItems().add("DOWN");
        
      
    }
}

