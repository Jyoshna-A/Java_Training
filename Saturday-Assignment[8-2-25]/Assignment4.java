package com.celcom.day5;
import java.util.Scanner;
class Circle
{
	float radius;
	void setradius(float radius)
	{
		this.radius=radius;
	}
	void area()
	{
		System.out.println(3.14*radius*radius);
	}
	void perimeter()
	{
		System.out.print(2*3.14*radius);
	}
}
public class Assignment4 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		System.out.println("Enter the radius");
	    float radius=sc.nextFloat();
		c.setradius(radius);
		c.area();
		c.perimeter();
		
	}

}
