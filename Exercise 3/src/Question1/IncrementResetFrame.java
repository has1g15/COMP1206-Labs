package Question1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IncrementResetFrame {
	
	//Member variable that can be accessed by main class and all nested classes
	int count;
	public IncrementResetFrame()
	{
		JFrame form = new JFrame("Increment Reset Form");
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setSize(200,100);
		
		JPanel panel = new JPanel();
		form.setContentPane(panel);
		panel.setLayout(new FlowLayout());
		
		JTextField textField = new JTextField();
		textField.setEditable(true);
		textField.setColumns(10);
		textField.setSize(500, 50);
		panel.add(textField);
		
		JLabel label = new JLabel(" ");
		panel.add(label);
		
		JButton increment = new JButton("Increment");
		//Anonymous class adding listener to increment button
		increment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//If button is clicked, count is incremented and displayed
				count++;
				textField.setText("Count: " + count);
			}
		}
		);
		panel.add(increment);
		
		JButton reset = new JButton("Reset");
		//Anonymous class adding listener to reset button 
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//If button is clicked, count is set to 0
				count = 0;
				textField.setText("Count: 0");
			}
		}
		);
		panel.add(reset);
		form.setVisible(true);
	}
}
