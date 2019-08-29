package com.javaclass.methods;

public class TestMethodPrimitiveType {

	public int m1(int i) {
		return i;

	}

	public String m2(String s) {
		return s;

	}

	public char m3(char c) {
		return c;

	}

	public boolean m4(boolean b) {
		return b;

	}

	public static void main(String[] args) {
		TestMethodPrimitiveType t = new TestMethodPrimitiveType();
		
		int i = t.m1(10);
		System.out.println(i);
		
		String s = t.m2("pune");
		System.out.println(s);
		
		char c = t.m3('p');
		System.out.println(c);
		
		boolean b = t.m4(true);
		System.out.println(b);
		
	
		
		}
}
