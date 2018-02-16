package application;
//14.7
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;

public class Main extends Application {
	@Override 
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPrefWidth(500);
		pane.setPrefHeight(200);

	

		for (int i = 0; i < 10; i++) {
			for (int j=  0; j < 10; j++) {
				TextField Text = new TextField();
				Text.setText(Integer.toString((int)(Math.random() * 2)));
				pane.add(Text,j, i);
	
			}
		}
		
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise14_07");
		primaryStage.setScene(scene);
		primaryStage.show();

	

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}


