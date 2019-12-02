package com.satya.threadtest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TheadTest {

	
		  public static void main(String[] args)  {
			  ReadTxtFile readTxtFile  = new   ReadTxtFile();
			  Thread threadOne  = new Thread( new ThreadOne(readTxtFile, "ThreadOne")  ) ;
			  Thread threadTwo  = new Thread( new ThreadOne(readTxtFile, "ThreadTwo") ) ;
			  
			  threadOne.start();
			  threadTwo.start();
			  
			
		}
}



///  thread one  
class ThreadOne implements Runnable{
	ReadTxtFile readFile  = null;
	private String  threadName = null; 
	ThreadOne(final  ReadTxtFile readFile, final String  threadName ){
		this.readFile  =  readFile;
		this.threadName  =  threadName ;
		
	}
	@Override
	public void run() {
		
		this.readFile.read(threadName);
	}
	
}


//   thread two 
class ThreadTwo implements Runnable{
	ReadTxtFile readFile  = null;
	private String  threadName = null; 
	ThreadTwo(final  ReadTxtFile readFile, final String  threadName ){
		this.readFile  =  readFile;
		this.threadName  =  threadName ;
		
	}
	@Override
	public void run() {
		
		this.readFile.read(threadName);
	}
	
}



class  ReadTxtFile{
	
	       public  void  read( String threadName)  {
	    	  try {
	    	   System.out.println(threadName+" is accessing this");
	    	   File  file = null; 
	    	   InputStream fileInputStream = null;
	    	   InputStreamReader  inputStreamReader  = null; 
	    	   BufferedReader  bufferreader =  null;
	    	   String  st  = null;
			   try {
				   file = new File("/home/satyajit/Desktop/a.txt") ;
				   fileInputStream =  new FileInputStream(file) ;
				   inputStreamReader = new InputStreamReader(fileInputStream) ;
				   bufferreader= new BufferedReader(inputStreamReader) ; 
				   
				   while((st = bufferreader.readLine()) != null) {
					   System.out.println(st);
				   }
			   }
			   catch (Exception e) {
					  e.printStackTrace();
				}
				
			   finally  {
				   
				     inputStreamReader.close();
				     fileInputStream.close();
				     st = null ;
			  }
	    	  }
	    	  catch(Exception e) {
	    		     e.printStackTrace();
	    	  }
			  
	       }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
