package com.dell.String;

public class StringBuilderDemo {
	public static void main(String[] args)
	{
		//StringBuilder is also used to create mutable strings
		StringBuilder sb = new StringBuilder("Test");
		System.out.println(sb);
		//edit string
		sb.append(" Happy Java");
		System.out.println(sb);
		
		//Insert 
		sb.insert(0, "Welcome ");
		System.out.println(sb);
		//reverse string
		sb.reverse();
		System.out.println(sb);
		//Converting String to Stringbuffer and stringbuilder
		String str = "JK";
		StringBuffer buff = new StringBuffer(str);
	}

}
