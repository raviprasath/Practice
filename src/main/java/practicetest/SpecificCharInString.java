package practicetest;

public class SpecificCharInString {

	public static void main(String[] args) {
		
		String str = "Welcome";
		
		
		//System.out.println("4th Char in Welcome is "+str.charAt(3));
		
		for(int i= 0; i<=str.length();i++) {
			System.out.println(i+" Index Value in Welcome is: "+str.charAt(i));
			i++;
		}
		
		
		
		
		//System.out.println("4th Char in Welcome is "+str.substring(4,5));
		

	}

}
