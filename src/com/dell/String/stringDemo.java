package com.dell.String;

public class stringDemo {
	public static void main(String[] args)
	{
		//This would refer to the same value and will not create new memory
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println("Str 1 ::" + str1);
		System.out.println("Str 2 ::" + str2);
		if(str1==str2)
		{
			System.out.println("Same String ::" + (str1==str2));
		}
		else
		{
			System.out.println("Different String" + (str1==str2));
		}
		
		//String with New Keyword : This would create new memory for string in heap area always when used New keyword
		String str3 = new String("Test");
		String str4 = new String("Test");
		if(str3==str4)
		{
			System.out.println("Same String ::" + (str3==str4));
		}
		else
		{
			System.out.println("Different String" + (str3==str4));
	}

}
}
