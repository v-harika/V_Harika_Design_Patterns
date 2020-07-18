package com.epam.creationalpattern;

public class Singleton extends App {

	static Singleton obj =new Singleton();
	private Singleton()
	{
		
	}
	public static Singleton getInstance()
	{
		return obj;
		
	}
	public void run()
	
	{
		System.out.println("Singleton class");
	}

}
