package com.xworkz.test;

import java.util.Scanner;

public class FiftinChar {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        System.out.println("================+================");
       // System.out.println("enter string");
        //System.out.println("enter integer");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
           
            int x=sc.nextInt();
            
            System.out.printf("%-15s%03d%n",s1,x);;
      
	}
        System.out.println("================================");

}}
