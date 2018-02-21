package Question1;

public class MyThread extends Thread{

	public void run()
	{
		try
		{
			//Depending on name of thread, threads sleep for different periods of time
			String[] splitThread = this.getName().split(" ");
			if (splitThread[1].equals("1"))
			{
				this.sleep(1000);
			}
			else if (splitThread[1].equals("2"))
			{
				this.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			return;
		}
		System.out.println(this.getName() + " has terminated");
	}
}
