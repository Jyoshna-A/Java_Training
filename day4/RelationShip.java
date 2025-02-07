package com.celcom.day4;


class VehicleA
{
	void engine()
	{
		System.out.println("All vehicles has a  engine");
	}
	void wheels()
	{
		System.out.println("All vehicles has wheels");
	}
}
class Wheels 
{
	void wheelModel()
	{
		System.out.println("Wheel model is MRF");
	}
	
	void noOfWheeels(String vehicleType)
	{
		if(vehicleType.equals("Two Wheeler"))
		{
			System.out.println("I have two Wheels");
		} else if(vehicleType.contentEquals("Four Wheeler"))
		{
			System.out.println("I have Four Wheels");
		}
		
	}
}

class Engine 
{
	void engineModel()
	{
		System.out.println("Engine model is XYZ");
	}
	}

class CarA extends VehicleA     // IS-A Relationship
{
	Wheels wheel=new Wheels();
	Engine engine=new Engine();
	//HAS A Relationship
	void engineModel()
	{
		engine.engineModel();
	}
	void wheelModel()
	{
		wheel.wheelModel();
	}
	void noOfWheels()
	{
		wheel.noOfWheeels("Four Wheeler");;
	}	
}

public class RelationShip {
	public static void main(String[] args)
	{
		CarA car=new CarA();
		car.engine();
		car.engineModel();
		car.wheels();
		car.wheelModel();
		car.noOfWheels();
	}

}
