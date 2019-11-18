package com.test.projecttest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BuilderTest {

	
	  public static void main(String[] args)   {
		//Pojo pojo  = new Pojo() ;
		  try {
		Class  class_   = Class.forName("com.test.projecttest.Pojo").getClass() ;
		Method method =  class_.getMethod("getUserName", null);
			try {
				method.invoke(class_.newInstance(), null) ;
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		  }
		  
		  catch(ClassNotFoundException |  IllegalAccessException |   InstantiationException | NoSuchMethodException e ) {
			  
		  }
		 
		
		
	}
}


class Pojo{
	
	private String userName   ;
	private String Password ;
	private String email ;
	private Pojo() {
		
	}
	
	
	public String getUserName() {
		return "rr";
	}
	public Pojo setUserName(String userName) {
		this.userName  =  userName   ;
		return this  ;
	}
	public String getPassword() {
		return Password;
	}
	public Pojo setPassword(String password) {
		Password = password;
		return this  ;
	}
	public String getEmail() {
		return email;
	}
	public Pojo setEmail(String email) {
		this.email = email;
		return this  ;
	}
	
	
	
	
	
	
	
	
}












