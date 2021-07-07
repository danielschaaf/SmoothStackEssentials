/**
 * 
 */
package com.ss.ds.jb.five;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;


/**
 * @author Daniel Schaaf
 *
 */
public class Lambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String [] months = {"January","February","March","April","May","June","July","August","September","October","December"};
	//here is my assending lambda function to sort strings by length
	 Arrays.sort(months,
	            (String min, String max) -> min.length() - max.length());
	 System.out.println(Arrays.toString(months));
	 
	 System.out.println();
	
	 // here is my Decending way of sorting strings by length
	 Arrays.sort(months,
	            (String min, String max) -> max.length() - min.length());
	 System.out.println(Arrays.toString(months));
	 System.out.println();
	 // lambda sorted by first character in string.
	 Arrays.sort(months,
	            ( String a, String z) -> a.charAt(0) - z.charAt(0));
	 System.out.println(Arrays.toString(months));
	 
	 System.out.println();
	 // lambda to pull all strings that have a letter E first in the array.
	 
	 Arrays.sort(months, Comparator.comparingInt(letter -> (letter.contains("E") || letter.contains("e") ? 0 : 1)));
	 System.out.println(Arrays.toString(months));
	 System.out.println();
	 // sort with a given letter using a helper method
	 Arrays.sort(months,(a,b)-> LambdaHelpers.SortByLength(a.length(), b.length()));
	 System.out.println("Sorting using helper methods");
	 System.out.println(Arrays.toString(months));
	 System.out.println();
	 // descending order with helper method
	 Arrays.sort(months,(a,b)-> LambdaHelpers.SortByLength(b.length(), a.length()));
	 System.out.println("Sorting using helper methods reverse");
	 System.out.println(Arrays.toString(months));
	 System.out.println();
	 Arrays.sort(months,(a,b)-> LambdaHelpers.SortByLength(a.charAt(0), b.charAt(0)));
	 System.out.println("Sorting using helper methods by first letter");
	 System.out.println(Arrays.toString(months));
	
	 System.out.println();
	 Arrays.sort(months, Comparator.comparing(a -> LambdaHelpers.sortContainLetter(a)));
	 System.out.println("Sorting using helper method by containing E");
	 System.out.println(Arrays.toString(months));
	 System.out.println();
	 
	 // element should be preceded by the letter 'e' if the number is even, and preceded by the letter 'o' if the number is odd. 
	 LambdaHelpers.getStringNumber();
	 System.out.println();
	 // this method will return any word in the list that starts with an a and is exactly 3 letters in length.
	 LambdaHelpers.getWords();
	 
	 
	 
	
	}
	
		
}
