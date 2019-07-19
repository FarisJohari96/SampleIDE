package com.faris.sample;

public class ThreadTest extends Thread{
	
	@Override
	public void run(){
		
		try{
		
			long l = (long) (Math.random() * 1000);
		
			System.out.println("I am a thread" + this.getName() +"running");
		
			Thread.sleep(2000);
		
			System.out.println(this.getName()+ "Just go up:" + l);
			
		}catch(InterruptedException ex){
		ex.printStackTrace();
		}

	public static void main(String[] args) {
		
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		ThreadTest t3 = new ThreadTest();
		ThreadTest t4 = new ThreadTest();
		ThreadTest t5 = new ThreadTest();
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
