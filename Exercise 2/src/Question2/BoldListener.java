package Question2;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextField;

public class BoldListener implements ItemListener{

	JTextField textField;
	
	public BoldListener(JTextField textField)
	{
		this.textField = textField;
	}

	//When bold check box is ticked, font changed to bold 
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getStateChange() == ItemEvent.SELECTED)
		{
			textField.setFont(textField.getFont().deriveFont(Font.BOLD));
		}
		else
		{
			textField.setFont(textField.getFont().deriveFont(Font.PLAIN));
	    }
	}
}
