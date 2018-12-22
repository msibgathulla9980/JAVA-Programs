package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

import java.util.Arrays;

public class FindTriplet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		FunctionalUtility fu = new FunctionalUtility();
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i=0;i<n;i++)
		{
			System.out.println("The elements are");
			arr[i]=sc.nextInt();
		}
		fu.Triplet(arr,n);

	}

}
