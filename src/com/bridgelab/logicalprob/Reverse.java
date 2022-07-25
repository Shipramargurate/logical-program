package com.bridgelab.logicalprob;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

	    int num , reverse = 0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a Number");
	    num=sc.nextInt();
	    System.out.println("Original Number: " + num);
	    sc.close();    
	  while(num != 0)
	  {
	    num /= 10;
	    }
	    System.out.println("Reversed Number: " + reverse);
	  }
	}

