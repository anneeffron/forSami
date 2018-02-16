package application;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;

public class changeColorsController {
	//controllers
	@FXML
	private RadioButton redCheck;
	@FXML
	private RadioButton yellowCheck;
	@FXML
	private RadioButton blackCheck;
	@FXML
	private RadioButton orangeCheck;
	@FXML
	private RadioButton greenCheck;
	@FXML
	private Button leftButton;
	@FXML
	private Button rightButton;
	@FXML
	private Label moveLabel;
	double x = 197.0;
	double y = 123.0;
	
	
	//events
	@FXML
	private void redCheck(ActionEvent event) {
		if (redCheck.isSelected()) {
			moveLabel.setTextFill(Color.RED);
		}
	}
	@FXML
	private void yellowCheck(ActionEvent event) {
		if (yellowCheck.isSelected()) {
			moveLabel.setTextFill(Color.YELLOW);
		}
	}
	@FXML
	private void blackCheck(ActionEvent event) {
		if (blackCheck.isSelected()) {
			moveLabel.setTextFill(Color.BLACK);
		}
	}
	@FXML
	private void orangeCheck(ActionEvent event) {
		if (orangeCheck.isSelected()) {
			moveLabel.setTextFill(Color.ORANGE);
		}
	}
	@FXML
	private void greenCheck(ActionEvent event) {
		if (greenCheck.isSelected()) {
			moveLabel.setTextFill(Color.GREEN);
		}
	}
	@FXML
	private void leftButtonClick(ActionEvent event) {
		//System.out.println("Moving left");
		moveLabel.relocate(x-10.0, y);
		x-= 10.0;
	}
	@FXML
	private void rightButtonClick(ActionEvent event) {
		moveLabel.relocate(x+10.0, y);
		x+=10.0;
		//System.out.println("Moving Right");
	}
	
	

}
