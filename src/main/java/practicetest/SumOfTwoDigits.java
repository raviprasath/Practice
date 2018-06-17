package practicetest;

import java.util.Scanner;

public class SumOfTwoDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first digit:");
		int firstDigit = sc.nextInt();

		System.out.println("Enter the second digit:");
		int secondDigit = sc.nextInt();

		sc.close();
		
		
		int sumOfTwoDigit = firstDigit + secondDigit;
		
		System.out.println("Sum of "+firstDigit+" and "+secondDigit+" is "+sumOfTwoDigit);
		
	}

}
