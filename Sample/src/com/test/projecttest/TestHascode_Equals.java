package com.test.projecttest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestHascode_Equals {

	public static void main(String[] args) {
		TestHascode_Equals ob = new  TestHascode_Equals() ;  
	//	System.out.println("######"+ob.getList());
		Map<String,String> map = new  HashMap<String, String>();
		map.put("1", "abcd");
		for(Map.Entry<String, String> m : map.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
	}
	
	
	protected  Set<Users> getList() {
		
		Set<Users> list = new HashSet<Users> ()   ;  
		Users user1 = new Users("abcd","1234567"); 
		Users  user2 = new Users("abcd", "1234567") ;   
		list.add(user1) ; 
		list.add(user2) ;  
		return list  ;
	}
	
}
