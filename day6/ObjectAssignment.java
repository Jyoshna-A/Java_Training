package com.celcom.day6;

public class ObjectAssignment 
{
	public static void main(String[] args)
	{
		ObjectAssignment obj1=new ObjectAssignment();
		System.out.println(obj1.hashCode());
		ObjectAssignment obj2;
		obj2=obj1;
		System.out.println(obj2.hashCode());
	}

}
