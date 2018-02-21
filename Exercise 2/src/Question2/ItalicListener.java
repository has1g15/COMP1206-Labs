package Question2;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextField;

public class ItalicListener implements ItemListener{

	JTextField textField;
	
	public ItalicListener(JTextField textField)
	{
		this.textField = textField;
	}

	//When bold check box is ticked, font changed to bold 
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getStateChange() == ItemEvent.SELECTED)
		{
			textField.setFont(textField.getFont().deriveFont(Font.ITALIC));
		}
		else
		{
			textField.setFont(textField.getFont().deriveFont(Font.PLAIN));
	    }
	}
}
