package com.javaclass.methods;

public class TestThisMethodCalling {
	
	void m1(){
		m2();
		System.out.println("in m1 method");
	}
	void m2(){
		System.out.println("in m2 method");
	}
	public static void main(String[] args) {
		TestThisMethodCalling t = new TestThisMethodCalling();
		t.m1();
	}

}
