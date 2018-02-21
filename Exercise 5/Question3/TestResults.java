package Question3;

import java.util.List;

public class TestResults implements Runnable{

	List<Integer> numbers;
	
	public TestResults(List<Integer> numbers)
	{
		this.numbers = numbers;
	}
	
	@Override
	public void run() 
	{
		//Every element in the sublist from the vector is passed into 
		//the IsPrime class and tested
		for (Integer num: numbers)
		{
			if (IsPrime.checkPrime(num.intValue()))
			{
				System.out.println(num + " is a prime number");
			}
			else
			{
				System.out.println(num + " is not a prime number");
			}
		}
	}
}
