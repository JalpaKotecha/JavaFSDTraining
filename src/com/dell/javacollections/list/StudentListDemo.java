package com.dell.javacollections.list;

import java.util.ArrayList;
import java.util.List;

public class StudentListDemo {

	//WAP for creating multiple student object list and perform iteration over student
	//Iterations by iterator
	//Iterations by counter for loop
	//Iterations with enhanced for loop
	
	
public static void main(String[] args)
{
	Student stu1 = new Student(1, "Vihaan", 45);
	Student stu2 = new Student(2, "Jack", 50);
	Student stu3 = new Student(3, "Karan", 47);
	Student stu4 = new Student(2, "Angela", 41);
	Student stu5 = new Student(2, "David", 42);

	List<Student> studentList = new ArrayList<Student>();
	studentList.add(stu1);
	studentList.add(stu2);
	studentList.add(stu3);
	studentList.add(stu4);
	studentList.add(stu5);
	
	for(Student stu : studentList)
	{
		System.out.println("Student Roll No.:" +stu.rollno+ "," +" Student Name:" +stu.name+ "," +" Student Marks:" +stu.marks);;
	}

	
	
	
}
}
