package Question2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

public class Square implements Shape {

	private int posX;
	private int posY;
	private int size;
	private Color colour;
	
	public Square(int posX, int posY, int size) 
	{
		super();
		this.posX = posX;
		this.posY = posY;
		this.size = size;
		this.randomColour();
	}

	//Method is overridden 
	public void paint(Graphics g) 
	{
		g.setColor(colour);
		g.fillRect(posX, posY, size, size);
	}

	//Checking if mouse point lies within square
	public boolean isInShape(Point p) 
	{
		if (p.x > posX && p.x < posX+size)
		{
			if (p.y > posY && p.y < posY+size)
			{
				return true;
			}
		}
		return false;
	}

	public void randomColour() 
	{
		Random random = new Random();
		colour = new Color(random.nextFloat(), random.nextFloat(), random.nextFloat());
	}
}
