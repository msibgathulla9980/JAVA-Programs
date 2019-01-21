package com.bridgelabz.datastructureprograms;
/******************************************************************************
 *  Compilation:  javac -d bin BinarySearchTree .java
 *  Execution:    java -cp bin com.bridgelabz.datastructureprograms.BinarySearchTree  n
 *  
 *  Purpose: Program to count the number of Binary Trees.
 *
 *  @author  Mohammed Sibgathulla
 *  @version 1.0
 *  @since   5-12-2018
 *
 ******************************************************************************/
import java.util.Scanner;
import com.bridgelabz.utility.*;
public class BinarySearchTree {

	public static void main(String[] args) {
        int t=0;
        do{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number Nodes:");
		int n=sc.nextInt();
		int count1;

		// find count of BST and  

		count1 = DataStructureUtility.countBST(n); 

		// print count of BST with n nodes.
		
		System.out.println("Count of Binary Search Trees with "+ n +" nodes is "+ count1); 
		
	}while(t<10);
	}

}
