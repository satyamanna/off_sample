package com.myself.test;

public class LeftRotateArray_revisit {

	
	
	  public static void main(String[] args) {
		 int[] arr  = {45 , 10 ,1 ,89 ,45};
		 LeftRotateArray_revisit ob  = new LeftRotateArray_revisit();
		 for(int a_ :  ob.leftRotateCount(arr,2)){
			 System.out.println(a_);
		 }
	  }
	  
	  public int[] leftRotateCount(int[]  arr   ,   int  limit)
	  {
		  for(int  i = 0 ; i <  limit  ;i++){
			 arr= leftRotate(arr);
		  }
		  return  arr ;
	  }
	  public int[] leftRotate(int[]  arr)
	  {
		  for(int  i =0  ;  i <  arr.length  - 1  ;  i++ ){
			  int  temp  =arr[i+1];
			  arr[i+1] = arr[i];
			  arr[i] = temp   ;
		  }
		  return  arr ;
	  }
}
