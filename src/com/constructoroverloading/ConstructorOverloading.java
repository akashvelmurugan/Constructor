package com.constructoroverloading;

public class ConstructorOverloading {

	String name;
	int age;

	public ConstructorOverloading() {
		System.out.println("NoParameteraisedConstructor");
	}	
	public ConstructorOverloading(String employeeName) {
		name=employeeName;
		System.out.println("NoParameteraisedConstructor"+employeeName);
		
	}	
	public ConstructorOverloading(String employeeName,int employeeAge) {
		name=employeeName;
		age=employeeAge;
		System.out.println("NoParameteraisedConstructor"+employeeName+" "+employeeAge);
	}	

	public static void main(String[] args) {
		ConstructorOverloading constructorOverloadingDefault = new ConstructorOverloading();
		ConstructorOverloading constructorOverloadingPerametereised = new ConstructorOverloading("Saravanan");		
		ConstructorOverloading constructorOverloadingPerametereisedOne = new ConstructorOverloading("Saravanan Saravanan", 27);
	
	System.out.println(constructorOverloadingPerametereised.age);
	}
}
