package com.bridgelabz.designpatternprograms.creational;

public class ThreadSafeSingletonUsingDoubleLockingMain {

	public static void main(String[] args) {
		ThreadSafeSingletonUsingDoubleLocking threadsafesingletonusingdoublelocking=ThreadSafeSingletonUsingDoubleLocking.getInstanceUsingDoubleLocking();
	    System.out.println(threadsafesingletonusingdoublelocking);
	}

}
