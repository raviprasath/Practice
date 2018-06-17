package practicetest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElementInArrayList {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<String>();
		
		myList.add("Apple");
		myList.add("Orange");
		myList.add("Bee");
		myList.add("Orange");
		myList.add("Apple");
		myList.add("Bee");
		
		System.out.println("Before removing duplicate elements "+myList);
		
		Set<String> mySet = new HashSet<String>(myList);
		
		System.out.println("After removing duplicate elements "+mySet);
		

	}

}
