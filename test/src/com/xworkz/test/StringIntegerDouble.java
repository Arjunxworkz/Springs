package com.xworkz.test;

import java.util.Scanner;

public class StringIntegerDouble {
	  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println(" enter the int  number ");
	        int i = scan.nextInt();
	        
	        System.out.println(" enter the double number ");
	        double d = scan.nextDouble();
	        
	        System.out.print("enter the string ");
	        scan.nextLine();
	        String s = scan.nextLine();
	        // Write your code here.

	       
			System.out.println("String: " + s);
	       
			System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	    }
}
