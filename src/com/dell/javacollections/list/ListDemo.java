package com.dell.javacollections.list;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		// List : Ordered collection with duplicate elements
		//List : Is an interface (List implementation classes : Arraylist, Linked list, Vector, Stack)
		/*List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		List<String> list3= new Vector<String>();
		List<String> list4 = new Stack<String>();*/
		
		List<String> nameList = new ArrayList<String>();
		
		//add data in array list
		nameList.add("john"); //Index 0
		nameList.add("Mike");
		nameList.add("William");
		nameList.add("David");
		nameList.add("William");
		nameList.add("Andy");
		System.out.println(nameList);
		System.out.println(nameList.get(3)); // Get element at specific index
		
		//remove element at given index
		System.out.println(nameList.remove(4));
		System.out.println(nameList);
		
		//Replace element
		nameList.set(1, "Kelly");
		System.out.println(nameList);
		
		//add at index - append value and other values will be shifted
		nameList.add(0, "Wilson");
		System.out.println(nameList);
		
		//Iteration over list
		// 1. Iteration by iterator
		Iterator<String> itr = nameList.iterator();
		while(itr.hasNext())
		{
			System.out.println("Name: -- " + itr.next());
		}
		System.out.println("--------------------------------");
		
		
		//2. For with counter
		for(int index=0 ; index<nameList.size(); index++)
		{
			System.out.println("Name: -- " + nameList.get(index));
		}
		System.out.println("--------------------------------");
		
		//3. Enhanced for loop
		for(String name : nameList)
		{
			System.out.println("Name: --" + name);
		}
		
	}

}
