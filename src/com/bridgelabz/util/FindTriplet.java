package com.bridgelabz.util;

import java.util.Scanner;
import java.util.Arrays;
import com.bridgelabz.functionalprograms.FunctionalUtility;

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
