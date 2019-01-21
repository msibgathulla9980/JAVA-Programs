/******************************************************************************
 *  Compilation:  javac -d bin TwoDArray.java
 *  Execution:    java -cp bin com.bridgelabz.utility.TwoDArray
 *  
 *  Purpose: create 2 dimensional array in memory to read in M rows and N cols.
 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class TwoDArray {

	@SuppressWarnings({ "unchecked", "unchecked" })
	public static void main(String[] args) {
		int t=0;
	
		do{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("rawtypes")
		FunctionalUtility fu=new FunctionalUtility();
		System.out.println("Enter the no of rows:");
		int m=sc.nextInt();
		System.out.println("Enter the no of cols:");
		int n=sc.nextInt();
		System.out.println("1.Integer Array 2.Double Array 3.Boolean Array:");
		int flag=sc.nextInt();
		System.out.println("Enter the Array Elements:");
switch(flag)
{
case 1:
	
	Integer[][] array=new Integer[m][n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
		
			array[i][j]=sc.nextInt();
			
		}
	}
	System.out.println("The Integer Array Entered is:");
	fu.displayarray(array,m,n);
		break;

case 2:
	Double[][] darray=new Double[m][n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
		
			darray[i][j]=sc.nextDouble();
			
		}
	}
	System.out.println("The Double Array Entered is:");
		fu.displayarray(darray,m,n);
		break;
	

	case 3:
		Boolean[][] barray=new Boolean[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			
				barray[i][j]=sc.nextBoolean();
				
			}
		}
		System.out.println("The Boolean Array Entered is:");
			fu.displayarray(barray,m,n);
			break;

		default: System.out.println("Select one among the three");
                 break;
}

	}
	while(t<6);
	}
}
