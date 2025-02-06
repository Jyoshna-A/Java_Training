package com.celcom.day3;

class A2
{
	A2()
	{
		System.out.println("Super class Constructor");
	}
	A2(int a)
	{
		System.out.println("Super class parameterized  Constructor");
	}
}
class B2 extends A2
{
	B2()
	{
		System.out.println("Sub class Constructor");
	}
	B2(int a)
	{
		super(12);
		System.out.println("Sub class paramterized Constructor");
	}
}
public class SuperKeywordExample3
{
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		B2 obj =new B2(10);
		
	}

}
