package com.ss.ds.jb.four;

public class Singleton {
	 private volatile static Singleton sing = null;
	
	private Singleton(){}
	
	public static Singleton getInstance() {
		
		if(sing == null) {
			synchronized (Singleton.class) {
				if(sing == null) {
					sing = new Singleton();
				}
			}
		}
		return sing;
	}
	}

