package com.myself.sorts;

public class DaliyTest {

	public static void main(String[] args) {
		int temp =0 ;
		int[] a ={-1,5,4,1,0};
		int  n=  a.length;
	     // bubble sort 
		/*for(int  i = 0 ;  i < a.length  ;i++){

		for(int j = 0; j< (a.length -1 ) ; j++  ){
		 
		 if(a[j+1] >  a[j]) {
		 
		 temp =  a[j+1];
		 a[j+1] = a[j];
		 a[j] = temp ;
		 }

		}

		}*/
		
		
		  ///selection sort  
		
		/*for(int  i = 0 ;  i < a.length  ;i++){
		
		for(int j = i; j< a.length ; j++  ){
		 if(a[i] >  a[j]) {
		 temp  = a[i];
		 a[i] =  a[j];
		 a[j] = temp;
		 
		
		 }

		}

		}*/
		
		//  insertion sort 
		/*int int_=0;
		for(int  i = 1 ;  i <a.length  ;i++){

		int_   = a[i];
		for(int j = 0; j< i ; j++  ){
		 
		 if(int_ <  a[j]) {
			  temp  =  a[i];
			 a[i] =  a[j] ; 
			 a[j] =temp;
		 }

		}

		}*/
		
		/*for(int i=0 ; i < n ;i++){
			  for(int j =  0  ; j <  n -1  ;  j++){
			     if(a[j+1] < a[j]){
			     temp  =  a[j+1] ; 
			     a[j+1] =a [j] ; 
			     a[j] = temp;
			     }
			  }
			}*/
		
		
		
		for(int a_ : a){
			System.out.println(a_);
			}
	}
	
	
	
}
