package Question3;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class FontFrame {
	
	public FontFrame()
	{
		
	}
	
	void init()
	{
		JFrame form = new JFrame("Font Chooser");
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setSize(400,100);
		
		JPanel panel = new JPanel();
		form.setContentPane(panel);
		panel.setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2,1));
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		
		JCheckBox bold = new JCheckBox("Bold");
		JCheckBox italics = new JCheckBox("Italics");
		panel1.add(bold);
		panel1.add(italics);
		
		//Single comboxbox used opposed to three individual radio buttons 
		String[] fontList = { "Times", "Helvetica", "Courier", };
		JComboBox<String> fonts = new JComboBox<String>(fontList);
		fonts.setSelectedIndex(2);
		panel2.add(fonts);
		
		//Text field added to final panel
		JTextField textField = new JTextField();
		textField.setEditable(true);
		textField.setColumns(10);
		textField.setSize(500, 50);
		JButton ok = new JButton("OK");
		panel3.add(textField);
		panel3.add(ok);
		
		//All panels added to main panel 
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		form.setVisible(true);
	}
}
