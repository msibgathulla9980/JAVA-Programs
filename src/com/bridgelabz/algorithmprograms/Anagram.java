package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

import java.util.Arrays;


public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Str1:");
		String str1=sc.nextLine();
		System.out.println("Enter Str2:");
		String str2=sc.nextLine();
		AlgorithmUtility au=new AlgorithmUtility();
		au.Anagram(str1,str2);



	}

}
