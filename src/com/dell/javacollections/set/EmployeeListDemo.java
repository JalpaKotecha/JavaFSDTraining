package com.dell.javacollections.set;


import java.util.HashSet;

import java.util.Set;

public class EmployeeListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(101, "John Smith", 342322, "Engineering");
		Employee emp2 = new Employee(102, "Wilson Smith", 342323, "IT");
	    Employee emp3 = new Employee(103, "Sarah Smith", 342324, "Sales");
		Employee emp4 = new Employee(104, "George Smith", 342325, "Admin");
		Employee emp5 = new Employee(105, "Mark Smith", 342326, "Operations");
		
		Set<Employee> setOfEmployees = new HashSet<Employee>();
		
		setOfEmployees.add(emp1);
		setOfEmployees.add(emp2);
		setOfEmployees.add(emp3);
		setOfEmployees.add(emp4);
		
		System.out.println(setOfEmployees);
	
	
	//List Traversing 
	for(Employee emp : setOfEmployees)
	{
		System.out.println("Employee: " + emp.id +", " + "Name: " + emp.name+ "," + "Salary: " +emp.salary+ "," + "Department: " +emp.dept);
	}

}
}
