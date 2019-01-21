/******************************************************************************
 *  Compilation:  javac -d bin WindChill.java
 *  Execution:    java -cp bin com.bridgelabz.utility.WindChill
 *  
 *  Purpose: Determines the effective temperature using Math.pow(a, b).
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;


import com.bridgelabz.utility.FunctionalUtility;


class WindChill {

	public static void main(String[] args) {
		int t=0;
		do{
		
		
		FunctionalUtility.windChill();
	}while(t<6);
}
}
