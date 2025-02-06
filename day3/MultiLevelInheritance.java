package com.celcom.day3;
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
class Bike extends TwoWheeler
{
	void brandname()
	{
		System.out.print("My brand name is Honda");
	}
}


public class MultiLevelInheritance 
{
	public static void main(String[] args)
	{
	Bike obj=new Bike();
	obj.noofEngine();
	obj.noOfWheels();
	obj.brandname();
	}
}
