package com.ss.ds.jb.four;

public class ThreadDeadlocking{
	
	
	public static void main(String[] args) {
		final String firstLock= "First Lock";
		final String secondLock= "second Lock";
		Thread thread1= new Thread() {
			public void run() {
				synchronized(firstLock){
					System.out.println("thread 1: locked"+firstLock);
					try{
						Thread.sleep(100);
					}catch(Exception e) {
						e.printStackTrace();
					}
					synchronized(secondLock){
						System.out.println("thread 1: locked"+secondLock);
					}
				}
			}
		};
		
		Thread thread2 = new Thread() {
			public void run() {
				synchronized(secondLock){
					System.out.println("thread 2: locked"+secondLock);
					try{
						Thread.sleep(1000000);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				synchronized(firstLock){
					System.out.println("thread 2: locked"+firstLock);
				}
			}
		};
		thread1.start();
		thread2.start();
	}
	}

