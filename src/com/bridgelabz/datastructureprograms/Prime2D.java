package com.bridgelabz.datastructureprograms;
/******************************************************************************
 *  Compilation:  javac -d bin Prime2D.java
 *  Execution:    java -cp bin com.bridgelabz.datastructure program.Prime2D n
 *  
 *  Purpose: Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. 
 *           Store the prime numbers in a 2D Array, the first dimension represents the range 0-100, 100-200, and so on.
 *          While the second dimension represents the prime numbers in that range
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   4-12-2018
 *
 ******************************************************************************/
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.DataStructureUtility;

public class Prime2D {

	public static void main(String[] args) {
		List<List<Integer>> outterlist = new ArrayList<List<Integer>>();
        List<Integer> innerlist= new ArrayList<Integer>();
        System.out.println("prime number of the range 0 to 1000");
        int m=0;
        int n=100;
        for(int i=1;i<=10;i++)
        {
        innerlist= DataStructureUtility.primeNumbers(m,n);
        outterlist.add(innerlist);
        System.out.println("prime no between "+ m +" and "+  n);
        System.out.println(innerlist);
        m+=100;
        n+=100;
        }

	}

}
