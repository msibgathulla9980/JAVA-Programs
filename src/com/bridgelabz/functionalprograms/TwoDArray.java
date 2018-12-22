package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FunctionalUtility fu=new FunctionalUtility();
		System.out.println("Enter the no of rows:");
		int m=sc.nextInt();
		System.out.println("Enter the no of cols:");
		int n=sc.nextInt();
		System.out.println("1.integer 2.Double 3.boolean:");
		int flag=sc.nextInt();
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
			fu.displayarray(barray,m,n);
			break;

		default: System.out.println("Select one among the three");
                 break;
}

	}
	}
