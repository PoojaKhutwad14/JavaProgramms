package com.javaclass.constructor;
// prog 4 parameterized constructor declaring parameter in constructor
public class TestParamC {
	char A;
	String B;

	TestParamC(char A, String B) {
		System.out.println(A);
		System.out.println(B);
	}

	public static void main(String[] args) {
		TestParamC t = new TestParamC('p', "priya");
		TestParamC t2 = new TestParamC('k', "komal");
	}
}
