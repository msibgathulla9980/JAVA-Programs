package com.bridgelabz.designpatternprograms.creational;

public class StaticBlockSingletonMain {
	public static void main(String[] args) {
		
		StaticBlockSingleton staticblocksingleton=StaticBlockSingleton.getInstance();
		System.out.println(staticblocksingleton);

	}
}


