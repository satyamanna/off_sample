package com.myself.sorts;

public class SelectionSort {
   public static void main(String[] args) {
	int[] arr  = {45,10,12,89};
	for(int i =0; i < arr.length -1  ; i++){
		int  index = i ;
		for(int  j= i+1 ; j < arr.length ;  j++ ){
			if(arr[j] >  arr[index]){
				index = j;
				int temp   =  arr [index];
				arr[index] =  arr[i];
				arr[i] =  temp;
				
			//	break;
			}
		}
	}
	
	for(int a :  arr ){
		System.out.println(a);
	}
}
}
