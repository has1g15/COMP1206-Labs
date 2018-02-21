package Question2;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextField;

public class CourierListener implements ItemListener{

	JTextField textField;
	
	public CourierListener(JTextField textField)
	{
		this.textField = textField;
	}

	//When "Courier" radio button is selected, font changes
	//If unselected, the font goes to default of Comic Sans
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getStateChange() == ItemEvent.SELECTED)
		{
			Font myFont = new Font("Courier", Font.PLAIN, 12);
			textField.setFont(myFont);
			textField.setText("Courier");
		}
		else
		{
			Font myFont = new Font("Comic Sans MS", Font.PLAIN, 12);
			textField.setFont(myFont);
	    }
	}
}
