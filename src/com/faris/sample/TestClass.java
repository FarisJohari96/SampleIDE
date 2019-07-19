package com.faris.sample;

public class TestClass implements inf2 {

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void testIt() {
		
		System.out.println("Test it");
		// TODO Auto-generated method stub

	}

	public static void main(String[] args){
		System.out.println(name);
		//name = "New Name";
		TestClass test = new TestClass();
		test.testIt();
		System.out.println(inf2.name);
	}
	
	inf2 obj = new TestClass();
	
	System.out.println(obj.whoAmI());
	
	obj.testIt();
}

