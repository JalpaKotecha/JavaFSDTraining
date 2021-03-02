package com.dell.accessmodifiers;

public class BankLocker {
	/*WAP for all access modifiers
	 * PRivate -> Account No., account pin
	 * Public - > Bank Name, Bank assets
	 * Protected - > Bank vision
	 * Default ->Customer Count, Customer Numbers
	 * Add methods to access properties
	
*/
	
	public static void main(String[] args)
	{
		//Account account = new Account();
		Account account = new Account();
		account.bankDetails();
		account.customerDetails(); //Accessing "Default" function from default class
	}
	
	protected void vision() //Created protected method, being called in accessmodifiers2 package > Protectedmodifier class
	{
	String bankVision = "More Customers, More benefit";
		System.out.println(bankVision);
	
}
}
	class Account { //Default class
		private double accountNo=42423; //Private Variables
		private double accountPIN=1234;
		public String bankName = "ICICI";
		public String bankAsset = "XYZ";
		int customerCount = 43;
		int customerNumber = 200;
		private double showAccountDetails() //Private method
		{
			return accountNo;
		}
		public void bankDetails()
		{
			System.out.println("Bank Name: " +bankName+ "\n" + "Bank Asset: " +bankAsset);
		}
	
		public void customerDetails() 
{
	System.out.println("Customer Count: " +customerCount+ "\n" + "Customer Numner: " +customerNumber);
}
		
	}

;
