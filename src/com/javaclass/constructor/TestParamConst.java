package com.javaclass.constructor;
//prog 3 parameterizes constructor not passing values in obj ref

public class TestParamConst {
	int i;
	String j;

	TestParamConst() {

		i = 15;
		j = "techsum";
		System.out.println("i");
		System.out.println("j");

	}

	public static void main(String[] args) {
		TestParamConst t = new TestParamConst();
		TestParamConst t1 = new TestParamConst();

	}
}
