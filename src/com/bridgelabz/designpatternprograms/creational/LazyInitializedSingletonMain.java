package com.bridgelabz.designpatternprograms.creational;

public class LazyInitializedSingletonMain {
	
	public static void main (String args[]) {
		
		LazyInitializedSingleton lazyinitializedsingleton=LazyInitializedSingleton.getInstance();
		System.out.println(lazyinitializedsingleton);
		
	}	
}
