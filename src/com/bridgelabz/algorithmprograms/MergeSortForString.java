/******************************************************************************
 *  Compilation:  javac -d bin MergeSortForString.java
 *  Execution:    java -cp bin com.bridgelabz.utility.MergeSortForString
 *  
 *  Purpose: Determines Sorted List Using Merge Sort.
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;


public class MergeSortForString {

	public static void main(String[] args) {
		int t=0;
		do{
		Scanner sc=new Scanner(System.in);
		AlgorithmUtility au=new AlgorithmUtility();
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
	   String arr[]=new String[n];
		System.out.println("Enter The Array Elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		au.mergeForstring(arr,n);

	    System.out.println("Given Array"); 
	    AlgorithmUtility.printArray(arr);  
	    AlgorithmUtility.sort(arr, 0, arr.length-1); 

	    System.out.println("\nSorted array"); 
	    au.printArray(arr); 
	}while(t<6);
	}
}
