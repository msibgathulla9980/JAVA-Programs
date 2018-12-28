/******************************************************************************
 *  Compilation:  javac -d bin VendingMachine.java
 *  Execution:    java -cp bin com.bridgelabz.utility.VendingMachine
 *  
 *  Purpose: Determines Two Outputs - one the number of minimum Note needed to give the change and second list of Rs Notes that would given in the Change

 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class VendingMachine {

	public static void main(String[] args) {
		int t=0;
		do{
		AlgorithmUtility au=new AlgorithmUtility();
		au.vendingMachine();

	}while(t<6);
	}

}
