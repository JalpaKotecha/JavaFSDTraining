package com.dell.javacollections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollectionTest {

	public static void main(String[] args) {
		//Set  : A collection of Unique Elements
		// Implementation classes : HashSet, LinkedHashSet, TreeSet
		//1. HashSet : Uses hash code of the object to store values
		//Hash set allows you to add only unique values - Duplicate values will not be added
		//Insertion order will not be preserved here
		Set <String> listOfCompanies = new HashSet<String>();
		listOfCompanies.add("Dell");
		listOfCompanies.add("Wipro");
		listOfCompanies.add("TFT");
		listOfCompanies.add("Dell");
		System.out.println(listOfCompanies);
		
		//2. LinkedHashSet : It stores unique values with insertion order
		//Index of methods are not there so can't get specific element. 
		Set <String> listOfUniqueCities = new LinkedHashSet<String>();
		listOfUniqueCities.add("Delhi");
		listOfUniqueCities.add("Bangalore");
		listOfUniqueCities.add("Mumbai");
		listOfUniqueCities.add("Delhi");
		listOfUniqueCities.add("Pune");
		listOfUniqueCities.add("delhi");
		System.out.println(listOfUniqueCities);
		System.out.println(listOfUniqueCities.getClass());
		
		
		//3. TreeSet : It stores unique value with ascending ordered data collection. i.e Sorted set
		TreeSet <String> listOfUniqueNames = new TreeSet<String>();
		listOfUniqueNames.add("John");
		listOfUniqueNames.add("Abraham");
		listOfUniqueNames.add("Brayan");
		listOfUniqueNames.add("Wilson");
		System.out.println(listOfUniqueNames);
		System.out.println(listOfUniqueNames.descendingSet()); //Convert namelist into descending order
		
	}

}
