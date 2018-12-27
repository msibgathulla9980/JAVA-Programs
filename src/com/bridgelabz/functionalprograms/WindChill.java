/******************************************************************************
 *  Compilation:  javac -d bin PrimeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeChecker n
 *  
 *  Purpose: Determines the effective temperature using Math.pow(a, b).
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;
import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

import java.util.Arrays; 
class WindChill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FunctionalUtility fu=new FunctionalUtility();
		fu.windChill();
	}

}
