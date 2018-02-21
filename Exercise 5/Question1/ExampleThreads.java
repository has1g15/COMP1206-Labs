package Question1;

public class ExampleThreads {

	public static void main (String[] args) 
	{
		//Threads created, named and started
		Thread thread1 = new MyThread();
		thread1.setName("Thread 1");
		thread1.start();
		Thread thread2 = new MyThread();
		thread2.setName("Thread 2");
		thread2.start();
		Thread thread3 = new MyThread();
		thread3.setName("Thread 3");
		thread3.start();
	}
}
