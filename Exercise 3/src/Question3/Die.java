package Question3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Die extends JPanel{

	//3D array of positions 
	boolean[][][]positions;
	//int storing the number on the die 
	int dieState;
	//Constants setting values of variables relating to die spots 
	private final static int BORDER = 50;
	private final static int INTERVAL = 70;
	private final static int DIAMETER = 20;
	
	public Die()
	{
		super();
		//Array populated with values to represent die face 
		positions = new boolean[][][]
					{{{false, false, false},
					{false, true, false},
					{false, false, false}},		//1
					{{false, false, true},
					{false, false, false},
					{true, false, false}},		//2
					{{false, false, true},
					{false, true, false},
					{true, false, false}},		//3
					{{true, false, true},
					{false, false, false},
					{true, false, true}},		//4
					{{true, false, true},
					{false, true, false},
					{true, false, true}},		//5
					{{true, false, true},
					{true, false, true},
					{true, false, true}}};		//6
					this.setBounds(0, 0, 200, 200);
					Random random = new Random();
					//dieState is initialised with a random number from 1-6
					dieState=random.nextInt(5);
	}
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(0, 0, 300, 300);
		g.setColor(Color.WHITE);
		//Rows and columns on die face are checked if there is a value of true in the 
		//array, the oval is drawn in the relevant position 
		for (int x = 0; x < 3; x++)
		{
			for (int y = 0; y < 3; y++)
			{
				if(positions[dieState][y][x])
				{
					g.fillOval(BORDER + x*INTERVAL, BORDER + y*INTERVAL, DIAMETER, DIAMETER);
				}
			}
		}
	}
	
	//When method is called, dieState is updated with a value of a random number from
	//1-6
	public void updateVal(int i)
	{
		this.dieState = i;
	}
}
