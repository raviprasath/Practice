package practicetest;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int a[] = {99,9,96,94,95};
		
		int big= Integer.MIN_VALUE;
		int secondBig = Integer.MIN_VALUE;
		
		for(int i = 0; i<a.length; i++)
		{
			if(big<a[i])
			{
				secondBig = big;
				big = a[i];
			}
			else if(big != a[i] && secondBig< a[i])
			{
				secondBig = a[i];
			}
		}

		System.out.println("First largest value in given array is "+big);
		
		System.out.println("Second largest value in given array is "+secondBig);
	}

}
