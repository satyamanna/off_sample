package com.myself.test;

public class RightShifty {
	  public static void main(String[] args) {

		  int[] arr  = {1,2,3,4,5} ;
		  for(int i = (arr.length -1)  ; i > 0 ; i--){
			  int  temp = arr[i-1];
			  arr[i-1] =arr[i] ;
			  arr[i] = temp  ; 
		  }
		  
		  for(int  a_ :  arr){
			  System.out.println(a_);
		  }
		  
	}
}
