package com.epam.prototype;

public class FirstClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop s=new BookShop();
		s.setShopname("Novelity");
		s.loadData();
		
		
		BookShop s1=(BookShop) s.clone();
		s.setShopname("A1");
		s.getBooks().remove(2);
		System.out.println(s);
		System.out.println(s1);

	}

}
