/******************************************************************************
 *  Compilation:  javac -d bin MonthlyPayment.java
 *  Execution:    java -cp bin com.bridgelabz.utility.MonthlyPayment
 *  
 *  Purpose: Determines monthlyPayment
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;


import com.bridgelabz.utility.AlgorithmUtility;

public class MonthlyPayment {

	public static void main(String[] args) {
		int t=0;
		do{
		@SuppressWarnings("rawtypes")
		AlgorithmUtility au=new AlgorithmUtility();
		au.monthlyPayment();

	}while(t<6);
	}

}
