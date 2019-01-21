/******************************************************************************
 *  Compilation:  javac -d bin powerof2.java
 *  Execution:    java -cp bin com.bridgelabz.utility.powerof2
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




public class powerof2 {

	public static void main(String[] args) {
		int t=0;
		do{
		@SuppressWarnings("resource")
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

	}while(t<6);
	}

}
