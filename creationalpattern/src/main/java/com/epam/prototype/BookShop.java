package com.epam.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	private String shopname;
	List<Books> books = new ArrayList<>();
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public List<Books> getBooks() {
		return books;
	}
	public void setBooks(List<Books> books) {
		this.books = books;
	}
	
	@Override
	public String toString() {
		return "BookShop [shopname=" + shopname + ", books=" + books + "]";
	}
	public void loadData() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			Books b=new Books();
			b.setBid(i);
			b.setBname("Books"+i);
			getBooks().add(b);
		}
		
	}
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop shop =new BookShop();
		for(Books b:getBooks())
		{
			shop.getBooks().add(b);
		}
		
		return shop;
	}
	
	
	
	

}
