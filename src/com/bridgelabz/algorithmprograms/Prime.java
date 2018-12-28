/******************************************************************************
 *  Compilation:  javac -d bin Prime.java
 *  Execution:    java -cp bin com.bridgelabz.utility.Prime
 *  
 *  Purpose: Determines range of 0 - 1000 Numbers and find the Prime numbers in that range. 

 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

public class Prime {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		AlgorithmUtility au=new AlgorithmUtility();
		au.Prime();
	
	}

}
