package com.hexaware.designpatternexample.factorymethodpatternexample;

public class TestFactorypattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computer pc = ComputerFactory.getComputer("pc", "4 gb", "1 tb", "2.56 ghz");
		System.out.println("pc configuration = " + pc);
		computer Server = ComputerFactory.getComputer("server", "8 gb", "4 tb", "2.56 ghz");
		System.out.println("Server configuration = " + Server);


	}

}
