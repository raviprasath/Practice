package practicetest;

public class PrintNumberWithoutLoops {

	public static void main(String[] args) {
		printNumber(1);
	}

	public static void printNumber(int number)
	{
		if(number<=10)
		{
			System.out.println(number);
			number++;
			printNumber(number);
		}
		else
			System.exit(0);
	}
}
