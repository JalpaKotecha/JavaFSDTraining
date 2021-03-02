package com.dell.Arrays;

import java.util.Arrays;

public class multiDemensionalArray {

	public static void main(String[] args) {
		int number[][] = { {10, 20, 30, 40, 50}, {1, 2, 3,4,5} };
	//System.out.println(Arrays.toString(number)); //If you print this then it will give hash values since its 
	//taking both the arrays together 
	//so use below to print both dimensional values
		System.out.println(Arrays.toString(number[0])); //This will print the array values which are at number[0] position
		//so those are first array values
		System.out.println(Arrays.toString(number[1]));//This will print the values which are at number[1]
		System.out.println(number[0][0]); //Print value/element at particular index
	
		//iteration - Nested for
		
		for(int row=0; row<number.length; row++) //When it says row = 0 ->will consider first row {10, 20, 30, 40, 50} when row is increased, will go to 
			//second row which is here is : {1, 2, 3,4,5}
		{
			System.out.println("Row: "+ row + " "+ Arrays.toString(number[row])); //so here it will print both the rows
			//Access elements need nested for loop. which we will refer as column
			for(int col=0; col<number[row].length; col++)
			{
				System.out.println("Value at "+"[" +row+ "," +col+"]"+   " is :: " + number[row][col]);
			}
		}
		
	}
	
	

}
