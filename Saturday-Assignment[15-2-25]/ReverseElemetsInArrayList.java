package com.celcom.Saturday2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseElemetsInArrayList {
	public static void main(String[] args) throws CloneNotSupportedException
	{
		List<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elments and give -1 when ever u wnat to stop adding elements ");
		int n;
		while((n=sc.nextInt())!=-1)
		{
			list.add(n);
		}
		System.out.println(list);
		reverse(list);
		System.out.println("The reverse of ArrayList "+list);
		
	}
	static void reverse(List list)
	{
		int start=0;
		int end=list.size()-1;
		while(start<end)
		{
			swap(list,start,end);
			start++;
			end--;
		}
	}
	
	static void swap(List l,int index1,int index2)
	{
		Object temp =l.get(index1);
        l.set(index1, l.get(index2));
        l.set(index2, temp);
		
	}

}
