package Question1;

import java.util.Random;

public class RollDie extends SynchRollDie implements Runnable{

	private int endVal;
	@Override
	public void run() 
	{
		Random rollNumber = new Random();
		Random faceNumber = new Random();
	
			//Rolls dies the specified number of times 
			for (int i = 0; i < (rollNumber.nextInt(20) + 1); i++)
			{
				System.out.println(faceNumber.nextInt(6) + 1);
				try 
				{
					Thread.sleep(500);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
			endVal = faceNumber.nextInt(6) + 1;
	}
	
	public int getVal()
	{
		return endVal;
	}
}
