package com.javaclass.instanceblocks;
//instance blocks are common for all constructor(default & parameterized)

public class InstanceBlocks {
	{
		System.out.println("instance blocks");
	}

	InstanceBlocks() {
		System.out.println("in default constructor");
	}

	InstanceBlocks(int i, String s) {
		System.out.println("in paramet constructor");
	}

	public static void main(String[] args) {
		InstanceBlocks t = new InstanceBlocks();
		InstanceBlocks t1 = new InstanceBlocks(20, "pooja");
	}
}
