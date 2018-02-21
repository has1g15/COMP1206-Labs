package Question2;

public class PrimeApp {
	
	IntList primes;

	public static boolean checkPrime(int n)
	{
		int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53,
						59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 
						127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 
						179, 181, 191, 193, 197, 199};
		
		for (int i = 0; i < 46; i++)
		{
			if (n % primes[i] == 0)
			{
				if (n == primes[i])
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		
		int maxtest = n/16;
		
		for (int i = 201; i < maxtest; i+=2)
			if (n % i == 0)
				return false;
		return true;
	}
	
	public static void main (String[] args)
	{
		int listLength = Integer.parseInt(args[0]);
		int noThreads = Integer.parseInt(args[1]);
		
		PrimeApp isPrime = new PrimeApp();
		isPrime.primes = new IntList(listLength);
		isPrime.runThreads(noThreads);
	}
		
	public void runThreads(Integer noThreads) 
	{
		PrimeTest primeTest;

		for (int i = 0; i < noThreads; i++) 
		{
			primeTest = new PrimeTest();
			primeTest.start();
		}
	}
	class PrimeTest extends Thread
	{
		public void run() 
		{
			Integer element;

			while (true) 
			{
				element = primes.get();

				if (checkPrime(element)) 
				{
					System.out.println(element + " is prime");
				} 
				else 
				{
					System.out.println(element + " is not prime");
				}
			}
		}
	}
}
