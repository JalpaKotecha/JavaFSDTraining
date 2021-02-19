package com.dell.String;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		//String Buffer will create mutable strings
		StringBuffer str = new StringBuffer ("Hello");
		System.out.println(str);
		str.append(" Java");
		System.out.println(str);
		str.replace(0, 1, "replacing");
		System.out.println(str);
	}

}
