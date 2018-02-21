package Question2;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FontFrame {

	public FontFrame()
	{
		JFrame form = new JFrame("Font Chooser");
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setSize(400,125);
		
		JPanel panel = new JPanel();
		form.setContentPane(panel);
		panel.setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(2,1));
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(new GridLayout(3,1));
		
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
		
		//Listeners added to check boxes for bold and italics 
		JTextField textField = new JTextField();
		JCheckBox bold = new JCheckBox("Bold");
		bold.addItemListener(new BoldListener(textField));
		JCheckBox italics = new JCheckBox("Italics");
		italics.addItemListener(new ItalicListener(textField));
		panel1.add(bold);
		panel1.add(italics);
		
		//Listeners added to font radio buttons 
		JRadioButton times = new JRadioButton("Times");
		times.addItemListener(new TimesListener(textField));
		JRadioButton helvetica = new JRadioButton("Helvetica");
		helvetica.addItemListener(new HelveticaListener(textField));
		JRadioButton courier = new JRadioButton("Courier");
		courier.addItemListener(new CourierListener(textField));
		panel2.add(times);
		panel2.add(helvetica);
		panel2.add(courier);
		
		textField.setEditable(true);
		textField.setColumns(10);
		textField.setSize(500, 50);
		JButton ok = new JButton("OK");
		panel3.add(textField);
		panel3.add(ok);
		
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		form.setVisible(true);
	}
}
