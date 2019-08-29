package com.javaclass.variables;
/*print default values of instance variable*/

public class TestDefaultValues {
		
	
	int a;
	boolean b;
	byte by;
	char c;
	short s;
	long l;
	float f;
	double d;
	String st;
	
	public static void main(String[] args) {
		
		TestDefaultValues t=new TestDefaultValues();
		
		System.out.println("Default Value of int= " +t.a);
		System.out.println("Default Value of boolean= " +t.b);
		System.out.println("Default Value of byte= " +t.by);
		System.out.println("Default Value of char= " +t.c);
		System.out.println("Default Value of short= " +t.s);
		System.out.println("Default Value of long=" +t.l);
		System.out.println("Default Value of float=" +t.f);
		System.out.println("Default Value of double=" +t.d);
		System.out.println("Default Value of String=" +t.st);
		
		
	}
	
}
