package com.javaclass.methods;

public class TestMethodWithReturnThis {
	
	int i=10;
	int j=20;
	
	int m1(int i){
		return i;
	}	
	int m2(int j){
		return this.j;
	}
	
	
	public static void main(String[] args) {
		TestMethodWithReturnThis t = new TestMethodWithReturnThis();
		System.out.println(t.m1(28));
		System.out.println(t.m2(25));
}
}
