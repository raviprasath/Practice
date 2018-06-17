package practicetest;

import java.util.Scanner;

public class NumberWithoutGivenDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter the digit: ");
		int digit = sc.nextInt();
		
		sc.close();
		
		while(Integer.toString(number).contains(Integer.toString(digit)))
		{
			number--;
		}
		
		System.out.println("Largest number without given digit in given number "+number);
	}

}
