/******************************************************************************
 *  Compilation:  javac -d bin StopWatch.java
 *  Execution:    java -cp bin com.bridgelabz.utility.StopWatch
 *  
 *  Purpose: Determines the elapsed time. 
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


public class StopWatch { 
	public static void main(String[] args) {
		int t=0;
	do{
		FunctionalUtility fu = new FunctionalUtility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter '1' to start:");
		long start=sc.nextLong();
		fu.start();
		System.out.println("Enter '0' number to end:");
		long end=sc.nextLong();
		fu.end();
		System.out.println("Enter any key to display the elapsed time:");
		long elapse=sc.nextLong();
		fu.elapse();
	}while(t<6);
}

	
}