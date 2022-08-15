package com.hexaware.designpatternexample.factorymethodpatternexample;

public class pc implements computer {
	
	private String ram;
	private String hdd;
	private String cpu;
	
	
	

	public pc(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return cpu;
	}

	@Override
	public String toString() {
		return "pc [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}
	
	
	
	

}
