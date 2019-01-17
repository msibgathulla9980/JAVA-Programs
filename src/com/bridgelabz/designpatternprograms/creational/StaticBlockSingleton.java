package com.bridgelabz.designpatternprograms.creational;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {
		
	}
	static {
		try {
		instance=new StaticBlockSingleton();
		}
		catch (Exception e) {
			throw new RuntimeException("Exception Occured In Creating a Singleton Instance");	
		}
	}
	
	public static StaticBlockSingleton getInstance(){
		return instance;
	}
}
