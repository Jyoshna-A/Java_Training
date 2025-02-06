package com.celcom.day3;


class Vehicle
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


public class InheritanceExample1 
{
	
	public static void main(String[] args)
	{
		TwoWheeler obj=new TwoWheeler();
		obj.noofEngine();
		obj.noOfWheels();
	}

}
