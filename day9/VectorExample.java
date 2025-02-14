

package com.celcom.day9;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
public class VectorExample
{
	public static void main(String[] args )
	{
		
		//Initial capacity,Increment factor
		Vector<Integer> vec=new Vector<>(3,2);
		System.out.println(vec.size());          //SIZE 0
		System.out.println(vec.capacity());      //CAPACITY 3
		
		vec.add(10);
		vec.add(20);
		vec.add(30);
		System.out.println(vec.size());          //SIZE 3
		System.out.println(vec.capacity());      //CAPACITY 3
		vec.add(40);
		System.out.println(vec.size());          //SIZE 4
		System.out.println(vec.capacity());      //CAPACITY 5(Once it is full it will increase the capacity by the argument which is passed
        //Way 1
		
		for(int i=0;i<vec.size();i++)
		{
			System.out.println(vec.get(i));
		}
		//Way 2
		
		for(Integer i:vec)
		{
			System.out.println(i);
		}
		
		//Way 3
		Enumeration<Integer> e=vec.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}

}
