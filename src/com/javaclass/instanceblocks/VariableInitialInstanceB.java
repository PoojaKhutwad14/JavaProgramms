//variable can be intialzed in instance blocks

package com.javaclass.instanceblocks;

public class VariableInitialInstanceB {
	String sname;
	int eid;
	{
		sname = "Solution";
		eid = 100;
	}

	public static void main(String[] args) {
		VariableInitialInstanceB t = new VariableInitialInstanceB();
		
		System.out.println(t.sname);
		System.out.println(t.eid);
	}
}
