package com.javaclass.methods;
class Employee{								//class
	
}
class Student{
	
}

public class TestMethodNoReturnType {

	
	public void m1(int i){
		System.out.println(i);
		
	}
	public void m2(String s){
		System.out.println(s);
		
	}
	public void m3(char c){
		System.out.println(c);
	}
	public void m4(short st){
		System.out.println(st);
	}
	public void m5(long l){
		System.out.println("l");
	}
	public void m6(boolean b){
		System.out.println("b");
	}
	public void m7(float f){
		System.out.println("f");
	}
	public void m8(double d){
		System.out.println("d");
	}
	
	public void m9(Employee e){
		System.out.println("in m9 method");
		
	}
	public void m10(Student su){
		System.out.println("in m10 method");
		
	}
	public static void main(String[] args) {			//main method
		
		TestMethodNoReturnType test=new TestMethodNoReturnType();
		
		test.m1(10);
		test.m2("pooja");	
		test.m3('h');
		test.m4((short)12);
		test.m5(45698);
		test.m6(true);
		test.m7(0.3f);
		test.m8(4.56689d);
		
		Employee E=new Employee();				///object creation
		test.m9(E);								//method calling
		
		Student S=new Student();
		test.m10(S);
	} 
}
