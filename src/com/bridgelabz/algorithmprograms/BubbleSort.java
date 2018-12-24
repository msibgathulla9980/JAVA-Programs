package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Elements: ");
		int n=sc.nextInt();
		System.out.println("Enter the Array Elements: ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		AlgorithmUtility au=new AlgorithmUtility();
		au.bubbleSort(arr,n);
		
		
	}

}