/******************************************************************************
 *  Compilation:  javac -d bin PrimeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeChecker n
 *  
 *  Purpose: Determines Binary Search For String.
 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

public class BinsrcforString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AlgorithmUtility au=new AlgorithmUtility();
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
	   String a[]=new String[n];
		System.out.println("Enter the value of key:");
		String key=sc.next();
		System.out.println("Enter The Array Elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		au.binarySearchforstr(a,key);
		
	}

}
