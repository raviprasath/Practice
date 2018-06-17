package practicetest;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GivenNumberFibonacciSeriesOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check given number is fibonacci series or not");
		int input = sc.nextInt();
		sc.close();
		
		
		if(input <= 0)
		{
			System.out.println("Enter the postive number to check the Fibonacci series number");
		}
		else
		{
			int a=0, b=1, c=0;
			
			List<Integer> myList = new LinkedList<Integer>();
			
			while(c<input)
			{
				c = a+b;
				a=b;
				b=c;
				myList.add(c);
			}
			
			System.out.println("Fibonacci series: "+myList);
			
			if(c==input)
				System.out.println("Given number "+input+" is Fibonacci series number");
			else
				System.out.println("Given number "+input+" is not in Fibonacci series number");
		}
	}

}
