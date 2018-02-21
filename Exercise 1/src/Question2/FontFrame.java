package Question2;

import java.awt.*;
import javax.swing.*;

public class FontFrame {

	public FontFrame()
	{
		
	}
	
	void init()
	{
		JFrame form = new JFrame("Font Chooser");
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setSize(400,125);
		
		JPanel panel = new JPanel();
		form.setContentPane(panel);
		panel.setLayout(new FlowLayout());
		
		//Different panels created to structure the frame 
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2,1));
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(3,1));
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		
		//Check boxes created and added vertically to panel1
		JCheckBox bold = new JCheckBox("Bold");
		JCheckBox italics = new JCheckBox("Italics");
		panel1.add(bold);
		panel1.add(italics);
		
		//Radio buttons added to second panel in a list format 
		JRadioButton times = new JRadioButton("Times");
		JRadioButton helvetica = new JRadioButton("Helvetica");
		JRadioButton courier = new JRadioButton("Courier");
		panel2.add(times);
		panel2.add(helvetica);
		panel2.add(courier);
		
		//Text field and button created and added to panel 3
		JTextField textField = new JTextField();
		textField.setEditable(true);
		textField.setColumns(10);
		textField.setSize(500, 50);
		JButton ok = new JButton("OK");
		panel3.add(textField);
		panel3.add(ok);
		
		//Individual panels added to large panel 
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		form.setVisible(true);
	}
}
