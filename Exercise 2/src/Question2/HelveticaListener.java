package Question2;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextField;

public class HelveticaListener implements ItemListener{

	JTextField textField;
	
	public HelveticaListener(JTextField textField)
	{
		this.textField = textField;
	}
	
	//When "Helvetica" radio button is selected, font changes
	//If unselected, the font goes to default of Comic Sans
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getStateChange() == ItemEvent.SELECTED)
		{
			Font myFont = new Font("Helvetica", Font.PLAIN, 12);
			textField.setFont(myFont);
			textField.setText("Helvetica");
		}
		else
		{
			Font myFont = new Font("Comic Sans MS", Font.PLAIN, 12);
			textField.setFont(myFont);
	    }
	}
}
