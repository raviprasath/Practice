package practicetest;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input number: ");
		int input = sc.nextInt();
		sc.close();
		
		
		int sum = 0, copyOfInput = input;

		while(input != 0)
		{
			int remainder = input % 10;
			
			int quotient = input / 10;
			
			sum = sum + (int)(Math.pow(remainder, 3));
			
			input = quotient;
			
		}
		if(sum == copyOfInput)
		{
			System.out.println("Given "+copyOfInput+" number is a armstrong number");
		}
		else
		{
			System.out.println("Given "+copyOfInput+" number is not armstrong number");
		}
	}

}
