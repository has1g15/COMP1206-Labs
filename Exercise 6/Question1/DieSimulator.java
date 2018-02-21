package Question1;

public class DieSimulator {

	public static void main (String[] args)
	{
		//Creating and starting thread
		RollDie r = new RollDie();
		Thread [] threads = new Thread[5];
		int [] endValues = new int [5];
		for (int i = 0; i < threads.length; i++)
		{
			threads[i] = new Thread(r);
			threads[i].start();
			try 
			{
				threads[i].join();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			endValues[i] = r.getVal();
			System.out.println("You rolled a:" + (endValues[i]));
		}
		
		//Totals values of all dies rolled
		int sum = 0;
		for (int i: endValues)
		{
			sum+=i;
		}
		System.out.println("Total value of your roll: " + sum);
	}
}
