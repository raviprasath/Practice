package practicetest;

import java.util.Scanner;

public class FloydTriangleS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the floyd triangle row size: ");
		int row = sc.nextInt();
		sc.close();

		int i, j, n = 1;

		for(i = 1; i<=row; i++)
		{
			for(j = 1; j<=i; j++)
			{
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	}

}
