package com.javaclass.instanceblocks;

class InstanceB {
	InstanceB(){
		this(10,"puja");
		System.out.println("Default");
	}
	InstanceB(int i,String s){
		this();
		System.out.println("parameterized");
	}
		
		{
			System.out.println("Instance");
		}
		public static void main(String[]args){
			InstanceB t = new InstanceB();
			
		
	}
	
}
