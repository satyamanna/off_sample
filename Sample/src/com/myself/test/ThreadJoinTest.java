package com.satya.threadtest;

public class ThreadJoinTest {

	
	  public static void main(String[] args) throws InterruptedException {
		 Thread process1 =  new Thread(new Process1()) ;
		 Thread process2 =  new Thread(new Process2()) ;
		 process1.start(); 
		
		 process1.join(); 
		 process2.start(); 
		 
	}
}


class  Process1  implements Runnable {

	@Override
	public void run() {
		for(int i =0 ; i < 5  ; i++ )	{
			System.out.println("Process1 "+i);
		}
		
	}
	
}

class  Process2  implements Runnable {

	@Override
	public void run() {
		for(int i =0 ; i < 5  ; i++ )	{
			System.out.println( "Process2 "+ i);
		}
		
	}
	
}