package com.faris.sample;

public class TernaryOperator{

	public static void main(String[] args){

			String strInput = args [0];

			System.out.println(strInput instanceof String);

			int input = Integer.parseInt(strInput);

			int target = 0;

			int input1 = Integer.parseInt(args[0]);
			

			outer: for(int i=0; i<10; i++){
				for(int j=0; j<target; j++){

					if(j>i){
						System.out.println("L");

						continue outer;
					}
					System.out.println("" + (i*j));
					
				}
				
				//Arithmetics
				
				int num = 10;
				
				int result = num/input;
				
				System.out.println("Result" + result);
				System.out.println();
			
			}
			
			
				
				
			}


	}