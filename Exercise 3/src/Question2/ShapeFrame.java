package Question2;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import java.util.ArrayList;

public class ShapeFrame extends JFrame{

	ShapeListener shapeListener;
	ArrayList<Shape> shapes;
	
	public ShapeFrame()
	{
		//Array list of shapes instantiated 
		shapes = new ArrayList<>();
		//Array list populated with shapes
		shapes.add(new Square(100, 100, 100));
		shapes.add(new Circle(200, 100, 100));
		shapes.add(new Square(200, 200, 100));
		shapes.add(new Circle(100, 200, 100));
		shapeListener = new ShapeListener(shapes);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,400);
		this.addMouseListener(shapeListener);
		this.setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		//Every shape in the array list is called with the paint method 
		for (Shape s: shapes)
		{
			s.paint(g);
		}
	}
	
	class ShapeListener implements MouseListener
	{
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		public ShapeListener(ArrayList<Shape> shapes)
		{
			this.shapes = shapes;
		}
		
		public void mouseClicked(MouseEvent e) 
		{
			//When mouse is clicked, every shape in array list is checked and if
			//cursor falls within bounds, shape changes to random colour 
			for (Shape s: shapes)
			{
				if (s.isInShape(e.getPoint()))
				{
					s.randomColour();
				}
			}
			repaint();
		}

		public void mouseEntered(MouseEvent e) 
		{
			
		}

		public void mouseExited(MouseEvent e) 
		{
		
		}

		public void mousePressed(MouseEvent e) 
		{
			
		}

		public void mouseReleased(MouseEvent e) 
		{
			
		}
	}
}
