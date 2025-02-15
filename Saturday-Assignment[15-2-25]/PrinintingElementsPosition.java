package com.celcom.Saturday2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrinintingElementsPosition {
	
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
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println("The Element Position is "+i+""+list.get(i));
			
		}
		
	}

}
