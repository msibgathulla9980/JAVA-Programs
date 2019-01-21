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


import com.bridgelabz.utility.FunctionalUtility;



public class StopWatch { 
	public static void main(String[] args) {
		int t=0;
	do{
		 
		System.out.println("Enter '1' to start:");
		FunctionalUtility.start();
		System.out.println("Enter '0' number to end:");
		FunctionalUtility.end();
		System.out.println("Enter any key to display the elapsed time:");
		FunctionalUtility.elapse();
	}while(t<6);
}

	
}