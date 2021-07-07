package com.ss.ds.jb.two;
import java.util.Arrays;
public class MaxNumberFinder {
	 static int[] findMax(int matrix[][])
	 {
		// Initialize what the max number is.
		int max = Integer.MIN_VALUE;
		int[] position = new int[2]; 
		// figure out the number of rows and columns in the 2d array;
		int row = matrix.length;
		int col = matrix[0].length;
		//check each number in the 2d array.
		//if it is greater then the previous max then we
		//update the max
		 for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                if (matrix[i][j] > max) {
	                    max = matrix[i][j];
	                    position[0]= i;
	                    position[1]= j;
	                    
	                }
	            }
	           
	        }
	 
		 	
		 return position;
		 
	    }
	 
	     
	    // Driver code
	    public static void main(String args[])
	    {
	           // matrix
	        int matrix[][] = { { 1, 4, 3, 5 },
	                          { 2, 6, 7, 8 },
	                          { 9, 10, 11, 12 },
	                          { 4, 14, 15, 16 }, 
	                          { 5, 13, 88, 44}};
	 
	        System.out.println("the position of the max number is  "+Arrays.toString(findMax(matrix))+" where the first number is the row and the second number is column.") ;
	        
	   
	    }


		
}


