package com.bridgelabz.designpatternprograms.creationalmain;

import com.bridgelabz.designpatternprograms.creational.StaticBlockSingleton;

public class StaticBlockSingletonMain {
	public static void main(String[] args) {
		
		StaticBlockSingleton staticblocksingleton=StaticBlockSingleton.getInstance();
		System.out.println(staticblocksingleton);

	}
}


