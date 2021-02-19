package com.dell.String;

public class stringComparison {
public static void main(String[] args)
{
	//String comparison
	//1. equals() 2. == operator 3. comparteTo()
	String str1 = "Hello";
	String str2 = "Hello";
	String str3 = new String("Test");
	String str4 = new String("Test");
	String strcomp1 = "John";
	String strcomp2 = "Mike";
	String strcomp3 = "John";
				
	//.equals()  - Compares content of the strings
	if(str1.equals(str2))
	{
		System.out.println("Matches: " + (str1.equals(str2))); //This will give boolean value as "true" if it matches
	}
	if(str3.equals(str4))
	{
		System.out.println("Matches content: "+ (str3.equals(str4))); //True
	}
	
	//2. == Operator is used to compare two object references to check whether they refer to same instance or not
	boolean result = str1==str2	; //True
	System.out.println("Result: " + result);
	boolean result1 = str3 == str4; //False
	System.out.println("Result1: " + result1);
	
	//3 compareTo() is used to Compares Unicode value and returns integer value after comparison, this integer value will specify string are
	//equal(0) or string less than or greater than. 
	
	int resultcomp = strcomp1.compareTo(strcomp2);
	System.out.println("Result comparison: "+ resultcomp); //here str1<str2 since it compares ascii value and will get -3 value here
	int resultcomp2 = strcomp1.compareTo(strcomp3);
	System.out.println("Result comparison2: "+ resultcomp2); //Here both strings are equal wo sill get 0 as result
	int resultcomp3 = strcomp2.compareTo(strcomp3);
	System.out.println("Resutl comparison3: "+ resultcomp3); //Here string2>str3 so will get return value as 3
}
}
