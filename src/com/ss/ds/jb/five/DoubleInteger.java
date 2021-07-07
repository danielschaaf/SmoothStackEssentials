package com.ss.ds.jb.five;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleInteger di = new DoubleInteger();
		NumbersInterface doubleInts = (m) -> m.stream().map(s -> 2*s).collect(Collectors.toList());
		List<Integer> myInts = Arrays.asList(10, 107, 5509, 310, 455); //sample list
		di.handleInts(myInts, doubleInts).forEach(e->System.out.println(e));
	}
	private List<Integer> handleInts(List<Integer> list, NumbersInterface i) { //local method to utilze NumbersInterface
		return i.processInts(list);
}
}
