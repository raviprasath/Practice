package practicetest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {
		
		DuplicateCharInString obj = new DuplicateCharInString();
		
		obj.duplicateChar("RaviprasathR");

	}

	public static void duplicateChar(String str)
	{
		
		Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
		
		char[] charArray = str.toCharArray();
		
		for (char c : charArray) {
			
			if(dupMap.containsKey(c))
			{
				dupMap.put(c, dupMap.get(c)+1);
			}
			
			else
				dupMap.put(c, 1);
		}
		
		
		Set<Character> keys = dupMap.keySet();
		
		for (Character c : keys) {
			if(dupMap.get(c)>1)
			{
				System.out.println(c+" is in given string "+dupMap.get(c));
			}
		}
		
	}
}
