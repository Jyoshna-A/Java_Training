package com.celcom.day7;

public class ThreadExample {
	public static void main(String[] args)
	{
		Thread t=Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
	}

}
