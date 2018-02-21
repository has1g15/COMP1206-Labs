package Question3;

import java.util.Random;
import java.util.Vector;

public class PrimeTest {

	public static void main (String[] args)
	{
		//Creates a vector of 100 random integer objects 
		Vector<Integer> vector = new Vector<>();
		Random rand = new Random();
		for (int i = 0; i < 100; i++)
		{
			vector.addElement(rand.nextInt(200));
		}
		//A thread is created for every 10 elements in the vector 
		for (int i = 0; i < 10; i++)
		{
			Runnable r = new TestResults(vector.subList(i, i+9));
			Thread thread = new Thread(r);
			thread.start();
		} 
	}
}
