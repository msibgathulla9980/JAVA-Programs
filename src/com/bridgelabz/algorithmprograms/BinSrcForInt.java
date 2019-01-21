/******************************************************************************
 *  Compilation:  javac -d bin BinSrcForInt.java
 *  Execution:    java -cp bin com.bridgelabz.utilitys.BinSrcForInt
 *  
 *  Purpose: Determines Binary Search for int
 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

public class BinSrcForInt {

	public static void main(String[] args) {
		int t=0;
		do{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("rawtypes")
		AlgorithmUtility au=new AlgorithmUtility();
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the value of key:");
		int key=sc.nextInt();
		System.out.println("Enter The Array Elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		au.Binsrcforint(a,key);
		
	}while(t<6);

}
}
