/******************************************************************************
 *  Compilation:  javac -d bin FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.utility.FlipCoin
 *  
 *  Purpose: Percentage of Head vs Tails.
 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;
import java.util.Scanner;

import com.bridgelabz.utility.*;

public class FlipCoin {
static int t=0;
	public static void main(String[] args) {
	do{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of times the coin is being flipped:");
		int n=sc.nextInt(); 
		FunctionalUtility fu=new FunctionalUtility();
		fu.getCount(n);
	}while(t<6);
	}

}
