package Question1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class IncrementListener implements ActionListener{
	
	JTextField textField;
	//Static variable - can be changed to 0 when the reset button is clicked 
	static int count = 0;
	
	public IncrementListener(JTextField textField)
	{
		this.textField = textField;
	}
	
	//When button is clicked, count is incremented and text in text field is edited to display count 
	public void actionPerformed(ActionEvent pressed) 
	{
		count++;
		textField.setText("Count: " + count);
	}
}
