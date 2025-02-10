package com.celcom.day5;


abstract class Vehicle
{
	 int a;
	 Vehicle()
	{
		
	}
	  void noOfEngine()
	{
		System.out.println("I have one Engine");
	}
	abstract  void noOfWheels();
	
	abstract void brandName();
	
	
}


class Car extends Vehicle
{
 void noOfWheels()
 {
	 System.out.println("I have four wheels");
 }
	
	void brandName()
	{
		System.out.println("My brand name Benz");
	}
	
}
public class AbstractClasExample1 
{
 public static void main(String[] args)
 {
	 Vehicle v=new Car();
	 v.noOfEngine();
	 v.noOfWheels();
	 v.brandName();
 }
}
