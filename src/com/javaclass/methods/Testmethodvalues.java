package com.javaclass.methods;
// object as return type passing values

class Employee2 {

}

public class Testmethodvalues {
	
	
	public Employee2 m1(Employee2 e) {
		System.out.println("In m1 Method");
		return e;
	}
	
	
	public static void main(String[] args) {
		Testmethodvalues t = new Testmethodvalues();
		Employee2 e = new Employee2();
		t.m1(e);
	}
}
