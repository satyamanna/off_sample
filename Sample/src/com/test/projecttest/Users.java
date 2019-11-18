package com.test.projecttest;

public class Users {
	
	public String userName ; 
	public String password ;   
	public Users() {
		
	}
	
	Users (String  userName  , String password ){
		this.userName =  userName  ; 
		this.password = password  ;
	}
	
	@Override
	public int hashCode() {
		
		return  31 * this.userName.hashCode()  +   this.password.hashCode()  ;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj!=null  &&  obj instanceof Users) {
			Users user=(Users) obj  ;  
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

	
	public String  getUser() {
		return "this" ; 
	}

	/*
	 * @Override public String toString() { return "User [userName=" + userName +
	 * ", password=" + password + "]"; }
	 */
	
	
	
}
