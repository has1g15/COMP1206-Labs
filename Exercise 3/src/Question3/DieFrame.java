package Question3;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;

public class DieFrame {

	public DieFrame()
	{
		Die die = new Die();
		JFrame dFrame = new JFrame("Die Application");
		dFrame.setSize(275, 300);
		dFrame.add(die);
		//Listener added to frame 
		dFrame.addMouseListener(new MouseListener(){

			//When frame is clicked, updateVal in die class is called and display
			//on frame is changed with another die face 
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				die.updateVal(new Random().nextInt(5)+1);
				dFrame.repaint();
			}

			@Override
			public void mouseEntered(MouseEvent e) 
			{
				
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
			
		});
		dFrame.setVisible(true);
	}
	
	public static void main (String[] args)
	{
		new DieFrame();
	}
}
