package com.faris.sample;

class Outer_Class {

	public class Inner_Class{
		public void print(){
			System.out.println("This is an inner class");
		}
	}
	
	void myMethod(){
	public class Inner_Class3{
		public void print(){
			System.out.println("This is inner class 3 inside myMethod");
		}
		
		Inner_Class3 inner = new Inner_Class();
	}
	}
	
	void display_Inner(){
		Inner_Class inner = new Inner_Class();
		inner.print();
		
	}
}
