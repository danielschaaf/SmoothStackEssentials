package com.ss.ds.jb.two;

public class AddingValues {
	 public static boolean isInteger(String string) {
	      boolean isValid = false;
	      try
	      {
	         Integer.parseInt(string);
	 
	         // s is a valid integer
	 
	         isValid = true;
	      }
	      catch (NumberFormatException e)
	      {
	         // string is not an integer
	      }
	 
	      return isValid;
	   }
	public static void main(String[] args) {
		Integer sum = 0;
		// loops thru the args and adds them up if they are integers. if they are strings it doesnt do anything with them.
		for(int i = 0; i < args.length; i++) {
			if(isInteger(args[i])) {
				sum+= Integer.parseInt(args[i]);
			}
		}
		System.out.println("the sum is "+ sum);
		
	}

}
