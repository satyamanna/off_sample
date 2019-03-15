package com.myself.sorts;

import java.util.Arrays;

/**
 * @author mannas
 *
 */  // 6330

public class BubbleSort {

	
	//int[] arr = new int[5]; O((n-1)^2)
	

	public static void main(String[] args) {
		String  st = "38 73 110 122 179 218 245";
		int[] arr  =Arrays.stream(st.split(" ")).mapToInt(Integer::parseInt).toArray();
		int temp  =0 ;
		for(int i=0; i< arr.length  ;  i++){
			for(int j =0 ; j < arr.length - 1   ; j++){
				if(arr[j] >  arr[j+1] ){
				 temp =  arr[j+1];
				 arr[j+1] =arr[j];
				 arr[j] =temp;
				 
				}
			}
			/*System.out.println("in every iteration of loop");
			for(int a :  arr){
				//System.out.print(a+" ");
			}*/
			
		}
		
		System.out.println("After Sorting ");
		int sum  = 0 ;
		for(int a :  arr){
			sum =  sum +a ;
			//System.out.print(a+" ");
		}
		System.out.print(sum+" ");
	}
	
	
}
