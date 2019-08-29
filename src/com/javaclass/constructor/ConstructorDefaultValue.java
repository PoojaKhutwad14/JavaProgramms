package com.javaclass.constructor;
//Constructor

public class ConstructorDefaultValue {

	int i;
	String s;

	ConstructorDefaultValue() {
		i = 24;
		s = "pune";
		System.out.println(i);
		System.out.println(s);
	}

	public static void main(String[] args) {
		ConstructorDefaultValue t = new ConstructorDefaultValue();

	}
}
