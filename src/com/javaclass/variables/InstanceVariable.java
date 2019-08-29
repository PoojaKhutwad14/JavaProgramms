package com.javaclass.variables;
//Access instance variable outside the the method(constructor)

public class InstanceVariable {
	int a;
	int b;

	InstanceVariable(int a) {

	}

	void disp() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		InstanceVariable t = new InstanceVariable(20);
		t.disp();
	}
}
