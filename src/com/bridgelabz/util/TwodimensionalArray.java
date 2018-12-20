package com.bridgelabz.util;
import com.bridgelabz.functionalprograms.*;
import java.util.*;
public class TwodimensionalArray 
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the rows:");
	int m=sc.nextInt();
	System.out.println("Enter the Columns:");
	int n=sc.nextInt();
	System.out.println("Enter the numbers of the matrix:");
	int [][]array=new int[m][n];
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			array[i][j]=sc.nextInt();
		}
		
	}
	displayarray(array,m,n);
	
	
	}

	public static void displayarray(int [][]array,int m,int n )
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(array[i][j]+" ");
			}
		}
	}
}

