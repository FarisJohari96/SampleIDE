package com.faris.sample;

/* This is my Exception class, I have named it MyException
 * you can give any name, just remember that it should
 * extend Exception class
 */
class MeException extends Exception{
	String str1;
	MeException(String str2){
		str1=str2;
	}
	public String toString(){
		return ("MeException occurred:" +str1);
	}
	
}

public class UserDefinedException{
   public static void main(String args[]){
	try{
		System.out.println("Starting of try block");
		// I'm throwing the custom exception using throw
		throw new MeException("This is My error Message");
	}
	catch(MeException exp){
		System.out.println("Catch Block") ;
		System.out.println(exp) ;
	}
   }
}