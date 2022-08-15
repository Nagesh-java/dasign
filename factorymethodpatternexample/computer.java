package com.hexaware.designpatternexample.factorymethodpatternexample;

public interface computer {
	//public, abstract,default,static,and strictfp;
	String getRAM();
	String getHDD();
	String getCPU();
	
	//From java8 we can add default and static implement methods
	public static String toStringValue(){
	return "returns values of computers";
	}
	public default String toPrint() {
		return "toPrint method is executed...";
	}
	
	
	
	


	

}
