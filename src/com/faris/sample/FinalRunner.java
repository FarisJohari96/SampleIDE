package com.faris.sample;

public class FinalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalClass obj = new FinalClass();
		FinalClass obj2 = new FinalClass();
		
		
		
		FinalClass.sayBye("Java");
		System.out.println(obj.cl);
		
		obj.ClassName = "MyClass1";
		obj.ClassName2 = "MyClass1";
		
		
		
		
		System.out.println("Modified 1: " + obj2.ClassName);
		
		
	}
	
	

}
