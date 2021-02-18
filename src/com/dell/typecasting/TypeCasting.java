package com.dell.typecasting;

public class TypeCasting {
	public static void main(String[] args)
	{

	//Type casting : process of converting data from one type to another
	/* 
	 * Widening Type casting : Converts data to from lower range to higher range values
	 * byte->short->int->long->float->double
	 * 
	 */
	byte byteCount = 100; //-128 to 127; 1 byte = 8 bit
	int interCount = byteCount; // will convert byte value to int value (-32768 to 32767)
	long bigCount = interCount ; //Int ->Long
	float floatCount = bigCount; //Long->float
	double decimalCount = bigCount; //Long -> Double
	System.out.println("Byte Count" + byteCount);
	System.out.println("integer Count" + interCount );
	System.out.println("Long" + bigCount);
	System.out.println("Double" + bigCount);
	
}
}
