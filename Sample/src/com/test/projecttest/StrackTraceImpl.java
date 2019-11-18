package com.test.projecttest;

public class StrackTraceImpl {

	public static void main(String[] args) {
		ProjectTemplate proTem =  new ProjectTemplate() ;
		proTem.add();
	}
	
}

 class ProjectTemplate{
	
	 
	 public void add() {
		// TODO Auto-generated method stub
		 StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace() ;
		 for(StackTraceElement st : stackTraceElements) {
			 System.out.println(""
			 + "\nFile Name "+st.getFileName() 
			 + "\nClass Name " + st.getClassName() 
		     + "\nMethod Name " + st.getMethodName() 
		     + "\nLine  Number " +  st.getLineNumber());
		 }

	}
}

