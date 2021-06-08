package com.LambdaExpression;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//By Using Comparator compareTo method sort asc/desc order string/int 
public class MyBookService{
	
	/*
	 * @Override public int compare(Book o1, Book o2) { return
	 * o2.getBookName().compareTo(o1.getBookName()); }
	 */
	
	
	public List<Book> getBooks(){
		List<Book> books=new Bookdao().getBook();
		Collections.sort(books,(o1,o2) -> o1.getBookName().compareTo(o2.getBookName()));
		return books;
	}
	
	public static void main(String[] args) {
		System.out.println(new MyBookService().getBooks());
	}
}

/*
 * class ComparatorDemo implements Comparator<Book> {
 * 
 * @Override public int compare(Book o1, Book o2) {
 * 
 * return o1.getBookName().compareTo(o2.getBookName()); }
 * 
 * }
 */
