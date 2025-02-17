package com.celcom.day10;



class Resource1
{
	private int food;
	int getFood()
	{
		return food;
	}
	 void setFood(int food)
	{
		this.food=food;
	}
}
class Consumer extends Thread
{
	Resource1 resource;
	Consumer(Resource1 resource)
	{
		this.resource=resource;
	}
	public void run()
	{
		synchronized(resource)
		{
			
			try {
				System.out.println("Consuming the food");
				resource.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Food leftover after consuming : "+(resource.getFood()-1));
		}
	}
	
}
class Producer extends Thread
{
	Resource1 resource;
	Producer(Resource1 resource)
	{
		this.resource=resource;
	}
	public void run()
	{
		synchronized(resource)
		{
			System.out.println("Producing the food");
			resource.setFood(10);
			resource.notify();
		}
	}
}
public class p2 {
	public static void main(String[] args) throws InterruptedException 
	{
		Resource1  resource1 = new Resource1();
		Consumer c=new Consumer(resource1);
		
		c.start();
		Thread.sleep(2000);
		Producer p = new Producer(resource1);
		p.start();

	}
	

}
