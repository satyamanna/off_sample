package com.test.projecttest;

public class ChainOfResponsibility {
	public static void main(String[] args) {
		NegetiveNumber negetiveNumber  = new NegetiveNumber();
		PositiveNumber positivenumber  = new PositiveNumber() ;
		TestZero       testZero =  new  TestZero() ;
		testZero.setChain(positivenumber);
		positivenumber.setChain(negetiveNumber);
		
		testZero.process(new NumberTest(0));
		testZero.process(new NumberTest(-1));
		testZero.process(new NumberTest(-1));
	}
	
}



 class NumberTest {
	 
	Integer number  ; 
	public NumberTest(Integer number) {
		this.number= number;
	}
	
	public  Integer getNumber() {
		return this.number ;
	}
}
 
interface Chain {
	public void setChain(Chain n);  
	public void process(NumberTest n );  
}


class TestZero implements Chain   {

	Chain chain  ;
	
	@Override
	public void setChain(Chain n) {
		chain = n ; 
		
	}

	@Override
	public void process(NumberTest n) {
		if(n.getNumber().equals(0)) {
			System.out.println("This is  Zero");
		}
		else {
			chain.process(n);
		}
		
	}
	
	
	
}


class PositiveNumber implements Chain   {

	Chain chain  ;
	
	@Override
	public void setChain(Chain n) {
		chain = n ; 
		
	}

	@Override
	public void process(NumberTest n) {
		if(n.getNumber() > 0) {
			System.out.println("This is  Positive Number");
		}
		else {
			chain.process(n);
		}
		
	}
	
	
	
}

class NegetiveNumber implements Chain   {

	Chain chain  ;
	
	@Override
	public void setChain(Chain n) {
		chain = n ; 
		
	}

	@Override
	public void process(NumberTest n) {
		if(n.getNumber() < 0) {
			System.out.println("This is  Negetive Number");
		}
		else {
			chain.process(n);
		}
		
	}
	
	
	
}




