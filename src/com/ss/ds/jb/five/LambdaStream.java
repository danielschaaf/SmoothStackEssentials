package com.ss.ds.jb.five;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaStream {
	public String AppendtoNumber(List<Integer> list) {
		return list.stream().map(number -> number % 2 == 0 ? "e" + number : "o" + number)
				.collect(Collectors.joining(","));
	}
	// this method searches a list of strings for words that start with a and are exactly 3 letters in length.
	public List<String> searchFor(List<String> list){
		return list.stream()
				  .filter(word -> word.startsWith("a")).filter(word -> word.length() == 3)
				  .collect(Collectors.toList());
		
		
		
	}
	
	
	
	
}
