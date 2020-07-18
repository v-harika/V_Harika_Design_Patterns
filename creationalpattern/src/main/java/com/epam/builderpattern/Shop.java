package com.epam.builderpattern;

public class Shop {

	public static void main(String[] args) {
		phone p=new PhoneBuilder().setOs("Windows").getPhone();
		System.out.println(p);

	}

}
