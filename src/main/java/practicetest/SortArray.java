package practicetest;

import java.util.*;

public class SortArray {

	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<String>();
		
		myList.add("o");
		myList.add("i");
		myList.add("a");
		myList.add("u");
		myList.add("e");
		
		System.out.println("Before Sorting: ");
		for (String s : myList) {
			System.out.println(s);
		}
		
		Collections.sort(myList);
		
		System.out.println("After Sorting: ");
		for (String s : myList) {
			System.out.println(s);
		}
		
		
		
		

	}

}
