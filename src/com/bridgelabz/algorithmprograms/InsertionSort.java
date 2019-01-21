/******************************************************************************
 *  Compilation:  javac -d bin InsertionSort.java
 *  Execution:    java -cp bin com.bridgelabz.utility.InsertionSort
 *  
 *  Purpose: Determines the Sorted List Using Insertion Sort 

 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;



public class InsertionSort {

	public static void main(String[] args) {
		int t=0;
		do{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("rawtypes")
		AlgorithmUtility au=new AlgorithmUtility();
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter The Array Elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		au.insertionSort(a,n);

	}while(t<6);
	}

}
