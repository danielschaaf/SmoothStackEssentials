package com.ss.ds.jb.three;

import java.io.File;

public class GetDirectory {
	static void printDirectory(File[] array,int index,int directoryLevel) 
    {
        // this is the base case for my recursive method to print the directories 
		//and sub-directories all the way down to file level
        if(index == array.length)
            return;
          
        // this puts a tab space per level of directory.
        for (int i = 0; i < directoryLevel; i++)
            System.out.print("\t");
          
        // this gets the name of the file.
        if(array[index].isFile())
            System.out.println(array[index].getName());
          
        // this gets the name of the sub-directories
        else if(array[index].isDirectory())
        {
            System.out.println("[" + array[index].getName() + "]");
              
            // this keeps going to get all sub-directories in each level.
            printDirectory(array[index].listFiles(), 0, directoryLevel + 1);
        }
           
        // recursion for main directory
        printDirectory(array,++index , directoryLevel);
   }
}
