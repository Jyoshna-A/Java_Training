package com.celcom.day5;

import java.util.Scanner;
class Shape
{
	float length,breadth;
	void getArea(float length,float breadth)
	{
	
	}
}
class R extends Shape
{
	int a;
	void getArea(float length,float breadth)
	{
		System.out.println("The Area is "+(length*breadth));
	}
}
public class Assignment10 
{ 
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		float length=sc.nextFloat();
		
		System.out.println("Enter the Breadth");
		float breadth=sc.nextFloat();
		Shape s=new R();
		s.getArea(length,breadth);
		
		
	}

}
