/******************************************************************************
 *  Compilation:  javac -d bin ToFindPrimeAnagram.java
 *  Execution:    java -cp bin com.bridgelabz.utility.ToFindPrimeAnagram
 *  
 *  Purpose: Determines the prime numbers that are Anagram and Palindrome 

 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;


import com.bridgelabz.utility.FunctionalUtility;



public class ToFindPrimeAnagramAndPallindrome {
		public static void main(String[] args) {
			
		System.out.println("The Prime Nos between 0 to 1000 which are also the  Pallindrome");
		FunctionalUtility.primePallindrome();
		System.out.println();
		System.out.println("The Numbers which are Prime, Pallindrome and Anagrams :");
		FunctionalUtility.primeAnagrams();
		

		}
}
