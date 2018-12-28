/******************************************************************************
 *  Compilation:  javac -d bin ToBinary.java
 *  Execution:    java -cp bin com.bridgelabz.utility.ToBinary
 *  
 *  Purpose: To Convert From Decimal To Binary.
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

public class ToBinary {

	public static void main(String[] args) {
		int t=0;
		do{
		AlgorithmUtility au=new AlgorithmUtility();
		au.toBinary();

	}while(t<6);
	}

}
