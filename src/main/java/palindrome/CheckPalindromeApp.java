package palindrome;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckPalindromeApp extends Application{

	private Label compruebaLabel;
	private Button comprobarButton;
	private TextField nombreText;
	
	
	public void start(Stage primaryStage) throws Exception {
	
	
	nombreText=new TextField();
	nombreText.setPromptText("Introduce una palabra");
	nombreText.setMaxWidth(150);
	
	comprobarButton = new Button("Comprobar");
	comprobarButton.setDefaultButton(true);
	comprobarButton.setOnAction(e -> oncomprobarButtonAction(e));
	
	compruebaLabel = new Label("Aquí saldrá el resultado");
	
	VBox root= new VBox();
	root.setSpacing(5);
	root.setAlignment(Pos.CENTER);
	root.getChildren().addAll(nombreText, comprobarButton, compruebaLabel);
	
	
	Scene scene = new Scene(root, 320, 200);
	
	primaryStage.setTitle("HolaMundoFX Mejorado");
	primaryStage.setScene(scene);
	primaryStage.show();
	
	
	}


	private void oncomprobarButtonAction(ActionEvent e) {
		
		 
	      String reverse = "";
	      String nombre=nombreText.getText();
	   
	     int length = nombre.length();
	     
	      for (int i = length - 1; i >= 0; i--)
	         reverse = reverse + nombre.charAt(i);
	         
	      if (nombre.equals(reverse)){
	    	  compruebaLabel.setText("Es palíndromo");
	         
	      }
	      else{
	    	  compruebaLabel.setText("No es palíndromo");
	      }
	      
	      
	      
	}
	
	
	
//	boolean checkPalindrome(String inputString) {
//	      boolean palindromo;
//	      String reverse = "";
//	   
//	     int length = inputString.length();
//	     
//	      for (int i = length - 1; i >= 0; i--)
//	         reverse = reverse + inputString.charAt(i);
//	         
//	      if (inputString.equals(reverse)){
//	         palindromo=true;
//	         return palindromo;
//	      }
//	      else{
//	         palindromo=false;
//	         return palindromo;
//	      }
//	}
//	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	
}
