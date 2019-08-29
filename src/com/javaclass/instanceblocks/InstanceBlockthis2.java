//constructor chaining instance block execution-this in parameterized constructor

package com.javaclass.instanceblocks;

 class InstanceBlockThis {

	InstanceBlockThis(){
		
		this(10,"shri");
		System.out.println("Default Constructor");
	}
	InstanceBlockThis(int i,String s){
		this();
		System.out.println("In Paramet Constructor");
	}
	{
		System.out.println("In Instance Block");
	}
	public static void main(String[] args) {
		
		InstanceBlockThis t=new InstanceBlockThis();
		
	}

	}
