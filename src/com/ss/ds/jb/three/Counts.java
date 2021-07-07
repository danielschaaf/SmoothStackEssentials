package com.ss.ds.jb.three;


import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Counts {
	
	public static void main(String[] args) throws IOException {
		String fileName ="C:\\Users\\Danie\\git\\AssignmentsForSmoothStack\\resources\\testingCountprogram.txt";
		Path pathToFile = Paths.get(fileName);
		String s = args[0];
		char character = s.charAt(0);
		CharacterCount countChar = new CharacterCount(pathToFile, character);
		System.out.println("the character "+s.toUpperCase() +" shows up "+countChar.count()+" times in this document.");
    }
		
	}


