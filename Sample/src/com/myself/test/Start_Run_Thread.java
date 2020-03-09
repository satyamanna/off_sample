package com.myself.test;

public class Start_Run_Thread {

	public static void main(String[] args) {
		
		
		/*
		 * Thread t1 = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { System.out.println("Hello world");
		 * 
		 * } });
		 */
		
		Thread t1  =  new Thread1();
		t1.start();
		

	}

}

class Thread1 extends Thread{
	
	
	
	@Override
	public void run() {
		System.out.println("Current Thread " +  Thread.currentThread().getName());
	}
}

