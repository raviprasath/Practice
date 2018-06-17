package practicetest;

import java.util.Scanner;

public class SumOfAllDigitsOfaNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input number: ");
		int input = sc.nextInt();
		
		sc.close();
		
		int sum = 0;
		
		while(input != 0)
		{
			int remainder = input % 10;
			
			int quotient = input / 10;
			
			sum = sum + remainder;
			
			input = quotient;
			
		}
		
		System.out.println("Sum of digits in given number is "+sum);

	}

}
