/******************************************************************************
 *  Compilation:  javac -d bin BinSrcUsingFileInput.java
 *  Execution:    java -cp bin com.bridgelabz.utility.BinSrcUsingFileInput
 *  
 *  Purpose: Determines Binary Search Usong File Input.
 *
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
public class BinSrcUsingFileInput {
	
	public static void main( String[] args ) throws FileNotFoundException   {
		int t=0;
		do{
		AlgorithmUtility au=new AlgorithmUtility();
		au.binSrcFile();
	}while(t<6);
	
}
}
