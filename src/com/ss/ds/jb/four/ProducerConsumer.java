package com.ss.ds.jb.four;

import java.util.LinkedList;

public class ProducerConsumer {
	
		//create kist
		LinkedList<Integer> temp = new LinkedList<>();
		int capacity = 2;
		
		//called by producer
		public  void produceItem() throws InterruptedException
		{
			int value = 0;
			while(true)
			{
				synchronized(this)
				{
					//producer waits while full
					while(temp.size()==capacity)
						wait();
					
					System.out.println("Producer-" + value);
					
					//insert into list
					temp.add(value++);
					
					//notifies consumer
					notify();
					
					Thread.sleep(1000);
				}
			}
		}
		public void consumeItem() throws InterruptedException
		{
			while(true)
			{
				synchronized(this)
				{
					//waits while empty
					while(temp.size()==0)
						wait();
					
					//retrieve first job
					int val = temp.removeFirst();
					
					System.out.println("Consumer-" + val);
					
					//wake up producer
					notify();
					
					Thread.sleep(100);
				}
			}
		}
	}

	

