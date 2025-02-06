package com.celcom.day3;
 Vehicle
{
	void noofEngine()
	{
		System.out.println("I have one engine");
	}
}

class TwoWheeler extends Vehicle
{
	void noOfWheels()
	{
		System.out.println("I have two wheels");
	}
}
class Bike extends TwoWheeler
{
	Bike()
	{
		System.out.println("bye");
	}
	void brandname()
	{
		System.out.print("My brand name is Honda");
	}
}
class Scooty extends TwoWheeler
{
	void brandname()
	{
		System.out.print("My brand name is Activa");
	}
}


public class HierarchialInheritance 
{
	public static void main(String[] args)
	{
	Scooty obj=new Scooty();
	obj.noofEngine();
	obj.noOfWheels();
	obj.brandname();
	}
}
