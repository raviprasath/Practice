package practicetest;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		Anagram.anagram("Madam", "madaM");

	}

	public static void anagram(String str1, String str2)
	{
		String s1 = str1.toLowerCase().replaceAll("\\s", " ");
		String s2 = str2.toLowerCase().replaceAll("\\s", " ");

		boolean status = true;

		if(s1.length() != s2.length())
		{
			status = false;
		}

		else
		{
			char[] array1 = s1.toCharArray();
			char[] array2 = s2.toCharArray();
			Arrays.sort(array1);
			Arrays.sort(array2);
			status = Arrays.equals(array1, array2);
		}

		if(status)
			System.out.println(str1+" and "+str2+" are anagram");
		else
			System.out.println(str1+" and "+str2+" are not anagram");
	}
}
