package com.javaclass.variables;

public class TestVariables {

	int a=10;
	static String s="pooja";
	
	void m1(){
		System.out.println("a=" +a);
	}
	
	//integer
	void m2(int a){
		System.out.println(a);
		
	}
	//string
	void m3(String s){
		System.out.println(s);
		
	}
	//float
	void m4(float f){
		System.out.println(f);
	}
	//double
	void m5(double d){
		System.out.println(d);
	}
	//short
	void m6(short s){
		System.out.println(s);
	}
	//long
	void m7(long l){
		System.out.println(l);
	}
	//boolean
	void m8(boolean b){
		System.out.println(b);
	}
	//byte
	void m9(byte b){
		
		System.out.println(b);
	}

	public static void main(String[] args){
		
				
	
	TestVariables t=new TestVariables();
	
	System.out.println(t.a);
	System.out.println(t.s);
	System.out.println(TestVariables.s);
	t.m1();
	t.m2(20);
	t.m3("Techsum");
	t.m4(0.66f);
	t.m5(0.8d);
	t.m6((short)30);
	t.m7(1L);
	t.m8(false);
	t.m9((byte)20);
	}
}
