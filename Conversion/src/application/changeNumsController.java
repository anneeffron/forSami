package application;

import javafx.fxml.FXML;

import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class changeNumsController {
	@FXML
	private TextField getDecimal;
	@FXML
	private TextField getHex;
	@FXML
	private TextField getBinary;
	@FXML
	private AnchorPane getPane;
	
	@FXML
	private void DecimalClick(KeyEvent event) {
		if (event.getCode() == KeyCode.ENTER) {
			getHex.setText(Integer.toHexString(
					Integer.parseInt(getDecimal.getText())));

				getBinary.setText(Integer.toBinaryString(
						Integer.parseInt(getDecimal.getText())));
			
		}

	}
	
	@FXML
	private void HexClick(KeyEvent event) {
		if (event.getCode() == KeyCode.ENTER) {
			String hex = getHex.getText();
			hex = hex.toUpperCase();
			int val = 0;
			String digits = "0123456789ABCDEF";
			for (int i = 0; i < hex.length(); i++ ) {
				char c = hex.charAt(i);
				int d = digits.indexOf(c);
				val = 16*val + d;
			}
			String val2 = Integer.toString(val);
			
			getDecimal.setText(val2);
			
			getBinary.setText(Integer.toBinaryString(Integer.parseInt(val2)));
			
		}

	}
	@FXML
	private void BinaryClick(KeyEvent event) {
		if (event.getCode() == KeyCode.ENTER) {
			//binary to decimal 
			int decimal = Integer.parseInt(getBinary.getText(),2);  
			String finalD = Integer.toString(decimal);
			getDecimal.setText(finalD);
		
			
			getHex.setText(Integer.toHexString(decimal));
			
		
		
		
		}
		
		}

	}


