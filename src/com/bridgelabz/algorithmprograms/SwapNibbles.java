/******************************************************************************
 *  Compilation:  javac -d bin Nibbles.java
 *  Execution:    java -cp bin com.bridgelabz.utility.Nibbles
 *  
 *  Purpose: convert from Decimal to Binary,Swap nibbles,find the new number
and Find the resultant number is the number is a power of 2.

 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;
public class SwapNibbles {

	public static void main(String[] args) {
		int t=0;
		do{
		@SuppressWarnings("resource")
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
	        System.out.println("The Resultant is not the Power Of 2");
	      }
	    
	    
	}
	while(t<6);
}

}
