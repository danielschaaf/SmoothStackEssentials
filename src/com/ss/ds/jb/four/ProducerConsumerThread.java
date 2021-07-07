package com.ss.ds.jb.four;


public class ProducerConsumerThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ProducerConsumer producerConsumer = new ProducerConsumer();
		Thread producer = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					producerConsumer.produceItem();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		});
		Thread consumer = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					producerConsumer.consumeItem();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		});
		producer.start();
		consumer.start();
		
		producer.join();
		consumer.join();
}
	
}
