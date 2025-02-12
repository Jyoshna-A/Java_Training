

package com.celcom.day7;


class MyThread1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread running");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExample2
{
	public static void main(String[] args) throws InterruptedException
	{
		
		Thread t1=new Thread(new MyThread1());
		t1.getState();
		t1.setName("T1");
		t1.getName();
		t1.getPriority();
		t1.start();
		Thread.sleep(3000);
	    System.out.println("MIAN END");
	    t1.suspend();
	    System.out.println(t1.getState());
	    t1.resume();
	}

}
