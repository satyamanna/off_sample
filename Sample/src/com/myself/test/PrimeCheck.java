package com.myself.test;

public class PrimeCheck {
			public static void main(String[] args) {
				PrimeCheck primeCheck =  new   PrimeCheck();
				primeCheck.check(9);
			}
			
			public void  check(int number){
				boolean  flag = false  ;
				int temp =0 ;
				//  if not  0 ,1 ,2
				for(int  i =2; i <  9 ; i++){
					temp = number ;
					int lastTemp =0;
					while(temp!=0){
						temp =  temp /  i ; 
						if(lastTemp == temp){
							break ;
						}
						else {
							lastTemp=temp;
						}
					}
					
					
				}
				
				if(temp != 0) flag =true; // not prime
				System.out.println(flag);
			}
}
