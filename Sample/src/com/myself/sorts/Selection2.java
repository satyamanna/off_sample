package com.myself.sorts;

public class Selection2 {

	
	public static void main(String[] args) {
		int[] arr  = {45,10,12,89};
		for(int i =0; i < arr.length -1  ; i++){
			int  big  = arr[i] ;
			for(int  j= i+1 ; j < arr.length ;  j++ ){
				if(arr[j] >  big){
					int temp  = big;
					big= arr[j];
				   arr[i] =  arr [j] ;
				   arr[j] = temp;
				   
				//	break;
				}
			}
		}
		for(int a :  arr ){
			System.out.println(a);
		}
	}
	
}
