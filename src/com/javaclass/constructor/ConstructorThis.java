package com.javaclass.constructor;
// constructor using this keyword

public class ConstructorThis {
	int a = 5;
	int b = 10;

	ConstructorThis(int a, int b) {
		this.a = a;
		this.b = b;

	}

	void disp() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		ConstructorThis t = new ConstructorThis(15, 12);
		t.disp();
	}
}
