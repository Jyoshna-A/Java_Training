package com.celcom.day10;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;
public class P1 {
	public static void main(String[] args)
	{
		List<Object> lst=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int i;
		while((i=sc.nextInt())!=-1)
		{
			lst.add(i);
		}
		List<Object> linkedlst=new LinkedList<>(lst);
		Iterator<Object> it=linkedlst.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
