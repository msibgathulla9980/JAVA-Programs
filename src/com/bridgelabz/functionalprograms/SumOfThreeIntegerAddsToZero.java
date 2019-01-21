/******************************************************************************
 *  Compilation:  javac -d bin SumOfNumberAddsTo0.java
 *  Execution:    java -cp bin com.bridgelabz.utility.umOfNumberAddsTo0
 *  
 *  Purpose: Determines number of distinct triplets as well as the second output is to print the distinct triplets.
 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;



public class SumOfThreeIntegerAddsToZero 
{
    /*
    * The main function is written to take input from the user and
    * call sumZero function that counts the 
    * number of triples that sum to exactly 0.
    */

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total number of elements in an array");
        int num=sc.nextInt();//user input
        int [] arr=new int[num];
        for(int i=0;i<num;i++)
        {
            System.out.println("enter array of "+i);
            arr[i]=sc.nextInt();//user input
        }
        int n=arr.length;
        //Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
        FunctionalUtility.sumOfInterger(arr,n);
        sc.close();


    }

}



