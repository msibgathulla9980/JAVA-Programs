package com.bridgelabz.datastructureprograms;

/******************************************************************************
 *  Compilation:  javac -d bin PallindromeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.datastructure program.PallindromeChecker n
 *  
 *  Purpose: Program to Check Pallindrome Using Queue.
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   4-12-2018
 *
 ******************************************************************************/
import java.util.Scanner;
import com.bridgelabz.utility.DequeueUtility;
public class PallindromeChecker {

	public static void main(String[] args) 
	{
		int t=0;
		do{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	
		DequeueUtility<Character> utility=new DequeueUtility<Character>();
		System.out.println("Enter a String To Check Whether It is Pallindrome or Not : ");
		String s=sc.nextLine();

		//adding each character to the rear of the dequeue
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			utility.addRear(c);
		}
		int flag=0;

		while(utility.size()>1)
		{
			if(utility.removeFront()!=utility.removeRear())
			{
				flag=1;
				break;
			}
		}

		if(flag==0)
		{
			System.out.println("The Entered String is a Pallindrome");
		}
		else
		{
			System.out.println("The Entered String is not a Pallindrome");
		}
	}while(t<10);
	}
}
