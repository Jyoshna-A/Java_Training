package com.celcom.day3;

public class ThisMethodConstructor 
{
	ThisMethodConstructor()
	{
		this("ram");
		System.out.println("A");
	}
	ThisMethodConstructor (String name)
	{
		this(10);
		System.out.println("B");
	}
	ThisMethodConstructor (int num)
	{
		System.out.println("C");
	}
	
	public static void main()
	{
		ThisMethodConstructor  a =new ThisMethodConstructor();
	}

}
