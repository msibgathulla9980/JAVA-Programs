package com.bridgelabz.designpatternprograms.creationalmain;

import com.bridgelabz.designpatternprograms.creational.EagerInitializedSingleton;

public class EagerInitializedSingletonMain {

	public static void main(String[] args) {
		EagerInitializedSingleton eagerinitialisationsingleton=EagerInitializedSingleton.getInstance();
        System.out.println(eagerinitialisationsingleton);
	}

}
