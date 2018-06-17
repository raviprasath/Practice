package practicetest;

import java.util.Arrays;

public class EqualityOfTwoArray {

	public static void main(String[] args) {
		
		int[] array1 = {1,2,3,4,5,6,7};
		
		int[] array2 = {1,2,3,4,5,6,7,8};
		
		int[] array3 = {1,2,3,4,5,6,7};

		
		String[] array4 = {"a","b","c","d"};
		
		String[] array5 = {"a","b","c","d"};
		
		System.out.println("array1 and array2 is equal? "+Arrays.equals(array1, array2));
		
		System.out.println("array1 and array3 is equal? "+Arrays.equals(array1, array3));
		
		System.out.println("array4 and array5 is equal? "+Arrays.equals(array4, array5));
	}

}
