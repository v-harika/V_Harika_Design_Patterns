package com.epam.builderpattern;

public class phone {
	private int battery;
	private double size;
	private int rom;
	private String os;
	public phone(int battery, double size, int rom, String os) {
		super();
		this.battery = battery;
		this.size = size;
		this.rom = rom;
		this.os = os;
	}
	public String toString() {
		return "phone [battery=" + battery + ", size=" + size + ", rom=" + rom + ", os=" + os + "]";
	}
	
	

}
