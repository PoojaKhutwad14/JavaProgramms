package com.javaclass.methods;
/*test method with return type*/

public class TestMethod {

	public void m1() {
		System.out.println("in m1 method");
	}

	public int m2() {
		return 10;

	}

	public char m3() {
		return 't';
	}

	public boolean m4() {
		return true;
	}

	public short m5() {
		return 23;
	}

	public long m6() {
		return 45613l;
	}

	public float m7() {
		return 3.6f;
	}

	public double m8() {
		return 4.56856d;
	}

	public String m9() {
		return "pune";
	}

	public static void main(String[] args) {

		TestMethod test = new TestMethod();
		test.m1();
		
		System.out.println(test.m2());
		System.out.println(test.m3());
		System.out.println(test.m4());
		System.out.println(test.m5());
		System.out.println(test.m6());
		System.out.println(test.m7());
		System.out.println(test.m8());
		System.out.println(test.m9());
		
	}
}
