/******************************************************************************
 *  Compilation:  javac -d bin PrimeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeChecker n
 *  
 *  Purpose: Determines the prime numbers that are Anagram and Palindrome 

 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

import java.util.Arrays;

public class ToFindPrimeAnagramAndPallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("The Prime Nos between 0 to 1000 which are also the  Pallindrome");
		FunctionalUtility.primePallindrome();
		System.out.println();
		System.out.println("The Numbers which are Prime, Pallindrome and Anagrams :");
		FunctionalUtility.primeAnagrams();
	}

}
