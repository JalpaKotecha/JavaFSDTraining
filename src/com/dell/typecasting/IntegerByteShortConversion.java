package com.dell.typecasting;

public class IntegerByteShortConversion {
	public static void main(String[] args)
	{
		int intVal = 15;
		byte byteVal = 100;
		short shortVal = 10;
		float floatValofint = intVal;
		double doubleValofint = intVal;
		long longValofint = intVal;
		float floatValofbyte = byteVal;
		double doubleValofbyte = byteVal;
		long longValofbyte = byteVal;
		float floatValofshort = shortVal;
		double doubleValofshort = shortVal;
		long longValofshort = shortVal;
		
		System.out.println("Float value after Integer conversion" + floatValofint);
		System.out.println("Double value after Integer conversion" + doubleValofint);
		System.out.println("Long value after Integer conversion" + longValofint);
		System.out.println("Float value after Byte converstion" + floatValofbyte );
		System.out.println("Double value after Byte conversion" + doubleValofbyte);
		System.out.println("Long value after  Integer conversion" + longValofbyte);
		System.out.println("Float value after Short converstion" + floatValofshort );
		System.out.println("Double value after Short conversion" + doubleValofshort);
		System.out.println("Long value after  Short conversion" + longValofshort);
	}

}
