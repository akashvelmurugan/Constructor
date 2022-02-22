package com.constructor;

public class ConstructorChaining {

	static String name;
	static int age;

	ConstructorChaining(String studentName,int studentAge) {
		name=studentName;
		age=studentAge;
	}
	ConstructorChaining() {
		this(name,age);
		System.out.println(name+age);
	}
	public static void main(String[] args) {
	
		ConstructorChaining chaining= new ConstructorChaining("Saravanan",12345);
		ConstructorChaining chaining2 = new ConstructorChaining();
	
	}
}
