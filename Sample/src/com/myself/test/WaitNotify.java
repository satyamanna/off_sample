package com.satya.threadtest;

import java.util.ArrayList;
import java.util.List;

public class WaitNotify {

	
	
	public static void main(String[] args) throws InterruptedException {
		ProducerConsumer  ob  = new ProducerConsumer() ;
		Thread  t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				ob.produce();
			}
		});
		
		Thread  t2 = new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
					ob.consume();	
					}
				});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
	
	
}


 class  ProducerConsumer{
	
	
	List<Integer>  list  = new ArrayList<Integer>();
	int capacity =  8 ; 
	int count  =0 ;
	
	public synchronized void produce() {
		if(list.size() ==  capacity ) { try {
			wait() ;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}}
	  
		else {
			notify();
			int  i  =count  +1 ;
			list.add(count++, i);
			
		}
		
	}
	public synchronized  void consume() {
		if(list.size() ==  0 ) { try {
			wait() ;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}}
	  
		else {
			notify();
			list.get(count);	
			count--;
		}  
	}
	
	
	
	
}
