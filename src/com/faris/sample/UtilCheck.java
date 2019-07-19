package com.faris.sample;

import java.util.*;

public class UtilCheck {

	public static void main(String[] args) {
		
		//List list = new ArrayList();
		
		//list.add(new FinalClass());
		
		//String s = (String) list.get(0);
		
		//System.out.println("I got :" + s);
		
		// TODO Auto-generated method stub
		
		List <String> list = new ArrayList <String>();
		
		list.add("Helo");
		list.add("I");
		list.add("am");
		list.add("Java");
		list.add("Arraylist");
		
		/*
		 * for(String s: list){
		 
			System.out.print(s + " ");
		} */
	
		//String s = list.get(0);
		
		//System.out.println("I got :" + s);
		
		/*
		Iterator it = list.iterator();
		while(it.hasNext() ){
			System.out.print(it.next() + " ");
		} */
		
		for(Iterator<?> it = list.iterator(); it.hasNext();){
			
			String s = (String) it.next();
			if(s.equals("java"))
				System.out.println("I got :" + s);
		}
		

	}

}
