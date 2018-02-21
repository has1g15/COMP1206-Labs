package Question1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IncrementResetFrame {

	public IncrementResetFrame()
	{
		
	}
	
	void init()
	{
		JFrame form = new JFrame("Increment Reset Listener");
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setSize(200,100);
		
		JPanel panel = new JPanel();
		form.setContentPane(panel);
		panel.setLayout(new FlowLayout());
		
		//Text field created to display counter 
		JTextField textField = new JTextField();
		textField.setEditable(true);
		textField.setColumns(10);
		textField.setSize(500, 50);
		panel.add(textField);
		
		//Increment button created with Increment listener attached 
		JButton button1 = new JButton("Increment");
		button1.addActionListener(new IncrementListener(textField));
		panel.add(button1);
		
		//Reset button created with Reset listener attached 
		JButton button2 = new JButton("Reset");
		button2.addActionListener(new ResetListener(textField));
		panel.add(button2);
		form.setVisible(true);
	}
}
