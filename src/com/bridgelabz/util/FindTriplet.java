package com.bridgelabz.util;
import java.util.Scanner;

import com.bridgelabz.functionalprograms.FunctionalUtility;

public class FindTriplet {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
        int A[] = { 1, 4, 45, 6, 10, 8 }; 
        int sum = 22; 
        int arr_size = A.length; 
        FunctionalUtility fu=new FunctionalUtility();
        fu.findTriplets(A, arr_size, sum);
         
	}

	
		
	}
