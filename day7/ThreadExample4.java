package com.celcom.day7;

class TwoTable extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("2 * "+i+" = "+(2*i));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class TenTable implements Runnable
{
	public synchronized void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.err.println("10 * "+i+" = "+(10*i));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExample4 {
	public static void main(String[] args) throws InterruptedException
	{
		TwoTable t1=new TwoTable();
		Thread t2=new Thread(new TenTable());
	
		System.out.println(t1.getState());
		System.out.println(t1.getName());
		System.out.println(t2.getState());
		System.out.println(t2.getName());
		t1.start();
		System.out.println("main 1");
		t1.join(); /// It is suspending the current thread(Main method) until the completion of invoking thread
		System.out.println("main 2");
		t2.start();
	}

}
