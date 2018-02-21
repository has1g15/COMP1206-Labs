package Question2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

public class Circle implements Shape{
	
	private int posX;
	private int posY;
	private int diam;
	private Color colour;

	public Circle(int posX, int posY, int diam)
	{
		super();
		this.posX = posX;
		this.posY = posY;
		this.diam = diam;
		this.randomColour();
	}
	
	//Paint method is overridden 
	public void paint(Graphics g) 
	{
		g.setColor(colour);
		g.fillOval(posX, posY, diam, diam);
	}

	//Checking if mouse point lies within circle
	public boolean isInShape(Point p) 
	{
		Point centre = new Point((int)posX + diam/2, (int)posY + diam/2);
		//If distance between two points if less than or equal to radius, true is
		//returned
		return p.distance(centre) <= diam/2;
	}

	public void randomColour() 
	{
		Random random = new Random();
		colour = new Color(random.nextFloat(), random.nextFloat(), random.nextFloat());
	}

}
