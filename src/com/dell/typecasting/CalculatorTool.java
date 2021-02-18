package com.dell.typecasting;
import java.util.Scanner;

public class CalculatorTool {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numeric value 1");
		int number1 = input.nextInt();
		System.out.println("Enter numeric value 2");
		int number2= input.nextInt();
		System.out.println();
	}
	public static byte add(int number1, int number2)
	{
		return(byte)(number1+number2);
		
	}
	public static double sub(int number1, int number2)
	{
		return number1-number2;
		
	}
	public static float div(int number1, int number2)
	{
		return number1/number2;
		
	}
	public static short mul(int number1, int number2)
	{
		return (short) (number1*number2);
		
	}
}
