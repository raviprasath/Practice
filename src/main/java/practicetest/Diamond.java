package practicetest;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the row count of diamond");
		int row = sc.nextInt();
		
		System.out.println("Enter the symbol of Diamond");
		char symbol = sc.next().charAt(0);

		sc.close();
		
		System.out.println("Diamond here: ");
		//Upper Triangle
		for( int i=1; i<=row; i++)
		{
			for(int j=1; j<=row-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=2*i - 1; j++)
			{
				System.out.print(symbol);
			}
			System.out.println();
		}
		
		//Lower Triangle
		for( int i=row - 1; i>0; i--)
		{
			for(int j=1; j<=row-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=2*i - 1; j++)
			{
				System.out.print(symbol);
			}
			System.out.println();
		}
		
		
	}

}
