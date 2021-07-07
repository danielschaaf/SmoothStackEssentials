package com.ss.ds.jb.five;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {

	public static void main(String[] args) {
		RightDigit i = new RightDigit();
		NumbersInterface rightDigits = (m) -> m.stream().map(s -> s % 10).collect(Collectors.toList()); 
		
		List<Integer> myInts = Arrays.asList(101, 102, 209, 310, 455); //sample list
		
		i.handleInts(myInts, rightDigits).forEach(e->System.out.println(e));

	}
	
	private List<Integer> handleInts(List<Integer> list, NumbersInterface i) { //local method to utilize 
		   // NumbersInterface
			return i.processInts(list);
}
}
