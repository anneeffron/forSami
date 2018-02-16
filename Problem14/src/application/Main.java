package application;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
//14.11
public class Main extends Application {
	@Override 
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		//making the circle part
		Circle circle = new Circle();
		circle.setCenterX(250);
		circle.setCenterY(250);
		circle.setRadius(150);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		pane.getChildren().add(circle);
		
		//eye outline
		Ellipse e1 = new Ellipse(190,175, 40, 30);
		e1.setFill(Color.TRANSPARENT);
		e1.setStroke(Color.BLACK);
		pane.getChildren().add(e1);
		
		//eyeballs!!!!
		Ellipse e2 = new Ellipse(190,175, 20, 20);
		pane.getChildren().add(e2);
		//eye outline
		Ellipse e3 = new Ellipse(300, 175, 40, 30);
		e3.setFill(Color.TRANSPARENT);
		e3.setStroke(Color.BLACK);
		pane.getChildren().add(e3);
		
		//eyeballs!
		Ellipse e4 = new Ellipse(300,175, 20, 20);
		pane.getChildren().add(e4);
		
		//creating the nose
		Polygon nose = new Polygon();
		nose.setFill(Color.TRANSPARENT);
		nose.setStroke(Color.BLACK);
		nose.getPoints().addAll(new Double[]{
		    250.0, 250.0,
		    225.0, 300.0,
		    275.0, 300.0});
		pane.getChildren().add(nose);
		
		//creating the smile 
		Arc smile = new Arc(250, (325), (150/2), (150/2/2), 180, 180);
		smile.setFill(Color.TRANSPARENT);
		smile.setType(ArcType.OPEN);
		smile.setStroke(Color.BLACK);
		pane.getChildren().add(smile);
		
	
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Exercise14_11");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	public static void main(String[] args) {
		launch(args);
	}
}
