package com.celcom.day2;

public class InstanceVsStatic 
{
	int a=10;
	static int b=30;
	public static void main(String[] args)
	{
		
		InstanceVsStatic obj1=new InstanceVsStatic ();
		InstanceVsStatic obj2=new InstanceVsStatic ();
		//INTANSE VARIABLE OR OBJECT VARIABLE
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		obj1.a=20;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		//STATIC
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		obj1.b=40;
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
	}
}
