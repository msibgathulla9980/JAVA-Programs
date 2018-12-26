package com.bridgelabz.functionalprograms;
import java.util.Scanner;

import com.bridgelabz.utility.FunctionalUtility;

import java.util.Arrays;

public class Permutation {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in);) {
			System.out.println("enter a string");
			String s1 = s.nextLine();
			FunctionalUtility.permutIteration(s1);

		} catch (Exception e) {
			System.out.println("enter correct input");
		}
	}

}
