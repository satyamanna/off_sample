package com.myself.test;

import java.util.Arrays;

public class RearrangeArray {

	
	
	public static void main(String[] args) {
		RearrangeArray rearrangeArray = new RearrangeArray();
		int[] arr = rearrangeArray.rearrangeArray2(new int[]{1,2,3,4,5,6,7,8,9});
		for(int a_ :  arr){
			System.out.print(a_+" ");
		}
		
	}
	
	int[] rearrangeArray(int  arr[]){
		for(int i=0 ;  i <  arr.length /2  ; i++){
			int temp = arr[(arr.length -1) - i] ;
			arr[(arr.length -1) - i] = arr[i];
			arr[i] = temp;
			
		}
		return arr;
	}
	
	int [] rearrangeArray2(int arr[]){
		
		for(int i =  arr.length -1 ; i >0; i--){
			arr[i] = arr[i-1]; 
			
		}
		arr[0]=arr[arr.length -1];
		return arr;
	}
}
