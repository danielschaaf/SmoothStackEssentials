package com.ss.ds.jb.three;

import java.io.File;

public class DirectoryPrinter {

	public static void main(String[] args) {
		// please change the full path for the directory
		String directory = "D:\\Java";
		//this makes the new file with the Directory inside it.
		File mainDir = new File(directory);
		// this sets up the array of directories and sub-directories to pass into my recursive print method.
		if(mainDir.exists() && mainDir.isDirectory()) {
			File array[]= mainDir.listFiles();
			System.out.println("Here are the Files from the Directory : "+ mainDir);
			System.out.println("_____________________________________________________________________________________________________________");
			
			GetDirectory.printDirectory(array,0,0);
		}
	}

}
