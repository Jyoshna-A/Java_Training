package com.celcom.day3;
@SuppressWarnings("unused")
class A3
{
	A3()
	{
		System.out.println("Super class Constructor");
	}
	A3(int a)
	{
		System.out.println("Super class parameterized  Constructor");
	}
}
@SuppressWarnings("unused")
class B3 extends A3
{
	B3()
	{
		this(10);
		System.out.println("Sub class Constructor");
	}
	B3(int a)
	{
		super(12);
		System.out.println("Sub class paramterized Constructor");
	}
}
public class SuperKeywordExample4
{
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
				B3 obj =new B3();
		
	}

}
