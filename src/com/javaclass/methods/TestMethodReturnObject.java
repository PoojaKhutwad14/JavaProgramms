package com.javaclass.methods;
//object as return type

class Employee1{
	
}

class Student1{
	
}
public class TestMethodReturnObject {
	
	Employee1 m1(){
		System.out.println("in m1 method");
		Employee1 e=new Employee1();
		return e;
	}
	Student1 m2(){
		System.out.println("in m2 method");
		Student1 s=new Student1();
		return s;
		
	}
	public static void main(String[] args) {
		
		TestMethodReturnObject t=new TestMethodReturnObject();
		t.m1();
		t.m2();
	}
	
}
