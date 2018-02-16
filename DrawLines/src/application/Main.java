package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
//15.9

public class Main extends Application {
	int x = 100;
	int y =100 ;
	@Override
	public void start (Stage primaryStage) {
		Pane pane = new Pane();
		pane.setPrefWidth(500);
		pane.setPrefHeight(200);
		pane.setOnKeyPressed(e -> {
			
			if (e.getCode() == KeyCode.DOWN) {
				pane.getChildren().add(new Line(x, y, x, y+10));
				y += 10;	
			}
			else if (e.getCode() == KeyCode.UP) {
				pane.getChildren().add(new Line(x, y, x, y-10));
				y -= 10;
		
			}
			else if (e.getCode() == KeyCode.RIGHT) {
				pane.getChildren().add(new Line(x, y, x+10, y));
				x += 10;
				
			}
			else if (e.getCode() == KeyCode.LEFT) {
				pane.getChildren().add(new Line(x, y, x-10, y));
				x -= 10; 
			
			}
		
		});
		
	

	Scene scene = new Scene(pane);
	primaryStage.setTitle("Exercise15_09");
	primaryStage.setScene(scene);
	primaryStage.show();
	pane.requestFocus();

	
	
	}


	public static void main(String[] args) {
		launch(args);
	}
	
}
