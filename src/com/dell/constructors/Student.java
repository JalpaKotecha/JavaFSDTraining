package com.dell.constructors;

//WAP for instantiating an object Student with constructor overloading
//Id, Student name, Marks
//Subject, class


class Student {
	int id;
	String name;
	int marks;
	Student(int i, String n, int m)
	{
		id=i;
		name=n;
		marks=m;
	}
	void display()
	{
		System.out.println("Student ID: " +id+ " Student Name: " +name+ " Student Marks: " +marks);
	}
	
public static void main(String[] args)
{
	Student s1= new Student(1, "Karan", 50);
	Student s2= new Student(2, "Jack", 45);
	s1.display();
	s2.display();
}


	

}
