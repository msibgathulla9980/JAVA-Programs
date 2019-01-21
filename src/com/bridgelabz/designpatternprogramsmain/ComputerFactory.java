package com.bridgelabz.designpatternprogramsmain;

import com.bridgelabz.designpatternprograms.creational.Computer;
import com.bridgelabz.designpatternprograms.creational.PC;
import com.bridgelabz.designpatternprograms.creational.Server;

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
