package com.bridgelab.logicalprob;

public class Fabonacci {
	public static void main(String[] args) {
 int n , firstTerm = 0, secondTerm =1;
 Scanner sc= new Scanner(System.in);
 System.out.println("enter the value of n");
 n=sc.nextInt();
 System.out.println("fabonacci series till" + n + "terms:");
 sc.close();
 for (int i = 1; i <= n; i++);
 System.out.println( firstTerm + ",");
 int nextTerm = firstTerm + secondTerm;
 firstTerm = secondTerm;
 secondTerm = nextTerm;
 
	 

	}


}
