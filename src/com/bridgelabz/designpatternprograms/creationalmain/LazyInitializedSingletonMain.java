package com.bridgelabz.designpatternprograms.creationalmain;

import com.bridgelabz.designpatternprograms.creational.LazyInitializedSingleton;

public class LazyInitializedSingletonMain {
	
	public static void main (String args[]) {
		
		LazyInitializedSingleton lazyinitializedsingleton=LazyInitializedSingleton.getInstance();
		System.out.println(lazyinitializedsingleton);
		
	}	
}
