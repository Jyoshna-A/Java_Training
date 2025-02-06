package com.celcom.day3;



class Vehicle1
{
	String name="I am super class variable";
	Vehicle1()
	{
		System.out.println("I have super class constructor");
	}
	void noofEngine()
	{
		System.out.println("I have one engine");
	}
}

class TwoWheeler1 extends Vehicle1
{
//	TwoWheeler1()
//	{
////		super();
//	}
	void noOfWheels()
	{
		super.noofEngine();
		System.out.println("I have two wheels");
		System.out.println(super.name);
	}
}

public class SuperKeywordExample {
	
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		TwoWheeler1 obj=new TwoWheeler1();
		obj.noofEngine();
		
	}

}
