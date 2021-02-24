package com.dell.Arrays;
import java.util.Arrays;

public class singleDimensionalArray {
	public static void main(String[] args)
	{
		int number[] = {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(number)); //Prints entire Array
		
		//Iteration
		for(int index=0; index<number.length; index++)
		{
			System.out.println("Element at Index " +index+ " & Value:: "+ number[index]);
		}
		//iteration for changing value
		
		for(int i=0; i<number.length; i++)
		{
			if(number[i]==40)
			{
				number[i]=41;
			}
		}
		System.out.println(Arrays.toString(number));
	}

}
