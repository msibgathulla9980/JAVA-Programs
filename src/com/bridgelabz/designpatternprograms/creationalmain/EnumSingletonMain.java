package com.bridgelabz.designpatternprograms.creationalmain;

import com.bridgelabz.designpatternprograms.creational.EnumSingleton;

public class EnumSingletonMain {

	public static void main(String[] args) {
		EnumSingleton enumsingleton= EnumSingleton.INSTANCE;
		EnumSingleton dosomething=EnumSingleton.doSomething();
		System.out.println(enumsingleton);
		System.out.println(dosomething);
	}

}
