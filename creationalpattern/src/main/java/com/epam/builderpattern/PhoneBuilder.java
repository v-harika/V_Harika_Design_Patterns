package com.epam.builderpattern;

public class PhoneBuilder {
	private int battery;
	private double size;
	private int rom;
	private String os;
	
	
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public PhoneBuilder setSize(double size) {
		this.size = size;
		return this;
	}
	
	public PhoneBuilder setRom(int rom) {
		this.rom = rom;
		return this;
	}
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	

	public int getBattery() {
		return battery;
	}

	public double getSize() {
		return size;
	}

	public int getRom() {
		return rom;
	}

	public String getOs() {
		return os;
	}
	public phone getPhone()
	{
		return new phone(battery,size,rom,os);
	}
	
	
	

}
