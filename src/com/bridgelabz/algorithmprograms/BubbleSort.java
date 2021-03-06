/******************************************************************************
 *  Compilation:  javac -d bin BubbleSort.java
 *  Execution:    java -cp bin com.bridgelabz.utility.BubbleSort
 *  
 *  Purpose: Determines  Sorted List Using bubble Sort
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;


public class BubbleSort {

	public static void main(String[] args) {
		int t=0;
		do{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the Array Elements: ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		@SuppressWarnings("rawtypes")
		AlgorithmUtility au=new AlgorithmUtility();
		au.bubbleSort(arr,n);
		
		
	}while(t<6);
	}

}
