package Question2;

import java.awt.Graphics;
import java.awt.Point;

//Interface implemented by different shape types, methods fill shapes, check whether
//mouse point is contained within shape and sets shape to a random colour 
public interface Shape {

	public void paint (Graphics g);
	
	public boolean isInShape(Point p);
	
	public void randomColour();
}
