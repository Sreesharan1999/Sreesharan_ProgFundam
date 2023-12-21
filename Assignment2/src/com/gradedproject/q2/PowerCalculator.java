package com.gradedproject.q2;

import java.util.Scanner;

public class PowerCalculator {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the value of X: ");
	        int x = scanner.nextInt();

	        System.out.print("Enter the value of N: ");
	        int n = scanner.nextInt();

	        long result = power(x, n);

	        System.out.println(x + " raised to the power of " + n + " is: " + result);
	    }

	    private static long power(int x, int n) {
	        if (n == 0) {
	            return 1;
	        } else if (n % 2 == 0) {
	           
	            long temp = power(x, n / 2);
	            return temp * temp;
	        } else {
	           
	            return x * power(x, n - 1);
	        }
	    }

}
