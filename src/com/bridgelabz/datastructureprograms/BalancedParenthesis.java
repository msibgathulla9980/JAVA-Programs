package com.bridgelabz.datastructureprograms;
import java.util.Scanner;

import com.bridgelabz.utility.DataStructureUtility;



/******************************************************************************
 * Purpose: Take an  Arithmetic Expression such as (5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) 
 * where parentheses are used to order the performance of operations.
 * Ensure parentheses must appear in a balanced fashion.
 *
 * @author Mohammed Sibgathulla
 * @version 1.0
 * @since 09-10-2018
 *
 ******************************************************************************/


public class BalancedParenthesis {

	public static void main(String[] args) {
		int t=0;
		do{
			//Stack<Integer> Stack=new Stack<Integer>();
		      Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the experssion in the form-(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)");
		        String exp=sc.nextLine();
		        boolean a1= DataStructureUtility.simpleBalancedParenthesis(exp);
		        System.out.println(a1);
		}while(t<10);
	}
}