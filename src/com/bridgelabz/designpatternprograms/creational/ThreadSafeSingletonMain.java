package com.bridgelabz.designpatternprograms.creational;

public class ThreadSafeSingletonMain {

	public static void main(String[] args) {
		ThreadSafeSingleton threadsafesingleton=ThreadSafeSingleton.getInstance();
		System.out.println(threadsafesingleton);
	}
	}
	

