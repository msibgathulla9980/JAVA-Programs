package com.bridgelabz.designpatternprograms.creationalmain;

import java.lang.reflect.Constructor;

import com.bridgelabz.designpatternprograms.creational.EagerInitializedSingleton;

public class ReflectionSingletonTestMain {

	public static void main(String[] args) {
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        @SuppressWarnings({ "rawtypes", "unused" })
		Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
        instanceTwo=EagerInitializedSingleton.getInstance();
        System.out.println(instanceOne.hashCode());
        
      System.out.println(instanceTwo.hashCode());
		
	}

}
