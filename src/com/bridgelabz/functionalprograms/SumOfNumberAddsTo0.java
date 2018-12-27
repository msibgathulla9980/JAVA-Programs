/******************************************************************************
 *  Compilation:  javac -d bin PrimeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeChecker n
 *  
 *  Purpose: Determines number of distinct triplets as well as the second output is to print the distinct triplets.
 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

import java.util.Arrays;

public class SumOfNumberAddsTo0 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		System.out.println("enter no of inputs");
		int n = sc.nextInt();
		
		FunctionalUtility.sum0count(n);

	}

	}

