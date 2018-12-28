/******************************************************************************
 *  Compilation:  javac -d bin Anagram.java
 *  Execution:    java -cp bin com.bridgelabz.utilitys.Anagram n
 *  
 *  Purpose: Determines The Two Strings are Anagram or not
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

import java.util.Arrays;


public class Anagram {

	public static void main(String[] args) {
		int t=0;
		do{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Str1:");
		String str1=sc.nextLine();
		System.out.println("Enter Str2:");
		String str2=sc.nextLine();
		AlgorithmUtility.isAnagram(str1,str2);
	}while(t<6);


	}

}
