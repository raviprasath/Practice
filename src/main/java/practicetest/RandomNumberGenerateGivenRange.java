package practicetest;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerateGivenRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the minimum range of Random number: ");
		int minRange = sc.nextInt();
		
		System.out.println("Enter the maximum range of Random number: ");
		int maxRange = sc.nextInt();
		sc.close();
		
		Random rand = new Random();
		
		//If suppose use only maximum range
		for(int i=0; i<=10; i++)
		{
		System.out.println(rand.nextInt(maxRange));
		}

		//If suppose range
		int value = rand.nextInt(maxRange - minRange) + minRange;
		System.out.println("Random number within given range: "+value);
		
	}

}
