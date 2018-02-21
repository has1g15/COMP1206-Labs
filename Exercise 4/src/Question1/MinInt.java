package Question1;

public class MinInt {

	int[] arr = {24, 52, 74, 9, 34, 23, 64, 34};
	
	public static void main (String[] args)
	{
		MinInt m = new MinInt();
		System.out.println("Minimum is :" + m.findMin(0));
	}

	public int findMin(int ind)
	{
		int minimum = 0;
		//If the index passed into the method is the same as the maximum index of the
		//array, the last value is returned 
		if (ind == ((arr.length)-1))
		{
			return arr[ind];
		}
		//Method is called recursively 
		minimum = findMin(ind + 1);
		//If the number that already exists as the minimum is less than the number
		//in the array that it's being compared to, it's returned 
		if (minimum < arr[ind])
		{
			return minimum;
		}
		//Otherwise the new number is returned at the minimum 
		else
		{
			return arr[ind];
		}
	}
}
