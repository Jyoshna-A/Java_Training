package com.celcom.day5;


 interface VehiclePlan1
{
	void noOfEngine();
	void noOfWheels();
	void brandName();
	
	
	
}
 
 interface VehiclePlan2
{
	void noOfEngine();
	void noOfWheels();
	void brandName();
	
	
	
}
abstract class Vehicle56 implements VehiclePlan1,VehiclePlan2 
{
	
	public void noOfEngine()
	{
		System.out.println("I have one Engine");
	}
}

class Car1 extends Vehicle56
{
	public void noOfWheels()
	{
		System.out.println("I have four wheels ");
	}
	
	public void brandName()
	{
		System.out.println("My brand name benz");
	}

}
public class Interface_Example2_Implementing_Multiple_Interfaces {
	public static void main(String[] args)
	{
		VehiclePlan1 v= new Car1();
		v.brandName();
	}

}

