package com.xworkz.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Solution6 {
	  public static void main(String[] args) throws IOException {
		  
		  
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int N = Integer.parseInt(bufferedReader.readLine().trim());
	        
	        for(int i = 2; i<=10; i++) {
	        	
	        	//System.out.println(N+" x "+i+"= "+result);
	        	 System.out.println(N + " x "+i+" = "+i*N);
	        	
	        }
	        bufferedReader.close();
	       // System.out.println("hi");
	        
	   }
}
