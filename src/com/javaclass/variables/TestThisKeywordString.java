package com.javaclass.variables;

public class TestThisKeywordString {

	String a = "pune";
	

	void m4(String a) {
		System.out.println(a);
		System.out.println(this.a);
	}



	public static void main(String[] args) {
		TestThisKeywordString t = new TestThisKeywordString();
		t.m4("hadapsar");
		
	}
}
