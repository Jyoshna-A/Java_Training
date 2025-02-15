package com.celcom.Saturday2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedlIstExample {
	public static void main(String[] args) throws CloneNotSupportedException
	{
		List<Integer> list=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elments and give -1 when ever u wnat to stop adding elements ");
		int n;
		while((n=sc.nextInt())!=-1)
		{
			list.add(n);
		}
		System.out.println(list);
		
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}

}
