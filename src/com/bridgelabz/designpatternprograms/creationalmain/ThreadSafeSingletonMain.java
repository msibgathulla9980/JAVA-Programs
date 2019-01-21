package com.bridgelabz.designpatternprograms.creationalmain;

import com.bridgelabz.designpatternprograms.creational.ThreadSafeSingleton;

public class ThreadSafeSingletonMain {

	public static void main(String[] args) {
		ThreadSafeSingleton threadsafesingleton=ThreadSafeSingleton.getInstance();
		System.out.println(threadsafesingleton);
	}
	}
	

