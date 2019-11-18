package com.test.projecttest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.FileAlreadyExistsException;

public class ClassLoaderExample {

	
	   
	    public static void main(String[] args) {
			try {
				Class<?> class_instance=  Class.forName("com.test.projecttest.ClassLoaderExample") ;
				System.out.println("####"+class_instance.getCanonicalName());
				Method  method =  class_instance.getMethod("loadClass_Reflextion", null);
				method.invoke(class_instance.newInstance(), null) ;
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	    	
		}
	    
	    
	    public  void  loadClass_Reflextion() throws 
	    				ClassNotFoundException, 
	    				FileAlreadyExistsException, 
	    				NoSuchMethodException, 
	    				SecurityException, 
	    				IllegalAccessException, 
	    				IllegalArgumentException, 
	    				InvocationTargetException,
	    				InstantiationException {
	    	
	    	    try {
	    	    	ClassLoader classloaders   = this.getClass().getClassLoader(); ;
	    	    	Class<?> classInstance = classloaders.loadClass("com.test.projecttest.Users");
					System.out.println("@@@@"+classInstance.getCanonicalName());
					Method[]  methods  =  classInstance.getMethods() ;
			    	
			    	Method  method  =  classInstance.getMethod("getUser", null) ;
			    	System.out.println(method.invoke(classInstance.newInstance(), null));
				} finally {
					// TODO: handle finally clause
					
				}
	    		
			
	    	
	    }
	    
	    
}
