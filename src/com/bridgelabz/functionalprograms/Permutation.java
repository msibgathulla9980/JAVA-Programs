

/******************************************************************************
 * *  Compilation:  javac -d bin Permutation.java
 *  Execution:    java -cp bin com.bridgelabz.utility.Permutation
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

import java.util.Arrays;

public class Permutation {

	public static void main(String[] args) {
		int t=0;
		do{
		  FunctionalUtility fu = new FunctionalUtility();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter a string");
	        String str = sc.next();
	        int len = str.length();
	        System.out.println("recursion of a string is ");
	        fu.recursion(str, 0, len);
	        System.out.println("iteration of a string is ");
	        fu.iteration(str);
		}while(t<6);
	}

}
