package com.bridgelabz.creational.factorypattern;

import com.bridgelabz.creational.factorypattern.Computer;
import com.bridgelabz.creational.factorypattern.PC;
import com.bridgelabz.creational.factorypattern.Server;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		
		if("PC".equalsIgnoreCase(type)) {
			
			return new PC(ram, hdd, cpu);
		}
		else if("Server".equalsIgnoreCase(type)) {
			
			return new Server(ram, hdd, cpu);
		}
		
		return null;
	}
}
