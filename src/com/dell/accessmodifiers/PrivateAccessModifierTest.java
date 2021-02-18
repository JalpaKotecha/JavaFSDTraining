package com.dell.accessmodifiers;

public class PrivateAccessModifierTest {

	public static void main(String[] args)
	{
		//Create Object
		Father father = new Father();
		father.showMoney();
		//father.showBalance(); //Compile error
		//father.fixedDeposit(); //Compile error
		
	}
}
class Father
{
	//Private variable
	private double bankMoney = 3763454;
	private double fixedDeposit = 1232323242;
	
	//Private Method
	private double showBalance()
	{
		return bankMoney;
	}
	//Public Method
	public double showMoney() {
		{
			System.out.println("Money" + bankMoney);
			return bankMoney;
		}
	}
}
