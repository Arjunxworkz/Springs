package com.xworkz.test;

import java.util.Scanner;

public class FiftinChar {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        
       
        for(int i=0;i<3;i++)
        	
        {
        	System.out.println("enter the str");
        	
			
            String s1=sc.nextLine();
           // s1.nextLine();
            
            System.out.println("enter the int");
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n",s1,x);
        }
        System.out.println("================================");
	}

}
