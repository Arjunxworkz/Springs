package com.xworkz.test;

import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		  System.out.println("enter t");
		  int t=in.nextInt();
	        for(int i=0;i<t;i++){
	        	System.out.println("a");
	            int a = in.nextInt();
	            System.out.println("enter b");
	            int b = in.nextInt();
	            System.out.println("enter n");
	            int n = in.nextInt();
	            int calc = a;
	            for(int j=0;j<n;j++)
	            	
	            {
	            	//System.out.print("j");
	                calc+=(Math.pow(2,j)*b);
	                System.out.print(calc+" ");
	            }
	            System.out.println();
	        }
	        
	        in.close();

	}

}
