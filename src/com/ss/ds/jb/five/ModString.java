package com.ss.ds.jb.five;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ModString {

	public static void main(String[] args) {
		ModString ms = new ModString();
		String_Interface removeX = (l)-> l.stream().map(s->ModString.removeX(s)).collect(Collectors.toList());
		
		List<String> stringList = Arrays.asList("ax", "bb", "cx", "xxax", "xbxbx", "xxcx", "x");
		ms.handleList(stringList, removeX).forEach(e->System.out.println(e));
	
	
	}
	
	
	public List<String> handleList(List<String> list, String_Interface f) {
		//local method to utilize String_Interface
			return f.processList(list);
}
	public static String removeX(String s) {  
		StringBuffer sb = new StringBuffer(s);
		int i;
		
		i = sb.indexOf("x"); 
		
		while (i != -1) {  
			sb.deleteCharAt(i); 
			i = sb.indexOf("x");  
		}
		
		i = sb.indexOf("X");
		
		while (i != -1) { 
			sb.deleteCharAt(i); 
			i = sb.indexOf("X"); 
		}
		
		return sb.toString();
	}
}
