/******************************************************************************
 *  Compilation:  javac -d bin Anagram.java
 *  Execution:    java -cp bin com.bridgelabz.utilitys.Anagram n
 *  
 *  Purpose: Determines The Two Strings are Anagram or not
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.utility.AlgorithmUtility;

import java.util.Arrays;


public class Anagram {

	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		int t=0;
		do{
        String str1, str2;
        System.out.print("Enter First String : ");
        str1 = sc.nextLine();
        System.out.print("Enter Second String : ");
        str2 = sc.nextLine();
        int len1 = str1.length();                          //len1 holds Length of first String
        int len2 = str2.length();
        str2=str2.toUpperCase(); 
        str1=str1.toUpperCase(); 
        //len1 holds Length of first String
        if(len1 == len2)                                   // Check for string length are equal or not
        {
            boolean a=AlgorithmUtility.isAnagram(str2,str1);
            if(!a){
                System.out.println("Strings are not Anagram to Each Other");
            }
            else
                System.out.println("Strings are Anagram");
        }
        else
        {
            System.out.print("length of both Strings should be equal");//print if length ar e not equal
        }
		}while(t<6);
    }
}