package Question2;

import java.util.Random;

public class RollDie implements Runnable{

	Random rollNumber = new Random();
	Random faceNumber = new Random();
	
	//When thread is run, die is rolled a random number of times 
	@Override
	public void run() 
	{
		for (int i = 0; i < (rollNumber.nextInt(20) + 1); i++)
		{
			System.out.println(faceNumber.nextInt(6) + 1);
			try 
			{
				//As the loop counter increases, sleep time decreases 
				Thread.sleep(500 + i*1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("You rolled a:");
		System.out.println(faceNumber.nextInt(6) + 1);
	}
}
