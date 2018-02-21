package Question2;

public class DieSimulator {

	public static void main (String[] args)
	{
		//Creating and starting thread
		Runnable r = new RollDie();
		Thread thread = new Thread(r);
		thread.start();
	}
}
