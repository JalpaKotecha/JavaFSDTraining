package com.dell.Arrays;

import java.util.Arrays;

public class ArraysEmailChange {

	public static void main(String[] args) {
		String email[] = {"test@gmail.com", "test1@gmail.com", "test2@gmail.com"};
		System.out.println(Arrays.toString(email));
		for(int i = 0; i<email.length; i++)
		{
			if(email[i].contains("test"))
			{
				email[i]=email[i].replaceAll("test", "new"); //replacing test words with new words in email addresses
				
			}
		}
		System.out.println("Replaced Emails are: " +Arrays.toString(email));
	}

}
