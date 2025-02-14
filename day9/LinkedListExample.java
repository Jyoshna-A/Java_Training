

package com.celcom.day9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class LinkedListExample 
{
	public static void main(String[] args )
	{
		List<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);	
		list.get(0);
		list.add(1,15);
		list.set(1, 50);
		list.remove(new Integer(10));  // here it will take method from Collection interface
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.contains(20));
		System.out.println(list.isEmpty());
		// Traverse with for loop
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		//Traverse with for each
		for(Integer i:list)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		//Traverse with Interfaces
		System.out.println("List Iterator Linkedlist ");
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
	}

}
