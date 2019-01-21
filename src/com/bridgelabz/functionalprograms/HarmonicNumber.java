/******************************************************************************
 *  Compilation:  javac -d bin HarmonicNumber.java
 *  Execution:    java -cp bin com.bridgelabz.utility.HarmonicNumber
 *  
 *  Purpose: Determines Number of Wins and Percentage of Win and Loss.
 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;
import java.util.Scanner;

import com.bridgelabz.utility.*;

public class HarmonicNumber {

	public static void main(String[] args) {
		int t=0;
		do{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth Harmonic Number:");
		int n=sc.nextInt();
		double m=FunctionalUtility.getHarmonicNumber(n);
		System.out.println("The Harmonic Value is" +m);
				
		}while(t<6);

	}

}
