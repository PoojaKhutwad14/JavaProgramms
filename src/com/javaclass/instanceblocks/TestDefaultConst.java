//instance blocks first execute

package com.javaclass.instanceblocks;

 class TestDefaultConstIb {
	{
		System.out.println("instance blocks");
	}

	TestDefaultConstIb() {
		System.out.println("in constructor");
	}

	public static void main(String[] args) {

		TestDefaultConstIb t = new TestDefaultConstIb();

	}

}
