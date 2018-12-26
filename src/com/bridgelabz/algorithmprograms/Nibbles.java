package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
public class Nibbles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=sc.nextInt();
		int result;
		result=AlgorithmUtility.swapNibbles(x);
	    System.out.println("The swapped nibble in decimal is:" +result); 
	    AlgorithmUtility.toBinaryfornibble(result);
	   boolean number= AlgorithmUtility.isPowerOfTwo(result);
	    if (number) {
	        System.out.println("The Resultant is the Power Of 2");
	      } else {
	        System.out.printf("The Resultant is not the Power Of 2");
	      }
	    
	    
	}

}
