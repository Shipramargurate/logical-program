package com.bridgelab.logicalprob;

import java.util.Scanner;

public class PerfectNum {
	public static void main(String[] args) {
		int k , Number, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enterr number=");
		Number = sc.nextInt();
		sc.close();
		for (k = 1; k < Number; k++)
		{
			if(Number % k == 0 )
				sum = sum + k;
		}
	if (sum == Number)
	{
		System.out.println("% d is a perfect number");
	}
	else
	{
		System.out.println("% d is not a perfect number");	
	}
		}

	}


