package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;


public class GuessNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			AlgorithmUtility au=new AlgorithmUtility();
			System.out.println("Enter any Number:");
			int n=sc.nextInt();
			int range=(int)(Math.pow(2,n-1));                //range calculation for the number
			System.out.println("Take number between '0' to "+range);
			int count=0;
			String input="null";
			int lower=0;
			int upper=range;
			int middle=(lower+upper/2);
			au.binarySearch(lower,upper,middle,count,input,n);
		}
		catch (ArrayIndexOutOfBoundsException ae)
		{
			ae.printStackTrace();
		}
	}




}

