package com.dell.methods.bank;

public class Account {
	
		private double balance = 2984.43;
		private String name = "Test name";
		private String bankName = "XyZ bank";
		
	public double showBalance()
	{
		System.out.println("User is: + "+name+" and Balance is : "+balance );
		return balance;
	}
	public double withdraw(double amount)
	{
		if(amount<=amount)
		{
			balance = balance - amount;
		
		System.out.println("User is: + "+name+" and Balance is : "+balance );
		}
		else {
			System.out.println("Invalid Withdraw amount");
		}
		return balance;
	}
public void welcomeMessage()
{
	System.out.println("-------------------");
	System.out.println("Welcome to " + bankName);
	System.out.println("-------------------");
}
}
