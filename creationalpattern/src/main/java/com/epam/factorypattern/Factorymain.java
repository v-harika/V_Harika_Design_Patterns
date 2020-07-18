package com.epam.factorypattern;

public class Factorymain {

	public static void main(String[] args) {
		OsFactory obj1= new OsFactory();
		Os ob=obj1.getInstance("Android");
		ob.spec();
		

	}

}
