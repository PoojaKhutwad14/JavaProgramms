//static block execute only once the class is created

package com.javaclass.staticblocks;

public class StaticBlocks {
	static{
		System.out.println("In Static Block");
	}
	StaticBlocks(){
		System.out.println("In Default Constructor");
	}
//	static{
	//	System.out.println("in static block2");
	//}
	StaticBlocks(int i,int j){
		System.out.println("In Parameterized Constructor");
		
	}
	public static void main(String[] args) {
		StaticBlocks t=new StaticBlocks();
		StaticBlocks t2=new StaticBlocks(12,24);
	}
}
