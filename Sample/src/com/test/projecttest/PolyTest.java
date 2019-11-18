package com.test.projecttest;

public class PolyTest {
	public static void main(String[] args) {
		Object ob  = new B();
		System.out.println(ob.toString());;
	}
}


class A  {
	@Override
	public String toString() {
		
		return "A";
	}
}
class B extends A {
	public void getString() {
		toString();
	}
	
	
}
