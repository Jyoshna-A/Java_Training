


package com.celcom.day9;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
public class StackExample {
	public static void main(String[] args)
	{
		//LIFO
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.peek();
		System.out.println(stack.peek());
		
		
	}

}
