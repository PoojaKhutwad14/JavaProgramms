package com.javaclass.constructor;

public class ConstructorChain {

	ConstructorChain() {

		this(10);

		System.out.println("chaining 1");

	}

	ConstructorChain(int i) {

		System.out.println("chaining 2");
	}

	public static void main(String[] args) {
		ConstructorChain t = new ConstructorChain();
	}
}
