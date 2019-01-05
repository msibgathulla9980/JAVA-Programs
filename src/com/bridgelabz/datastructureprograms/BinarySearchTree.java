package com.bridgelabz.datastructureprograms;
import java.util.Scanner;

import com.bridgelabz.utility.*;
public class BinarySearchTree {

	public static void main(String[] args) {
        int t=0;
        do{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number Nodes:");
		int n=sc.nextInt();
		DataStructureUtility du=new DataStructureUtility();
		int count1, count2;

		// find count of BST and  

		count1 = du.countBST(n); 

		// print count of BST with n nodes.
		
		System.out.println("Count of Binary Search Trees with "+ n +" nodes is "+ count1); 
		
	}while(t<10);
	}

}
