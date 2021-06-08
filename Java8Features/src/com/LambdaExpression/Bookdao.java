package com.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Bookdao {
	
	List<Book> getBook(){
		List<Book> list=new ArrayList<>();
		list.add(new Book(1,"Java",12));
		list.add(new Book(2,"Hibernate",15));
		list.add(new Book(3,"PHP",17));
		list.add(new Book(4,"Spring",11));
		list.add(new Book(5,"Webservices",10));
		return list;
	}

}
