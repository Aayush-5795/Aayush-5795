package com.LambdaExpression;

public class Book {
	
	private int id;
	private String bookName;
	private int qty;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", qty=" + qty + "]";
	}
	public Book(int id, String bookName, int qty) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.qty = qty;
	}
	
	

}
