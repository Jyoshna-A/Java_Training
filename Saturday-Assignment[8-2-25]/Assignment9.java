package com.celcom.day5;


class Vehicle
{
	int a=20;
	protected void drive()
	{
		System.out.println("We will drive a Vehicle");
		
	}
}
class Car extends Vehicle
{ int a=15;
	public void drive()
	{
		System.out.print(a);
		System.out.println("Repairing a car");
	}
	
}
public class Assignment9 {
	public static void main(String[] args)
	{
		Vehicle v=new Car();
		System.out.println(v.a);
		v.drive();
		
		
	}

}
