package practicetest;

import java.util.Scanner;

public class MathMatrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the row size in matrix: ");
		int row = sc.nextInt();
		
		System.out.println("Enter the column size in matrix: ");
		int column = sc.nextInt();

		int[][] matrix = new int[row][column];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++)
			{
				System.out.println("Enter "+i+" and "+j+" position value ");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

		sc.close();
	}

}
