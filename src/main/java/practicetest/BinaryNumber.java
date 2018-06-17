package practicetest;

import java.util.Scanner;

public class BinaryNumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input number: ");
		int input = sc.nextInt();
		
		sc.close();
		
		
		BinaryNumber obj = new BinaryNumber();
		
		System.out.println("The input "+input+" is binary? "+obj.isBinaryNumber(input));

		
	}
	
	
	public boolean isBinaryNumber(int input)
	{
		boolean status = true;
		
		while(true) {
			if(input == 0)
			{
				break;
			}
			else
			{
				int tmp = input % 10;
				if(tmp>1) {
					status = false;
					break;
				}
				input = input / 10;
			}
		}
		
		return status;
		
	}

}
