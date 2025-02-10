package com.celcom.day5;



interface One
{
	int a=10;  
}

interface Two
{
	int b=20;
}
interface Three extends One,Two
{
	void addition();
	
}
class Addition implements Three
{
	
	public void addition()
	{
		int a=One.a;
		int b=Two.b;
		System.out.println("The addition of two numbers is "+(a+b));
	}
	
	
}
public class Interface_Example_3_Interface_extends {
	public static void main(String[] args)
	{
	Three three=new Addition();
	three.addition();
	}

}
