/******************************************************************************
 *  Compilation:  javac -d bin TemperatureConversion.java
 *  Execution:    java -cp bin com.bridgelabz.utility.TemperatureConversion
 *  
 *  Purpose:Given the temperature in fahrenheit as input outputs the temperature in Celsius or viceversa
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

public class TemperatureConversion {

	public static void main(String[] args) {
		int t=0;
		do{
		AlgorithmUtility au=new AlgorithmUtility();
		au.temperatureConversion();

	}while(t<6);
	}

}
