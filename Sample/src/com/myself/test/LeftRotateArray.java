package com.myself.test;

public class LeftRotateArray {

	
	public static void main(String[] args) {
		int[] arr={ 45,89,45,10,1};
		// 3 4 1 2 5 6 
		//1 4 3 2 5 6 
		int  size  = 2; 
		int count  = 1 ;
		int currentIndex= 0;
		for(int i =0 ; i <  arr.length ; ){
			if(count >  size ){
				for(int replacementCount =0  ; 
						replacementCount <  size;
						replacementCount++  ){
					 currentIndex =  i+replacementCount;//2
					int  replaceIndex  =  (currentIndex  -  size) ;  //0
					System.out.println(currentIndex +"===="+replaceIndex);
					try{
					int temp  =  arr[currentIndex] ; 
					arr[currentIndex] =  arr[replaceIndex] ;
					arr[replaceIndex] = temp;
					}
					catch(Exception e){
						
					}
					for(int a_ : arr){
						System.out.print(a_+" ");
					}
					System.out.println("");
					
					//break ;
				}
				//break;
				i=currentIndex+1;
			}
			else {i++;}
			count ++ ;
			
		}
		/*for(int a_ : arr){
			System.out.print(a_+" ");
		}
		System.out.println("");	*/
	}
}
