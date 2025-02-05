package com.celcom.day2;

public class TypesOfMethods 
{
	void m1()
	{
	System.out.println("Instance method invoked");	
	}
	static void m2()
	{
		System.out.println("Static method invoked");
	}
	public static void main(String[] args)
	{
		TypesOfMethods  a=new TypesOfMethods();
		
		a.m1();
		TypesOfMethods.m2();
		
		
	}
	

}
