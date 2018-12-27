/******************************************************************************
 *  Compilation:  javac -d bin PrimeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeChecker n
 *  
 *  Purpose: Determines the Nth Harmonic Value.

 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.*;

import java.lang.Math.*;

public class powerof2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the power of 2:");
		int n = sc.nextInt();
		if (n >= 0 && n < 31) {
			int count = 0;
			for (int i = 0; i <= n; i++) {
				System.out.println(Math.pow(2, count));
				count++;
			}
		} else
			System.out.println("The value should be greater than or equal to 0");

	}

}
