package com.myself.test;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class  Parent  {
	
	
	public void add() {
	
		try {
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}

class  Child  extends  Parent {
	
			 @Override
			public void add() {
				try {
					
				} catch (ArithmeticException e) {
					// TODO: handle exception
				}
			}
	
}