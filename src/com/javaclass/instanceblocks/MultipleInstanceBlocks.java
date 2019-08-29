//multiple instance blocks can be defined

package com.javaclass.instanceblocks;

public class MultipleInstanceBlocks {
	{
		System.out.println("1st Instance Block");
	}
	{
		System.out.println("2nd Instance Block");
	}

	MultipleInstanceBlocks() {
		System.out.println("In Default Constructor");
	}

	public static void main(String[] args) {
		MultipleInstanceBlocks t = new MultipleInstanceBlocks();
	}
}
