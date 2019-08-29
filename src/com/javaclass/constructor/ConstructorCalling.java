package com.javaclass.constructor;

public class ConstructorCalling {

	ConstructorCalling() {
		this("techsum");
		System.out.println("0 arg constructor");
	}

	ConstructorCalling(int a, int b) {
		System.out.println("2 arg constructor");
	}

	ConstructorCalling(String s) {
		this(10, 20);

		System.out.println("1 arg constructor");

	}

	public static void main(String[] args) {
		ConstructorCalling t = new ConstructorCalling();

	}

}
