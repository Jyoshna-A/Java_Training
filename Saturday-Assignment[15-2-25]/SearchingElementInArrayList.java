package com.celcom.Saturday2;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class SearchingElementInArrayList 
{
   public static void main(String[] args )
   {
	   List<Integer> lst=new ArrayList<>();
	   Scanner sc=new Scanner(System.in);
	  
	   System.out.println("Enter the elements and enter -1 if u wnat to stop adding");
	   int i;
	   while((i=sc.nextInt())!=-1)
	   {
		   lst.add(i);
	   }
	   System.out.println(lst);
	   System.out.println("Enter the element to search");
	   int search=sc.nextInt();
	   Iterator<Integer> it=lst.iterator();
   while(it.hasNext())
		{
		   if(it.next()==search)
		   {
			   System.out.println("Element found ");
		   }
		}
	   
   }
}
