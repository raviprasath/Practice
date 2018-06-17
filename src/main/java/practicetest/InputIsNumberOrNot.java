package practicetest;

import java.util.Scanner;

public class InputIsNumberOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the input value");
		String str = sc.next();
		sc.close();

		InputIsNumberOrNot obj = new InputIsNumberOrNot();

		System.out.println("Entered input "+str+" is number? "+obj.inputNumber(str));

	}

	public boolean inputNumber(String str)
	{
		try {
			Integer.parseInt(str);
		} 
		catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
