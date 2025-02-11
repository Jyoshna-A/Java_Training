package com.celcom.day6;

public class GarbageCollector {
	static int count;
	GarbageCollector()
	{
		count++;
		System.out.println(count);
	}
	protected void finalize()
	{
		count--;
		System.out.println(count);
	}
	
	public static void main(String[] args)
	{
		GarbageCollector obj1=new GarbageCollector();
		GarbageCollector obj2=new GarbageCollector();
		obj1=null;
	     System.gc();
		obj2=null;
		System.gc();
	}

}
