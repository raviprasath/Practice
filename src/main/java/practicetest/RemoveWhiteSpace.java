package practicetest;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String str = "Good - evening - Ravi123$";
		System.out.println("Before removing white space: "+str);
		
		String replaceAll = str.replaceAll("\\s", "");
		System.out.println("After removing white space: "+replaceAll);
		
		
		
		//d = removing numbers
		//D = only printing numbers
		//s = removing spaces
		//w = remove char and numbers
		//W = remove special char and numbers
		
	}

}
