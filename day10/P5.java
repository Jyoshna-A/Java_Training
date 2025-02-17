package com.celcom.day10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P5 {
public static void main(String[] args)
{
	List<Integer> lst=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	int j;
	while((j=sc.nextInt())!=-1)
	{
		lst.add(j);
	}
	System.out.println("Before Swapping "+lst);
	BubbleSort(lst);
	System.out.println("After Swapping "+lst);
	
	
}
static void InsertionSort(List<Integer> lst)
{
	for(int i=0;i<lst.size()-1;i++)
	{
		boolean swapped=false;
		for(int k=i+1;k>0;k--)
		{
			if(lst.get(k)<lst.get(k-1))
			{
				swap(lst,k,k-1);
				swapped=true;
			}
			if(!swapped)
			{
				break;
			}
		}
		
	}
}
static void BubbleSort(List<Integer> lst) {
    for (int i = 0; i < lst.size() - 1; i++) { 
        for (int k = 0; k < lst.size() - 1 - i; k++) {  
            if (lst.get(k) > lst.get(k + 1)) {
                swap(lst, k, k + 1);  
            }
        }
    }
}

static void swap(List lst,int i,int j)
{
	Object temp=lst.get(i);
	lst.set(i,lst.get(j));
	lst.set(j,temp);
	
}

}
