package Question1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ResetListener implements ActionListener{

	JTextField textField;
	
	public ResetListener(JTextField textField)
	{
		this.textField = textField;
	}
	
	//When reset button is clicked, count is displayed as 0 in text field and class variable in 
	//IncrementListener is set to 0
	public void actionPerformed(ActionEvent pressed) 
	{
		textField.setText("Count: 0");
		IncrementListener.count = 0;
	}
}
