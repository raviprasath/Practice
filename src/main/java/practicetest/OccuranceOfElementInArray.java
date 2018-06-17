package practicetest;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;

public class OccuranceOfElementInArray {

	public static void main(String[] args) {
		
		
		String[] strArray = {"India","Pakistan","France","Canada","USA","UK","India"};
		
		List<String> myList = Arrays.asList(strArray);
		
		Set<String> setVal = new TreeSet<String>(myList);
		
		
		System.out.println("Occurance of each element in array: ");
		for (String s : setVal) {
			
			System.out.println(s+" occurance in given Array is "+Collections.frequency(myList, s));
			
		}
	}

}
