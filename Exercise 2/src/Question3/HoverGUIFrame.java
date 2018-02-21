package Question3;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HoverGUIFrame{

	ArrayList<JPanel> colouredPanels;
	ArrayList<JLabel> labels;
	PanelListener panelListener;
	
	public HoverGUIFrame()
	{
		Random random = new Random();
		
		JFrame form = new JFrame("Mouse Hover");
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setSize(500,500);
		
		JPanel panel = new JPanel();
		form.setContentPane(panel);
		panel.setLayout(new GridLayout(2,1));
		
		//Upper panel added to main panel on frame
		JPanel top = new JPanel();
		top.setLayout(null);
		panel.add(top);
		
		//Lower panel added to main panel on frame 
		JPanel bottom = new JPanel();
		panel.add(bottom);
		
		//Instantiating an array of JPanels and populating with a few panels
		colouredPanels = new ArrayList<JPanel>();
		colouredPanels.add(new JPanel());
		colouredPanels.add(new JPanel());
		colouredPanels.add(new JPanel());
		
		labels = new ArrayList<JLabel>();
		
		//Actions performed for every panel in the array list
		for (JPanel cPanel: colouredPanels)
		{
			//Background is set to a random colour using random object 
			cPanel.setBackground(new Color(random.nextFloat(), random.nextFloat(), random.nextFloat()));
			//Bounds of the panels are set randomly using the random object
			cPanel.setBounds(random.nextInt(200), random.nextInt(200), random.nextInt(200), random.nextInt(200));
			//For every panel, a label is created 
			JLabel label = new JLabel();
			//Label added to array list of labels 
			labels.add(label);
			//Label added to lower panel 
			bottom.add(label);
			//Listener added to coloured panels by instantiating new instance of
			//PanelListener class
			cPanel.addMouseListener(new PanelListener(label));
			//Finally, coloured panel is added to upper panel on frame 
			top.add(cPanel);
		}
	
		form.setVisible(true);
	}
	
	class PanelListener implements MouseListener
	{
		JLabel label;
		
		public PanelListener(JLabel label)
		{
			this.label = label;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) 
		{
		
		}
		
		//When mouse is over the top of relevant panel, the co-ordinates of the 
		//cursor position are displayed on the corresponding label 
		@Override
		public void mouseEntered(MouseEvent e) 
		{
			label.setText("(" + e.getX() + ", " + e.getY() + ")");
		}

		@Override
		public void mouseExited(MouseEvent e) 
		{
			
		}

		@Override
		public void mousePressed(MouseEvent e) 
		{
			
		}

		@Override
		public void mouseReleased(MouseEvent e) 
		{
			
		}
	}
}
