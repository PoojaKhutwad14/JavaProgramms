//constructor chaining instance block execution

package com.javaclass.instanceblocks;

public class InstanceBlockThis {

	InstanceBlockThis(){
		
		this(10,"shri");
		System.out.println("Default Constructor");
	}
	InstanceBlockThis(int i,String s){
		System.out.println("In Paramet Constructor");
	}
	{
		System.out.println("In Instance Block");
	}
	public static void main(String[] args) {
		
		InstanceBlockThis t=new InstanceBlockThis();
		
	}

	}
