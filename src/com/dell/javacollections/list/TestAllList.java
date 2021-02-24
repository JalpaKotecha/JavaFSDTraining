package com.dell.javacollections.list;

import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestAllList {

	public static void main(String[] args) {
		// List as ArrayList :-
		//Array list : Internally it is back by dynamic array
		List <String> listOfCompanies = new ArrayList<String>();
		listOfCompanies.add("Dell");
		listOfCompanies.add("EMC");
		listOfCompanies.add("HCL");
		listOfCompanies.add("TFT");
		
		System.out.println(listOfCompanies);
			
		//List as Linkedlist
		List<String> listOfCities = new LinkedList<String>();
		listOfCities.add("Bengaluru");
		listOfCities.add("Delhi");
		listOfCities.add("Mumbai");
		listOfCities.add("Pune");
		
		System.out.println(listOfCities);
		System.out.println(listOfCities.get(1));
		
		//List as Vector
		List<String> listOfFruits = new Vector<String>();
		listOfFruits.add("Apple");
		listOfFruits.add("Grapes");
		listOfFruits.add("Orange");
		listOfFruits.add("Banana");
		
		System.out.println(listOfFruits);
		
		//Stack works as LIFO Order
		Stack<String> stackOfCoins = new Stack<String>();
		stackOfCoins.push("10 Rs.");
		stackOfCoins.push("5 Rs.");
		stackOfCoins.push("20 Rs.");
		stackOfCoins.push("30 Rs.");
		System.out.println(stackOfCoins.pop());
	}

}
