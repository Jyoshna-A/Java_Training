package com.celcom.Saturday2;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class SortArrayList {
	public static void main(String[] args )
	{
		List<Integer> lst=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elments and give -1 when ever u wnat to stop adding elements ");
		int n;
		while((n=sc.nextInt())!=-1)
		{
			lst.add(n);
		}
		System.out.println(lst);
		for(int i=0;i<lst.size()-1;i++)
		{
			boolean swap=false;
			for(int j=i+1;j>0;j--)
			{
				if(lst.get(j)<lst.get(j-1))
				{
					swap(lst,lst.get(j),lst.get(j-1),j,j-1);
					swap=true;
				}
				if(!swap)
				{
					break;
				}
			}
		}
		System.out.println("The sorted list is "+lst);
	}
	static void swap(List l,int a,int b,int index1,int index2)
	{
		int temp = a;
        l.set(index1, b);
        l.set(index2, temp);
		
	}

}
