package com.dell.Serializationdeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;
import java.io.FileNotFoundException;


public class SerializationTestEmployee {
	public static void main(String[] args)
	{
	
		String filename = "file.ser";
		try {
			Employee emp = new Employee(101, "John", "Dev", 234232);
			//create output file stream
			FileOutputStream file = new FileOutputStream(filename);
			
			//create out object stream
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			//serializing the object
			out.writeObject(emp);
			
			System.out.println("Serialization is completed");
			out.close();
			file.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
