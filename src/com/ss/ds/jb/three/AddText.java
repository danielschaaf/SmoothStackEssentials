package com.ss.ds.jb.three;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AddText {	
	public static void addTextToFile(String fileName,String str){
		try {
		
			// opened the writer and made sure to close it out to save memory writing it.
			//also used a buffered writer for memory purposes
			BufferedWriter output = new BufferedWriter(	new FileWriter(fileName, true));
			output.write(str);
			// this line writes a new line so that any new append after will be on a new line.
			// instead of right after the last word or character in the file. 
			output.write("\n");
			//closes the writer
			output.close();
			}
		catch (IOException e) {
			System.out.println("exception occoured" + e);
		}
	}
}
