/******************************************************************************
 *  Compilation:  javac -d bin LeapYear.java
 *  Execution:    java -cp bin com.bridgelabz.utility.LeapYear
 *  
 *  Purpose: Determines if it is a Leap Year
 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   27-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class LeapYear {

	public static void main(String[] args) {
		int t=0;
		do{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int r = sc.nextInt();
		FunctionalUtility.getLeap(r);

	}while(t<6);
	}

}
