package com.myself.hackerearth.datastructure.bubblesort;

public class Csort {
		  public static void main(String[] args) {
			   //-1
			  //0
			 // 1
			 // 4
			//  5  -1,5,4,1,0
                  
			  
				int[] a ={4,5,3,7,1};
				//13457
				int [] b = {4,5,3,7,1}; 
				//int [] c = {-1,5,4,1,0}; 
				for(int i =  0 ; i < a.length ; i ++){
					for(int j   =  0 ;  j <  a.length -1  ;   j++ ){
						if(a[j+1] < a[j]){
							int temp = a[j+1];
							a[j+1] = a[j] ;
							a[j] = temp;
						
							
							
							
						}
					}
				
				}
				for(int i = 0 ; i < a.length ; i++){
					for(int j=0 ;j < b.length; j++ ){
						if(b[j]==a[i]){ 
							System.out.print(j+" ");
							break;
						}
					}
				}
				
				for(int a_ : a){
					//System.out.print(a_);
					}
				
		}
}
