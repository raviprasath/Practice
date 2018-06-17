package practicetest;

public class SumOfFirst10PrimeNumber {

	public static void main(String[] args) {
		
		int number = 2, count=0, sum=0;
		
		while(count<10)
		{
			if(isPrimeNumber(number))
			{
				sum+=number;
				count++;
			}
			number++;
		}
		System.out.println("Sum of first 10 prime number is "+sum);
	}

	public static boolean isPrimeNumber(int number)
	{
		for(int i=2; i<number/2; i++)
		{
			if(number%i == 0)
			{
				return false;
			}
		}
		return true;
		
	}
}
