package com.dell.javacollections.list;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101, "John Smith", 342322, "Engineering");
		Employee emp2 = new Employee(102, "Wilson Smith", 342323, "IT");
	    Employee emp3 = new Employee(103, "Sarah Smith", 342324, "Sales");
		Employee emp4 = new Employee(104, "George Smith", 342325, "Admin");
		Employee emp5 = new Employee(105, "Mark Smith", 342326, "Operations");
		
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		
		listOfEmployees.add(emp1);
		listOfEmployees.add(emp2);
		listOfEmployees.add(emp3);
		listOfEmployees.add(emp4);
		
		System.out.println(listOfEmployees);
	
	
	//List Traversing 
	for(Employee emp : listOfEmployees)
	{
		System.out.println("Employee:" + emp.id +", " + " Name:" +emp.name+ "," +" Salary:" +emp.salary+ "," + " Department:" +emp.dept);
	}

}
} 
