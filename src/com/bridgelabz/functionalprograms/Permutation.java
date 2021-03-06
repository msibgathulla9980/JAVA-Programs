

/******************************************************************************
 * *  Compilation:  java c -d bin Permutation.java
 *  Execution:    java -c p bin com.bridgelabz.utility.Permutation
 * Purpose: static functions to return all permutation of a String using
 * iterative method and Recursion method
 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/package com.bridgelabz.functionalprograms;
import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;


public class Permutation {

	public static void main(String[] args) {
		int t=0;
		do{
		 
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        System.out.println("enter a string");
	        String str = sc.next();
	        int len = str.length();
	        System.out.println("recursion of a string is ");
	        FunctionalUtility.recursion(str, 0, len);
	        System.out.println("iteration of a string is ");
	        FunctionalUtility.iteration(str);
		}while(t<6);
	}

}
