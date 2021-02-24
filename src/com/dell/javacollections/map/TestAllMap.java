package com.dell.javacollections.map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestAllMap {

	public static void main(String[] args)
	{
		//Map deals with Key and Value pair
		//Key should be unique (Duplicate can't be added)
		Map<String, String> phoneBook = new HashMap<String, String>();
		phoneBook.put("John", "9343434334");
		phoneBook.put("Wilson", "9343434335");
		phoneBook.put("Karan", "9343434337");
		phoneBook.put("John", "9343434338");
		phoneBook.put(null, "9343434338"); //Can pass null key also
		System.out.println(phoneBook);
		
		//access data from map
		System.out.println(phoneBook.get("Karan"));
		
		//Iteration over map
		//1. fetch all keys
		
		Set <String>allKeys = phoneBook.keySet();
	//	System.out.println(allKeys);
		
		//2. use keys to get value
		for(String key : allKeys)
		{
		System.out.println(key + ": "+ phoneBook.get(key));
		}
		
		//HashTable - Synchronized in nature
		Map<String, Double> listOfItems = new Hashtable<String, Double>();
		listOfItems.put("Apple", 44.5);
		listOfItems.put("Banana", 44.5);
		listOfItems.put("Orange", 44.5);
		listOfItems.put("Oils", 124.50);
		System.out.println(listOfItems);
		
		//TreeMap
		//Items will be sorted by default (Ascending order)
		Map<Integer, String> listOfEmployee = new TreeMap<Integer, String>();
		listOfEmployee.put(101, "John Smith");
		listOfEmployee.put(102, "Mike Smith");
		listOfEmployee.put(103, "John Smith");
		listOfEmployee.put(104, "William Smith");
		System.out.println(listOfEmployee);
		//Iterator for TreeMap
		//Get a set of all entries
		Collection entrySet = listOfEmployee.entrySet();
		//Obtain an iterator for map entries
		Iterator itr = entrySet.iterator();
		
		//use while loop with iterator
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
