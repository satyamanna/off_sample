package com.test.projecttest;

import java.util.HashSet;
import java.util.Set;

public class OverrideHascodeEquals {

	public static void main(String[] args) {
		User  user = new User("abcd", "123456") ;
		User  user1 = new User("abcd", "123456") ;
		Set<User>  list  = new HashSet<User>() ;
		list.add(user);
		list.add(user1);
		System.out.println(list);
		//System.out.println(user);
	}
	
}


class  User{
	
	public String userName ; 
	public String password ;   
	
	
	User (String  userName  , String password ){
		this.userName =  userName  ; 
		this.password = password  ;
	}
	
	@Override
	public int hashCode() {
		
		return  31 * this.userName.hashCode()  +   this.password.hashCode()  ;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj!=null  &&  obj instanceof User) {
			User user=(User) obj  ;  
			if(user.userName.equals(this.userName) &&
					user.password.equals(this.password)
					) {
				return true ;
			}
		}
		else {
			return  false ;
		}
		return  false;  
	}


	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
	
	
	
}