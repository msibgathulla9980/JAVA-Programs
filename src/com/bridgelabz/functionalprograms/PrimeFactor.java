/******************************************************************************
 *  Compilation:  javac -d bin PrimeFactor.java
 *  Execution:    java -cp bin com.bridgelabz.utility.PrimeFactor
 *  
 *  Purpose: Print the prime factors of number N.
 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;
import com.bridgelabz.utility.*;
import java.util.Scanner;
public class PrimeFactor {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter no to find prime factors");
		int n = AlgorithmUtility.userInteger();
		System.out.println("prime factors are ");
		FunctionalUtility.primeFactors(n);
		// System.out.println(isPrime(n));
		s.close();
	}

}
