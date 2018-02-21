package Question2;

import java.util.ArrayList;
import java.util.Random;

public class IntList {

	private ArrayList<Integer> intList;
	
	//Creates array list of random integers, list length depends on argument
	public IntList(int listLength)
	{
		intList = new ArrayList<Integer>();
		Random random = new Random();
		for (int i = 0; i < listLength; i++)
		{
			int item = random.nextInt(200);
			intList.add(item);
		}
	}
	
	public synchronized void add (Integer o)
	{
		//adds an integer to the end of the list
		intList.add(o);
	}
	
	public synchronized Integer get()
	{
		if(this.isEmpty())
		{
			try 
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		//removes and returns the first integer in the list 
		Integer first = intList.get(0);
		intList.remove(0);
		return first;
	}
	
	public synchronized boolean isEmpty()
	{
		//returns true if list is empty and false otherwise
		return intList.isEmpty();
	}
}
