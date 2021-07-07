package com.ss.ds.jb.one;

public class Patterns {
	 static void rightTriangle(){
	        int col, star, row=4;   
	            
	        for(col=0; col<row; col++)   
	        {   
	         
	        for(star=0; star<=col; star++)   
	        {   
	        
	        System.out.print("* ");   
	        }   
	        
	        System.out.println();   
	        }   
	        System.out.println(". . . . . . . . .");

	}

	static void upsideDownRightTriangle(){
	    int col, star, row=4;      
	    System.out.println(". . . . . . . . . .");
	    for (col= row-1; col>=0 ; col--)  
	    {  
	    
	    for (star=0; star<=col; star++)  
	    {  
	    
	    System.out.print("*" + " ");  
	    }  
	    
	    System.out.println();
	    }  
	    }  
	 static void upFullTriangle(){ 
	        int i, j, row=7, bullets= 11;   
	      //Outer loop work for rows  
	        for (i=0; i<row; i=i+2)   
	        {  
	        //inner loop work for space      
	        for (j=row-i; j>1; j--)   
	        {  
	        //prints space between two stars  
	        System.out.print(" "); 
	        }
	        // prints space offset of stars 4 spaces
	        System.out.print("    ");
	        //inner loop for columns  
	        for (j=0; j<=i; j=j+1)   
	        {   
	        //prints star
	        
	        System.out.print("*"+" ");   
	        }   
	        //throws the cursor in a new line after printing each line  
	        System.out.println();   
	        }   
	        System.out.println(". . . . . . . . . . .");
	        
	    }
	    
	    static void upsideDownTriangle() {
	    	int rows=7;
	    	int bullets = 12;
	    	System.out.println();
	    	for(int h = 0; h < bullets;h++) {
	    		System.out.print("."+" ");
	    	}
	    	System.out.println();
	    	  
	    	for (int i= 0; i<= rows-1; i=i+2)  
	    	{  
	    	for (int j=0; j<=i; j++)  
	    	{  
	    	System.out.print(" ");
	    	}  
	    	System.out.print("   ");
	    	for (int k=0; k<=rows-1-i; k++)  
	    	{  
	    	System.out.print("*" +" ");  
	    	}  
	    	System.out.println();  
	    	}  
	    	}  
	    	
	    	
	    
	public static void main(String[] args) {
		System.out.println("1)");
		rightTriangle();
		System.out.println("2)");
		upsideDownRightTriangle();
		System.out.println("3)");
		upFullTriangle();
		System.out.println("4)");
		upsideDownTriangle();
	}

}
