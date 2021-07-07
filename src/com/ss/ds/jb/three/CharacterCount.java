package com.ss.ds.jb.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;


public class CharacterCount {
	 public Path file;
	 public char find;

	    CharacterCount(Path file, char find){
	        this.file = file;
	        this.find = find;
	    }

	    public int count(){
	        int count = 0;
	        try(BufferedReader readFile = new BufferedReader(new InputStreamReader(Files.newInputStream(file)))){
	            String line = null;
	            while((line = readFile.readLine()) != null){
	                for(int i = 0; i < line.length(); i++){
	                    if(line.charAt(i) == find){
	                        count++;
	                    }
	                }
	            }
	        } catch (IOException x){
	            System.err.println(x);
	        }
	        return count;
	    }
	}

