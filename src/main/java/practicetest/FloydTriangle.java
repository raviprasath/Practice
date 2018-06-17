package practicetest;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Floyd triangle rows:");
		int rows = sc.nextInt();
		
		sc.close();
		
		int n =1,i,j;
		
		for(i = 1; i<=rows; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(n+" ");
				n++;
			}
		System.out.println();
		}
		
	}

}
