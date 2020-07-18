package com.epam.factorypattern;

public class OsFactory {
	public Os getInstance(String str)
	{
		if(str.equals("Android"))
		{
			return new Android();
		}
		else if(str.equals("Windows"))
		{
	
		return new Windows();
		}
		else
		{
			return new Ios();
		}
		
	}

}
