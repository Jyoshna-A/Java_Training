package com.celcom.day3;


class A
{
	A()
	{
		System.out.println("Super class Constructor");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Sub class Constructor");
	}
}
public class SuperKeywordExample1 
{
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		A obj =new B();
		
	}

}
