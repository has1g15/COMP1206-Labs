package Question1;

import java.awt.FlowLayout;
import javax.swing.JButton; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame {

	public MyFrame()
	{

	}

	void init()
	{
		JFrame form = new JFrame("Simple Submit Cancel Form");
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setSize(200,100);

		//Creating panel and setting layout type 
		JPanel panel = new JPanel();							
		form.setContentPane(panel);
		panel.setLayout(new FlowLayout());

		//Creating text field and adding to panel
		JTextField textField = new JTextField();
		textField.setEditable(true);
		textField.setColumns(10);
		textField.setSize(500, 50);
		panel.add(textField);

		//Creating buttons and adding to panel
		JButton button1 = new JButton("Submit");
		panel.add(button1);
		JButton button2 = new JButton("Cancel");
		panel.add(button2);

		form.setVisible(true);
	}
}
