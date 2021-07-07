package com.ss.ds.jb.five;

import java.util.Arrays;
import java.util.List;

public class LambdaHelpers {
	//Static helper method
		public static int SortByLength(int a, int b)
		{
			return a - b;
		}
		
		public static int sortContainLetter(String letter) {
			return letter.contains("E")||letter.contains("e") ? 0:1;
		}
		
		
		public static void getStringNumber() {
			LambdaStream temp = new LambdaStream();
			System.out.println(temp.AppendtoNumber(Arrays.asList(1,2,3,5,4,99,44,33,55)));
		}
		
		public static void getWords() {
			LambdaStream temp = new LambdaStream();
			 System.out.println(temp.searchFor(Arrays.asList("this", "is", "a","fun","and","rewarding","project")));
		}
}
