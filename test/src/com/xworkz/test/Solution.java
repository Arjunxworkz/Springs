package com.xworkz.test;

public class Solution {
	static int N=24;

	public static void main(String[] args) {
	 /*   if(N%2==1 && N<=5) {
	    	 System.out.println("Weired 1");
	    	 
	    }
	    if (N%2==0){
	    	
	       	
		    if(N>=2 && N<=5) {
		    	System.out.println("Not Weired 2");
		    }
	    }
	    if(N%2==0) {
	    	
	    	if(N>=6 && N<=20) {
	    		 System.out.println("Weired 3(6-20)");
	    	}
	       
	    	
	    }
	    if(N%2==1) {
	    	if(N>=6 && N<=20) {
	    		 System.out.println("Weired 3 4(6-20)");
	    	}
   	}
	     if(N%2==0 ) {
	    	 if(N>20) {
	    		 System.out.println("Not Weired 4");  
	    	 }
	    	   	
	    }*/
		 if(N % 2 == 0 && N >= 2 && N <= 5){
		        System.out.println("Not Weird");
		    } else if (N >= 6 && N <= 20){
		        System.out.println("Weird");
		    } else if (N > 20  && N % 2 == 0){
		        System.out.println("Not Weird");
		    } else {
		        System.out.println("Weird");
		    }
	  
	     
	         }
	     }

	


