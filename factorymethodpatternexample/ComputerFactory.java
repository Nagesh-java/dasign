package com.hexaware.designpatternexample.factorymethodpatternexample;

public class ComputerFactory {
	
	public static computer getComputer(String type,String ram,String hdd,String cpu) {
		if("pc".equalsIgnoreCase(type))
			return new pc(ram,hdd,cpu);
		else
			if("Server".equalsIgnoreCase(type))
				return new Server(ram,hdd,cpu);
		return null;
		
	}

}
