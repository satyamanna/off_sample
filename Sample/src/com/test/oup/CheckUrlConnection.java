package com.test.oup;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class CheckUrlConnection {

	
	
	public static void main(String[] args) {
		 HttpURLConnection  myURLConnection =null ;
		 URL myURL=null;
		// HTTP
		/*
		 * System.setProperty("http.proxyHost", "http://ouparray.oup.com");
		 * System.setProperty("http.proxyPort", "8080");
		 * 
		 * */
		/*
		 * System.setProperty("https.proxyHost", "https://ouparray.oup.com");
		 * System.setProperty("https.proxyPort", "8080");
		 */
		 
		 Properties  prop =  System.getProperties() ;
		 for(Entry<Object, Object> m : prop.entrySet()) {
			System.out.println(m.getKey() + "==" +m.getValue()); 
		 }
		 
		 System.out.println(System.getProperty("https.proxyHost"));
		 try {
			 myURL = new URL("https://elt.uatv2.oup.com/?cc=gb&selLanguage=en");
		     myURLConnection = (HttpURLConnection )myURL.openConnection();
		     myURLConnection.connect();
		     
			/*
			 * for(Map.Entry<String, List<String>> l :
			 * myURLConnection.getHeaderFields().entrySet() ) { System.out.println("Key "
			 * +l.getKey() ); System.out.println("value "); for(String st : l.getValue()) {
			 * System.out.println(st); }
			 * System.out.println("#################################"); }
			 */
		   
		    System.out.println("Connected and response is " + myURLConnection.getResponseCode());
		} 
		catch (Exception e) { 
			e.printStackTrace();
		    System.out.println(e.getMessage());
		} 
		finally {
			myURLConnection.disconnect();
		}
		
	}
}
