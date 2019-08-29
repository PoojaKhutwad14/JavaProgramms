package com.javaclass.variables;

public class TestThisKeyword {

	
		int a = 5;
		int b = 6;

		void m1(int a, int b) {
			System.out.println(a + b);

			System.out.println(this.a + this.b);
			
		}
	

	public static void main(String[] args) {
		TestThisKeyword t = new TestThisKeyword();
			t.m1(8,9);
	}
}
